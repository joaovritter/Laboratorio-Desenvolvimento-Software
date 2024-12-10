package interfaces;

public class CadastroItens extends javax.swing.JFrame {

    public CadastroItens() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_GrpEstado = new javax.swing.ButtonGroup();
        jblCadastro = new javax.swing.JLabel();
        jblNome = new javax.swing.JLabel();
        jblCategoria = new javax.swing.JLabel();
        jblEstado = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        Rdo_BtnDisponivel = new javax.swing.JRadioButton();
        Rdio_BtnEmprestado = new javax.swing.JRadioButton();
        CmbCategoria = new javax.swing.JComboBox<>();
        BtnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jblCadastro.setBackground(new java.awt.Color(0, 0, 0));
        jblCadastro.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jblCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblCadastro.setText("Cadastro");

        jblNome.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        jblNome.setText("Nome:");

        jblCategoria.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        jblCategoria.setText("Categoria:");

        jblEstado.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        jblEstado.setText("Estado:");

        Btn_GrpEstado.add(Rdo_BtnDisponivel);
        Rdo_BtnDisponivel.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        Rdo_BtnDisponivel.setText("Disponível");

        Btn_GrpEstado.add(Rdio_BtnEmprestado);
        Rdio_BtnEmprestado.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        Rdio_BtnEmprestado.setText("Emprestado");

        CmbCategoria.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        CmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha", "Chave", "Controle", "Caneta" }));

        BtnCadastrar.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        BtnCadastrar.setText("Cadastrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jblCadastro)
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jblCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jblEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Rdo_BtnDisponivel)
                                .addGap(18, 18, 18)
                                .addComponent(Rdio_BtnEmprestado)))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addComponent(BtnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jblCadastro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jblNome)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblCategoria)
                            .addComponent(CmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblEstado)
                            .addComponent(Rdo_BtnDisponivel)
                            .addComponent(Rdio_BtnEmprestado)))
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCadastrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroItens().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastrar;
    private javax.swing.ButtonGroup Btn_GrpEstado;
    private javax.swing.JComboBox<String> CmbCategoria;
    private javax.swing.JRadioButton Rdio_BtnEmprestado;
    private javax.swing.JRadioButton Rdo_BtnDisponivel;
    private javax.swing.JLabel jblCadastro;
    private javax.swing.JLabel jblCategoria;
    private javax.swing.JLabel jblEstado;
    private javax.swing.JLabel jblNome;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
