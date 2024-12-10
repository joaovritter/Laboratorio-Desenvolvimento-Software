/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author salam
 */
import beans.Emprestimo;
import beans.Historico;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HistoricoDAO {

    private Connection connection;

    public HistoricoDAO(Connection connection) {
        this.connection = connection;
    }
    // Método para buscar todos os históricos de empréstimo
    public List<Historico> getHistoricos() {
        List<Historico> listaHistoricos = new ArrayList<>();
        String sql = "SELECT * FROM Historico";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Historico h = new Historico();
                EmprestimoDAO eDAO = new EmprestimoDAO();
                
                h.setId_historico(rs.getInt("id_historico"));      
                Emprestimo e = eDAO.getEmprestimo(rs.getInt("id_emprestimo"));               
                h.setEstado(rs.getString("estado"));
                h.setData_acao(rs.getString("data_acao"));
                
                listaHistoricos.add(h);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar históricos de empréstimo: " + ex.getMessage());
        }
        return listaHistoricos;
    }

    // Método para buscar um histórico de empréstimo pelo ID
    public Historico getHistorico(int id) {
        String sql = "SELECT * FROM Historico WHERE id_historico = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Historico h = new Historico();
                EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
                h.setId_historico(rs.getInt("id_historico"));
                Emprestimo e = emprestimoDAO.getEmprestimo(rs.getInt("id_emprestimo"));                
                h.setEstado(rs.getString("estado"));
                h.setData_acao(rs.getString("data_acao"));
                
                return h;
            } else {
                return null; // Histórico não encontrado
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar histórico de empréstimo: " + ex.getMessage());
            return null;
        }
    }
}

