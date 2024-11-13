/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import beans.Pessoa;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLClientInfoException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *  -DAO = Data Access Object ou Objeto de Acesso aos Dados
 *  -A classe PessoaDAO é responsável persistir os dados
 *  (inserção, edição, exclusão e pesquisa) da aplicação nas tabelas.
 *  -Resumindo, é ela que executará os códigos SQL no banco.
 *  -É importante que tenhamos também um DAO para cada tabela.
 * @author laboratorio
 */
public class PessoaDAO {
    private Conexao conexao;
    private Connection conn;

    public PessoaDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir (Pessoa pessoa){
        String sql = "INSERT INTO PESSOA (nome, sexo, idioma) VALUES (?,?,?)";
        //modelo para consulta SQL, onde define valores para os parametros na execucao
        //parametros definidos por '?'
        PreparedStatement stmt;
        try {
            stmt = this.conn.prepareStatement(sql); //prepara o comando SQL, o stmt fica pronto para receber valores que vão ser inseridos na base de dados
            stmt.setString(1, pessoa.getNome()); //Substitui o primeiro '?' pelo nome
            stmt.setString(2, pessoa.getSexo()); //Substitui o segundo '?' pelo sexo
            stmt.setString(3, pessoa.getIdioma());// Substitui o terceiro '?' pelo idioma
        
            stmt.execute(); //executa a consulta sql
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir pessoa: " + ex.getMessage());
        }
        
    }
    public void editar (Pessoa pessoa){
        try {
            String sql = "UPDATE PESSOA SET nome=?, sexo=?, idioma=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString (1,pessoa.getNome());
            stmt.setString (2,pessoa.getSexo());
            stmt.setString (3,pessoa.getIdioma());
            stmt.setInt (4,pessoa.getId());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar  pessoa: "+ex.getMessage());
        }
    }
    
    public void excluir (int id){
        try {
            String sql = "DELETE FROM PESSOA WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir pessoa: "+ ex.getMessage());
        }
        
    }
    /***
     * Método de select, utiliza o prepareStatement para receber os dados da consulta.
     * O ResultSet move o cursor ao longo da tabela com os resultados e ignora as mudancas feitas no BD apos o ResultSet ser criado
     * O ResultSet é atualizável, ou seja, permite modificar os dados diretamente no ResultSet, e essas mudanças podem ser refletidas no banco de dados.
     * @param id Id da pessoa específica a ser pesquisada
     * @return 
     */
    public List<Pessoa> getPessoas(){
        String sql = "SELECT * FROM Pessoa";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(); // Executa a consulta e armazena o resultado em rs
            List<Pessoa> listaPessoas = new ArrayList();
            while (rs.next()){
                Pessoa p = new Pessoa();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setIdioma(rs.getString("idioma"));
                p.setSexo(rs.getString("sexo"));
                listaPessoas.add(p);
            }
            return listaPessoas;
        }catch(SQLException ex){
            System.out.println("Erro ai : "+ex.getMessage());
            return null;
        }
    }
    
    /***
     * Método de select com where, utiliza o prepareStatement para receber os dados da consulta.
     * O ResultSet move o cursor ao longo da tabela com os resultados e ignora as mudancas feitas no BD apos o ResultSet ser criado
     * O ResultSet é atualizável, ou seja, permite modificar os dados diretamente no ResultSet, e essas mudanças podem ser refletidas no banco de dados.
     * Obtem o resultado da consulta (com stmt.executeQuery()) e armazena no resultSet.
     * Prepara o objeto pessoa que armazena a consulta.
     * @param id Id da pessoa específica a ser pesquisada
     * @return 
     */
    public Pessoa getPessoa (int id){ //passa o id como parametro
        String sql = "SELECT * FROM PESSOA WHERE id = ?";
        PreparedStatement stmt;
        try {
            stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            /*1º parametro é o sql
            2º parametro é o tipo do resultset: resultSet.TYPE_SCROLL_INSENSITIVE
            Mover o cursor para frente e para trás nas linhas do resultado.
            Ignorar mudanças feitas no banco de dados após o ResultSet ser criado.
            3º parametro é sobre os parametros de concorrencia - pode ser "read only" ou atualizavel
            */
            stmt.setInt (1,id);
            ResultSet rs = stmt.executeQuery(); //obtenho o resultado da consulta e armazeno no ResultSet
            Pessoa p = new Pessoa();//Preparo um objeto que vou armazenar a consulta
            //Primeiramente, vamos posicionar o retorno da consulta (ResultSet) na primeira posição da consulta
            //Em alguns casos, a consulta terá mais de um resultado de retorno
            rs.first();
            p.setId(id);
            p.setNome(rs.getString("nome"));
            p.setSexo (rs.getString("sexo"));
            p.setIdioma(rs.getString("idioma"));
            return p;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar pessoa:" + ex.getMessage());
            return null;
        }
    }    
}
    
