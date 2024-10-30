/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Beans.Categoria;
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
public class CategoriaDAO {
    private Conexao conexao;
    private Connection conn;

    public CategoriaDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir (Categoria categoria){
        try {
            String sql = "INSERT INTO categoria(nome) VALUES (?);";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1,categoria.getNome());
            
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir categoria:"+ex.getMessage());
        }
    } 
    
      public Categoria getCategoria(int id){
        
        try {
            String sql = "SELECT * FROM categoria WHERE id = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Categoria c = new Categoria();
            
            rs.first();
            c.setId(id);
            c.setNome(rs.getString("nome"));
            return c;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar categoria: "+ex.getMessage() );
            return null;
        }         
    }
    public void editar (Categoria categoria){
        try {
            String sql = "UPDATE categoria set nome = ? WHERE id = ?";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1,categoria.getNome());
            stmt.setInt(2, categoria.getId());
            
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar categoria:"+ex.getMessage());
        }
    } 
    
      public void excluir (int id){
        try {
            String sql = "DELETE FROM categoria WHERE id = ?";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir categoria:"+ex.getMessage());
        }
    } 

    public void excluir(Categoria c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public List<Categoria> getCategorias(){
        
        String sql = "SELECT * FROM categorias;";
        try {    
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = stmt.executeQuery();
            List<Categoria> listaCategorias = new ArrayList();
            
            while(rs.next()){
                Categoria c = new Categoria();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                listaCategorias.add(c);      
            }
            return listaCategorias;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar todas as categorias:"+ex.getMessage());
            return null;
        } 
    }  
}
