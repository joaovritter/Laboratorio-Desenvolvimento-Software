/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexao.Conexao;
import beans.Usuario;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLClientInfoException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *  -DAO = Data Access Object ou Objeto de Acesso aos Dados
 *  -A classe UsuarioDAO é responsável persistir os dados
 *  (inserção, edição, exclusão e pesquisa) da aplicação nas tabelas.
 *  -Resumindo, é ela que executará os códigos SQL no banco.
 *  -É importante que tenhamos também um DAO para cada tabela.
 * @author laboratorio
 */
public class UsuarioDAO {
    private Conexao conexao;
    private Connection conn;

    public UsuarioDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir (Usuario usuario){
        String sql = "INSERT INTO Usuario (nome, matricula, contato) VALUES (?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = this.conn.prepareStatement(sql); //prepara o comando SQL, o stmt fica pronto para receber valores que vão ser inseridos na base de dados
            stmt.setString(1, usuario.getNome()); 
            stmt.setString(2, usuario.getMatricula()); 
            stmt.setString(3, usuario.getContato());
            stmt.execute(); //executa a consulta sql
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir usuario: " + ex.getMessage());
        }
        
    }
    public void editar (Usuario usuario){
        try {
            String sql = "UPDATE Usuario SET nome=?, matricula=?, contato=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString (1,usuario.getNome());
            stmt.setString (2,usuario.getMatricula());
            stmt.setString (3,usuario.getContato());
            stmt.setInt (4,usuario.getId());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar  usuario: "+ex.getMessage());
        }
    }
    
    public void excluir (int id){
        try {
            String sql = "DELETE FROM Usuario WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir usuario: "+ ex.getMessage());
        }
        
    }
    /***
     * Método de select, utiliza o prepareStatement para receber os dados da consulta.
     * @param id Id do usuario específico a ser pesquisado
     * @return 
     */
    public List<Usuario> getUsuarios(){
        String sql = "SELECT * FROM Usuario";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(); // Executa a consulta e armazena o resultado em rs
            List<Usuario> listaUsuarios = new ArrayList();
            while (rs.next()){
                Usuario u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setNome(rs.getString("nome"));
                u.setMatricula(rs.getString("matricula"));
                u.setContato(rs.getString("contato"));
                listaUsuarios.add(u);
            }
            return listaUsuarios;
        }catch(SQLException ex){
            System.out.println("Erro ai : "+ex.getMessage());
            return null;
        }
    }
    
    /***
     * Método de select com where, utiliza o prepareStatement para receber os dados da consulta.
     * Obtem o resultado da consulta (com stmt.executeQuery()) e armazena no resultSet.
     * Prepara o objeto usuario que armazena a consulta.
     * @param id Id do usuario específica a ser pesquisada
     * @return 
     */
    public Usuario getUsuario (int id){ //passa o id como parametro
        String sql = "SELECT * FROM Usuario WHERE id = ?";
        PreparedStatement stmt;
        try {
            stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            stmt.setInt (1,id);
            ResultSet rs = stmt.executeQuery(); 
            Usuario p = new Usuario();
           
            rs.first();
            p.setId(id);
            p.setNome(rs.getString("nome"));
            p.setMatricula (rs.getString("matricula"));
            p.setContato(rs.getString("contato"));
            return p;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar usuario:" + ex.getMessage());
            return null;
        }
    }    
}
    
