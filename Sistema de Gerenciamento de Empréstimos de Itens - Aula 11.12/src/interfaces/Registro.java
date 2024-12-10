package interfaces;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grp_BtnRegistro = new javax.swing.ButtonGroup();
        JblRegistro = new javax.swing.JLabel();
        JblNome = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        JblSelecione = new javax.swing.JLabel();
        Rda_BtnEmprestimo = new javax.swing.JRadioButton();
        Rda_BtnDevolucao = new javax.swing.JRadioButton();
        BtnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JblRegistro.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        JblRegistro.setText("Registro");

        JblNome.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        JblNome.setText("Nome:");

        JblSelecione.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        JblSelecione.setText("Selecione:");

        Grp_BtnRegistro.add(Rda_BtnEmprestimo);
        Rda_BtnEmprestimo.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        Rda_BtnEmprestimo.setText("Empréstimo");

        Grp_BtnRegistro.add(Rda_BtnDevolucao);
        Rda_BtnDevolucao.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        Rda_BtnDevolucao.setText("Devolução");

        BtnRegistrar.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        BtnRegistrar.setText("Registrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JblSelecione)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Rda_BtnEmprestimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Rda_BtnDevolucao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNome)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JblRegistro)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(JblRegistro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JblNome)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JblSelecione)
                    .addComponent(Rda_BtnEmprestimo)
                    .addComponent(Rda_BtnDevolucao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnRegistrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.ButtonGroup Grp_BtnRegistro;
    private javax.swing.JLabel JblNome;
    private javax.swing.JLabel JblRegistro;
    private javax.swing.JLabel JblSelecione;
    private javax.swing.JRadioButton Rda_BtnDevolucao;
    private javax.swing.JRadioButton Rda_BtnEmprestimo;
    private javax.swing.JTextField TxtNome;
    // End of variables declaration//GEN-END:variables
}
