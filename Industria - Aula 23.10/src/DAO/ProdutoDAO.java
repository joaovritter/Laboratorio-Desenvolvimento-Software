/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Beans.Categoria;
import Beans.Produto;
import java.sql.Connection;
import Conexao.Conexao;
import java.util.List;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class ProdutoDAO {
    private Conexao conexao;
    private Connection conn;

    public ProdutoDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir (Produto produto){
        try {
            String sql = "INSERT INTO produto(nome, preco, quantidade, categoria_id) VALUES (?, ?, ?, ?);";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1,produto.getNome());
            stmt.setDouble(1,produto.getPreco());
            stmt.setInt(1,produto.getQnt());
            stmt.setInt(1,produto.getId_categoria().getId());
            
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir produto:"+ex.getMessage());
        }
    } 
    
      public Produto getProduto(int id){
        
        try {
            String sql = "SELECT * FROM produto WHERE id = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Produto p = new Produto();
            
            rs.first();
            p.setId(id);
            p.setNome(rs.getString("nome"));
            p.setPreco(rs.getDouble("preco"));
            p.setQnt(rs.getInt("quantidade"));
            CategoriaDAO cDAO = new CategoriaDAO();
            
            Categoria c = cDAO.getCategoria(rs.getInt("categoria_id"));
            p.setId_categoria(c);
            
            return p;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar produto: "+ex.getMessage() );
            return null;
        }         
    }
    public void editar (Produto produto){
        try {
            String sql = "UPDATE categoria set nome = ?, preco = ?, quantidade = ?, Id_categoria = ? WHERE id = ?";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1,produto.getNome());
            stmt.setInt(2, produto.getId());
            stmt.setDouble(3, produto.getPreco());
            stmt.setInt(4, produto.getQnt());
            stmt.setInt(5, produto.getId_categoria().getId());
            
            
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar produto:"+ex.getMessage());
        }
    } 
    
      public void excluir (int id){
        try {
            String sql = "DELETE FROM produto WHERE id = ?";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir produto:"+ex.getMessage());
        }
    } 

    public void excluir(Produto p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public List<Produto> getProduto(){
        
        String sql = "SELECT * FROM produto;";
        try {    
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = stmt.executeQuery();
            List<Produto> listaProduto = new ArrayList();
            
            while(rs.next()){
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setPreco(rs.getDouble("preco"));
                p.setQnt(rs.getInt("quantidade"));
                CategoriaDAO cDAO = new CategoriaDAO();
                
                Categoria c = cDAO.getCategoria(rs.getInt("id_categoria"));
                p.setId_categoria(c);
                listaProduto.add(p);      
            }
            return listaProduto;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar todas as produto:"+ex.getMessage());
            return null;
        } 
    } 
    
    public List<Produto> getProdutosNomeeCategoria(String nome, int Id_categoria) {
    String sql = "SELECT * FROM produtos WHERE nome LIKE ? AND categoria_id = ?";
    try {
        PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
        
        stmt.setString(1, "%" + nome + "%");
        stmt.setInt(2, Id_categoria); 
        
        ResultSet rs = stmt.executeQuery();
        List<Produto> listaProdutos = new ArrayList<>();

        while (rs.next()) {
            Produto p = new Produto();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            p.setPreco(rs.getDouble("preco"));
            p.setQnt(rs.getInt("quantidade"));

            Categoria c = new Categoria();
            c.setId(rs.getInt("categoria_id")); 
            p.setId_categoria(c);
            
            listaProdutos.add(p);
        }
        return listaProdutos;
    } catch (SQLException ex) {
        System.out.println("Erro ao consultar os produtos: " + ex.getMessage());
        return null; 
    }
    }
}
