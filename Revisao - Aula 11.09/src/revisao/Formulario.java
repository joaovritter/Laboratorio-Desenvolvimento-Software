/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package revisao;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author João Capudo
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnG_PA = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        txt_Nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_DataNasc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Sexo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Cpf = new javax.swing.JTextField();
        txt_Endereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_Matricula = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_Area = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_Alocacao = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_Curso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Professor = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Aluno = new javax.swing.JTable();
        rdo_Professor = new javax.swing.JRadioButton();
        rdo_Aluno = new javax.swing.JRadioButton();
        btn_Salvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Nome");

        txt_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Data Nasc");

        jLabel5.setText("Sexo");

        jLabel6.setText("Cpf");

        txt_Endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EnderecoActionPerformed(evt);
            }
        });

        jLabel7.setText("Endereco");

        jLabel8.setText("Matricula");

        jLabel9.setText("Area Form");

        txt_Area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AreaActionPerformed(evt);
            }
        });

        jLabel10.setText("Alocacao");

        jLabel16.setText("Curso");

        txt_Curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CursoActionPerformed(evt);
            }
        });

        tbl_Professor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "DataNasc", "Sexo", "Cpf", "Endereco", "Matricula", "Area Form", "Alocacao"
            }
        ));
        jScrollPane1.setViewportView(tbl_Professor);

        tbl_Aluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Data Nasc", "Sexo", "Cpf", "Endereco", "Matricula", "Curso"
            }
        ));
        jScrollPane2.setViewportView(tbl_Aluno);

        btnG_PA.add(rdo_Professor);
        rdo_Professor.setText("Professor");
        rdo_Professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_ProfessorActionPerformed(evt);
            }
        });

        btnG_PA.add(rdo_Aluno);
        rdo_Aluno.setText("Aluno");
        rdo_Aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_AlunoActionPerformed(evt);
            }
        });

        btn_Salvar.setText("Salvar");
        btn_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalvarActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecionar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(rdo_Professor)
                        .addGap(18, 18, 18)
                        .addComponent(rdo_Aluno))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addGap(28, 28, 28)
                        .addComponent(txt_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_DataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txt_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_Endereco))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(2, 2, 2)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_Area, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                            .addComponent(txt_Alocacao)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(btn_Salvar)))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdo_Professor)
                    .addComponent(rdo_Aluno)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_DataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_Area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_Alocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(btn_Salvar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NomeActionPerformed

    private void txt_EnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EnderecoActionPerformed

    private void txt_AreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AreaActionPerformed

    private void txt_CursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CursoActionPerformed

    private void rdo_ProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_ProfessorActionPerformed
         txt_Curso.setVisible(false);
        
         txt_Area.setVisible(true);
         txt_Alocacao.setVisible(true);
        
    }//GEN-LAST:event_rdo_ProfessorActionPerformed

    private void rdo_AlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_AlunoActionPerformed
            txt_Area.setVisible(false);
            txt_Alocacao.setVisible(false);
            
            txt_Curso.setVisible(true);

    }//GEN-LAST:event_rdo_AlunoActionPerformed

    private void btn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalvarActionPerformed
        // Obtém o modelo da tabela para professores e alunos a partir dos componentes da interface gráfica
        DefaultTableModel tabelaProfessor = (DefaultTableModel) tbl_Professor.getModel();
        DefaultTableModel tabelaAluno = (DefaultTableModel) tbl_Aluno.getModel();

        // Verifica se a opção "Professor" está selecionada
        if (rdo_Professor.isSelected()) {
            // Cria um novo objeto Professor com os dados preenchidos nos campos de texto
            Professor p = new Professor(
                txt_Nome.getText(),       // Nome do professor
                txt_DataNasc.getText(),   // Data de nascimento do professor
                txt_Sexo.getText(),       // Sexo do professor
                txt_Cpf.getText(),        // CPF do professor
                txt_Endereco.getText(),   // Endereço do professor
                txt_Matricula.getText(),  // Matrícula do professor
                txt_Area.getText(),       // Área de especialização do professor
                txt_Alocacao.getText()    // Local de alocação do professor
            );
            // Cria uma lista para armazenar os objetos Professor
            ArrayList<Professor> listaProfessor = new ArrayList<>();
            // Adiciona o novo professor à lista
            listaProfessor.add(p);
            // Percorre a lista de professores e adiciona cada um à tabela da interface gráfica
            for (Professor professor : listaProfessor) {
                tabelaProfessor.addRow(professor.obterDados()); // Adiciona a linha na tabela usando os dados do professor
            }
            // Exibe uma mensagem na tela, utilizando o retorno do método executaAcao do objeto Professor
            JOptionPane.showMessageDialog(null, p.executaAcao());
        }
        // Verifica se a opção "Aluno" está selecionada
        
        if (rdo_Aluno.isSelected()) { 
            // Cria um novo objeto Aluno com os dados preenchidos nos campos de texto
            Aluno a = new Aluno(
                txt_Nome.getText(),       // Nome do aluno
                txt_DataNasc.getText(),   // Data de nascimento do aluno
                txt_Sexo.getText(),       // Sexo do aluno
                txt_Cpf.getText(),        // CPF do aluno
                txt_Endereco.getText(),   // Endereço do aluno
                txt_Matricula.getText(),  // Matrícula do aluno
                txt_Curso.getText()       // Curso do aluno
            );

            // Cria uma lista para armazenar os objetos Aluno
            ArrayList<Aluno> listaAluno = new ArrayList<>();
            // Adiciona o novo aluno à lista
            listaAluno.add(a);

            // Percorre a lista de alunos e adiciona cada um à tabela da interface gráfica
            for (Aluno aluno : listaAluno) {
                tabelaAluno.addRow(aluno.obterDados()); // Adiciona a linha na tabela usando os dados do aluno
            }
            // Exibe uma mensagem na tela, utilizando o retorno do método executaAcao do objeto Aluno
            JOptionPane.showMessageDialog(null, a.executaAcao());
        }

           
    }//GEN-LAST:event_btn_SalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnG_PA;
    private javax.swing.JButton btn_Salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdo_Aluno;
    private javax.swing.JRadioButton rdo_Professor;
    private javax.swing.JTable tbl_Aluno;
    private javax.swing.JTable tbl_Professor;
    private javax.swing.JTextField txt_Alocacao;
    private javax.swing.JTextField txt_Area;
    private javax.swing.JTextField txt_Cpf;
    private javax.swing.JTextField txt_Curso;
    private javax.swing.JTextField txt_DataNasc;
    private javax.swing.JTextField txt_Endereco;
    private javax.swing.JTextField txt_Matricula;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_Sexo;
    // End of variables declaration//GEN-END:variables
}
