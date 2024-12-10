package interfaces;

public class ConsultaHistorico extends javax.swing.JFrame {

    public ConsultaHistorico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grp_BtnConsulta = new javax.swing.ButtonGroup();
        JblConsulta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblConsulta = new javax.swing.JTable();
        JblNome = new javax.swing.JLabel();
        JblSelecione = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        JblMatricula = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        TxtMatricula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JblConsulta.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        JblConsulta.setText("Consulta");

        TblConsulta.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        TblConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Data", "Hora", "Quem / O que"
            }
        ));
        jScrollPane1.setViewportView(TblConsulta);

        JblNome.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        JblNome.setText("Nome:");
        JblNome.setToolTipText("");

        JblSelecione.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        JblSelecione.setText("Selecione:");

        Grp_BtnConsulta.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        jRadioButton1.setText("Usuário");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        Grp_BtnConsulta.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        jRadioButton2.setText("Item");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        JblMatricula.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        JblMatricula.setText("Matrícula:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JblSelecione)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JblMatricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(JblConsulta)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JblNome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JblConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JblSelecione)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JblNome)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JblMatricula)
                    .addComponent(TxtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        TxtNome.setEnabled(false);
        TxtMatricula.setEnabled(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        TxtNome.setEnabled(true);
        TxtMatricula.setEnabled(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaHistorico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grp_BtnConsulta;
    private javax.swing.JLabel JblConsulta;
    private javax.swing.JLabel JblMatricula;
    private javax.swing.JLabel JblNome;
    private javax.swing.JLabel JblSelecione;
    private javax.swing.JTable TblConsulta;
    private javax.swing.JTextField TxtMatricula;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
