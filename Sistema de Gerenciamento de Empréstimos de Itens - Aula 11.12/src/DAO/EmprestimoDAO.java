/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexao.Conexao;
import beans.Emprestimo;
import beans.Item;
import beans.Usuario;
import beans.View_HistoricoEmprestimo;
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
public class EmprestimoDAO {
    private Conexao conexao;
    private Connection conn;

    public EmprestimoDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir (Emprestimo emprestimo){
        String sql = "INSERT INTO Emprestimo (id_item, id_usuario, data_emprestimo, data_vencimento, estado) VALUES (?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = this.conn.prepareStatement(sql); //prepara o comando SQL, o stmt fica pronto para receber valores que vão ser inseridos na base de dados
            stmt.setInt(1, emprestimo.getId_item().getId()); 
            stmt.setInt(2, emprestimo.getId_usuario().getId()); 
            stmt.setString(3, emprestimo.getData_emprestimo());
            stmt.setString(4, emprestimo.getData_vencimento());
            stmt.setString(5, emprestimo.getEstado());
            stmt.execute(); //executa a consulta sql
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir usuario: " + ex.getMessage());
        }
        
    }
    
    public void editar (Emprestimo emprestimo){
        try {
            String sql = "UPDATE emprestimo SET id_item=?, id_usuario=?, date_emprestimo=?, date_vencimento=?, estado=? , WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, emprestimo.getId_item().getId()); 
            stmt.setInt(2, emprestimo.getId_usuario().getId()); 
            stmt.setString(3, emprestimo.getData_emprestimo());
            stmt.setString(4, emprestimo.getData_vencimento());
            stmt.setString(5, emprestimo.getEstado());
            stmt.execute(); //executa a consulta sql
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar emprestimo: "+ex.getMessage());
        }
    }
    
    public void excluir (int id){
        try {
            String sql = "DELETE FROM Emprestimo WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir emprestimo: "+ ex.getMessage());
        }
        
    }
    /***
     * Método de select (seleciona todos registros), utiliza o prepareStatement para receber os dados da consulta.
     * @return 
     */
    public List<Emprestimo> getEmprestimos(){
        String sql = "SELECT * FROM Emprestimo";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(); // Executa a consulta e armazena o resultado em rs
            List<Emprestimo> listaEmprestimos = new ArrayList();
            while (rs.next()){
                Emprestimo e = new Emprestimo();
                
                ItemDAO iDAO = new ItemDAO();
                UsuarioDAO uDAO = new UsuarioDAO();
                
                e.setId(rs.getInt("id"));
                Item i = iDAO.getItem(rs.getInt("id_item"));
                Usuario u = uDAO.getUsuario(rs.getInt("id_usuario"));
                e.setData_emprestimo(rs.getString("data_emprestimo"));
                e.setData_vencimento(rs.getString("data_vencimento"));
                e.setEstado(rs.getString("estado"));
                
                listaEmprestimos.add(e);
            }
            return listaEmprestimos;
        }catch(SQLException ex){
            System.out.println("Erro ai : "+ex.getMessage());
            return null;
        }
    }
    
    /***
     * Método do select com where id
     * Prepara o objeto usuario que armazena a consulta.
     * @param id Id do usuario específica a ser pesquisada
     * @return 
     */
    public Emprestimo getEmprestimo (int id){ //passa o id como parametro
        String sql = "SELECT * FROM Emprestimo WHERE id = ?";
        PreparedStatement stmt;
        try {
            stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            stmt.setInt (1,id);
            ResultSet rs = stmt.executeQuery(); 
            Emprestimo e = new Emprestimo();
            ItemDAO iDAO = new ItemDAO();
            UsuarioDAO uDAO = new UsuarioDAO();
            
            rs.first();
            e.setId(id);
            e.setId(rs.getInt("id"));
            Item i = iDAO.getItem(rs.getInt("id_item"));
            Usuario u = uDAO.getUsuario(rs.getInt("id_usuario"));
            e.setData_emprestimo(rs.getString("data_emprestimo"));
            e.setData_vencimento(rs.getString("data_vencimento"));
            e.setEstado(rs.getString("estado"));
            return e;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar emprestimo:" + ex.getMessage());
            return null;
        }
    }
    
    // Método para chamar a procedure RelatorioItensMaisEmprestados
    public List<Emprestimo> procedureRelatorioItensMaisEmprestados() {
        String sql = "{CALL RelatorioItensMaisEmprestados()}";  // Chama a procedure no banco
        try {
            CallableStatement stmt = conn.prepareCall(sql); //chama procedure
            ResultSet rs = stmt.executeQuery(); // Executa a chamada da procedure e armazena o resultado
            
            List<Emprestimo> listaEmprestimos = new ArrayList<>();
            while (rs.next()) {
                Emprestimo e = new Emprestimo();
                
                // Preenche o objeto Emprestimo com os dados retornados pela procedure
                ItemDAO iDAO = new ItemDAO();
                Item i = iDAO.getItem(rs.getInt("id_item"));
                e.setEstado(rs.getString("QuantidadeEmprestimos"));  // Aqui pode ser ajustado conforme a necessidade, por exemplo, uma nova classe para representar o relatório
                
                listaEmprestimos.add(e);
            }
            return listaEmprestimos;
        } catch (SQLException ex) {
            System.out.println("Erro ao chamar o relatório de itens mais emprestados: " + ex.getMessage());
            return null;
        }
    }
    
   // Método para chamar a procedure RelatorioItensAtrasados
   public List<Item> procedureItensAtrasados() {
        String sql = "{CALL RelatorioItensAtrasados()}";  // Chama a stored procedure
        
        try {
            CallableStatement stmt = conn.prepareCall(sql);
            ResultSet rs = stmt.executeQuery();  // Executa a consulta
            
            List<Item> itensAtrasados = new ArrayList<>();
            
            while (rs.next()) {
                Item item = new Item();
                item.setNome(rs.getString("Item"));
                
                System.out.println("Responsável: " + rs.getString("Responsavel"));
                System.out.println("Item: " + rs.getString("Item"));
                System.out.println("Empréstimo: " + rs.getTimestamp("Emprestimo"));
                System.out.println("Vencimento: " + rs.getTimestamp("Vencimento"));
                System.out.println("Dias de Atraso: " + rs.getInt("DiasAtraso"));
                itensAtrasados.add(item);
            }
            return itensAtrasados;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar itens atrasados: " + ex.getMessage());
            return null;
        }
    }
   
   public List<View_HistoricoEmprestimo> vw_HistoricoEmprestimos() throws SQLException {
        List<View_HistoricoEmprestimo> ListaViewHistoricoEmprestimos = new ArrayList<>();
        String query = "SELECT * FROM vw_historico_emprestimos";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                View_HistoricoEmprestimo historicoEmprestimo = new View_HistoricoEmprestimo();
                historicoEmprestimo.setIdHistorico(rs.getInt("Historico"));
                historicoEmprestimo.setIdEmprestimo(rs.getInt("Emprestimos"));
                historicoEmprestimo.setResponsavel(rs.getString("Responsavel"));
                historicoEmprestimo.setItem(rs.getString("Item"));
                historicoEmprestimo.setStatus(rs.getString("Status"));
                historicoEmprestimo.setDataAtualizacao(rs.getDate("Atualizacao"));
                ListaViewHistoricoEmprestimos.add(historicoEmprestimo);
            }
        }
        return ListaViewHistoricoEmprestimos;
    }
}
    
