/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import beans.Produto;
import java.util.List;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLClientInfoException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *  -DAO = Data Access Object ou Objeto de Acesso aos Dados
 *  -A classe AlunoDAO é responsável persistir os dados
 *  (inserção, edição, exclusão e pesquisa) da aplicação nas tabelas.
 *  -Resumindo, é ela que executará os códigos SQL no banco.
 *  -É importante que tenhamos também um DAO para cada tabela.
 * @author laboratorio
 */
public class ProdutoDAO {
    private Conexao conexao;
    private Connection conn;

    public ProdutoDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir (Produto produto){
        String sql = "INSERT INTO PRODUTO (nome, codigo, descricao, preco, quantidade) VALUES (?,?,?,?,?)";
        
        PreparedStatement stmt;
        try {
            stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getCodigo());
            stmt.setString(3, produto.getDescricao());
            stmt.setString(4, produto.getPreco());
            stmt.setString(5, produto.getQuantidade());
        
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir produto: " + ex.getMessage());
        }     
    }    
    
    public List<Produto> getProdutos(){
        String sql = "SELECT * FROM PRODUTO";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery();
            List<Produto> listaProdutos = new ArrayList();
            while (rs.next()){
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setCodigo(rs.getString("codigo"));
                p.setDescricao(rs.getString("descricao"));
                p.setPreco(rs.getString("preco"));
                p.setQuantidade(rs.getString("quantidade"));
                listaProdutos.add(p);
            }
            return listaProdutos;
        }catch(SQLException ex){
            System.out.println("Erro ai : "+ex.getMessage());
            return null;
        }
    }
    
    public Produto getProduto (int id){
        String sql = "SELECT * FROM PRODUTO WHERE id = ?";        
        try{
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setInt(1, id);  
            ResultSet rs = stmt.executeQuery();
            Produto p = new Produto();
            rs.first();
            p.setId(id);
            p.setNome(rs.getString("nome"));
            p.setCodigo(rs.getString("codigo"));
            p.setDescricao(rs.getString("descricao"));
            p.setPreco(rs.getString("preco"));
            p.setQuantidade(rs.getString("quantidade"));
            return p;
        }

        catch(SQLException ex){
            System.out.println("Erro ao consultar produto "+ex.getMessage());
            return null;
        }
    }
    public List<Produto> getProdutosCodigo(String codigo){
        String sql = "SELECT * FROM PRODUTO WHERE codigo LIKE ? ";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setString(1, "%"+codigo+"%");
            ResultSet rs = stmt.executeQuery();
            List<Produto> listaProdutos = new ArrayList();
            while (rs.next()){
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setCodigo(rs.getString("codigo"));
                p.setDescricao(rs.getString("descricao"));
                p.setPreco(rs.getString("preco"));
                p.setQuantidade(rs.getString("quantidade"));
                listaProdutos.add(p);
            }
            return listaProdutos;
        }catch(SQLException ex){
            System.out.println("Erro ai : "+ex.getMessage());
            return null;
        }
    }
       
}