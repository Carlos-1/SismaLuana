package view;

import controller.ConexaoPostgres;
import model.Cliente;
import modelDAO.ClienteDAO;

/**
 *
 * @author Carlos Barromeu
 */
public class ViewClientes extends javax.swing.JFrame {
 ConexaoPostgres conecta = new ConexaoPostgres();
    /**
     * Creates new form ViewClientes
     */
    public ViewClientes() {
        initComponents();
        conecta.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanelPesqCli = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btpesquisaCli = new javax.swing.JButton();
        txtcodCli = new javax.swing.JTextField();
        txtnome_clip = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3CadCli = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtnomeCli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtendCli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtnumCli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcompCli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtbairroCli = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtcidadeCli = new javax.swing.JTextField();
        txtufCli = new javax.swing.JTextField();
        txtcepCli = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtrgCli = new javax.swing.JFormattedTextField();
        txtcpfCli = new javax.swing.JFormattedTextField();
        txtcnpjCli = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txttelCli = new javax.swing.JTextField();
        txtcelCli = new javax.swing.JTextField();
        txtemailCli = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtdatacadCli = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro e Pesqquisa de Clientes");
        setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        setResizable(false);

        jPanelPesqCli.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa de Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Código:");

        btpesquisaCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/24x24/Find.png"))); // NOI18N
        btpesquisaCli.setMnemonic('P');
        btpesquisaCli.setToolTipText("PESQUISAR");
        btpesquisaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpesquisaCliActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanelPesqCliLayout = new javax.swing.GroupLayout(jPanelPesqCli);
        jPanelPesqCli.setLayout(jPanelPesqCliLayout);
        jPanelPesqCliLayout.setHorizontalGroup(
            jPanelPesqCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesqCliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesqCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPesqCliLayout.createSequentialGroup()
                        .addGroup(jPanelPesqCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtcodCli, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelPesqCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPesqCliLayout.createSequentialGroup()
                                .addComponent(txtnome_clip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btpesquisaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPesqCliLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addContainerGap())))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanelPesqCliLayout.setVerticalGroup(
            jPanelPesqCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesqCliLayout.createSequentialGroup()
                .addGroup(jPanelPesqCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPesqCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPesqCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtnome_clip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcodCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btpesquisaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPesqCliLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtcodCli, txtnome_clip});

        jPanel3CadCli.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastros de Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Endereço:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Número:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Complemento:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Bairro:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Cidade:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Estado:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("CEP:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("RG:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("CPF:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("CNPJ:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Telefone:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Celular:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("E- Mail");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/novo.png"))); // NOI18N
        jButton1.setToolTipText("NOVO");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/limpar2.jpg"))); // NOI18N
        jButton4.setToolTipText("LIMPAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/24x24/Cut.png"))); // NOI18N
        jButton5.setToolTipText("EXCLUIR");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/24x24/Save.png"))); // NOI18N
        jButton6.setToolTipText("SALVAL");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Data de Cadastro");

        txtdatacadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdatacadCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3CadCliLayout = new javax.swing.GroupLayout(jPanel3CadCli);
        jPanel3CadCli.setLayout(jPanel3CadCliLayout);
        jPanel3CadCliLayout.setHorizontalGroup(
            jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnomeCli)
                    .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                        .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                                .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtendCli)
                                    .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(120, 120, 120)
                                .addComponent(jLabel8)
                                .addGap(84, 84, 84)))
                        .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnumCli, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtcompCli, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                        .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtbairroCli, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                                .addComponent(txtcidadeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtufCli, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtcepCli, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                        .addComponent(txttelCli, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcelCli, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtemailCli))
                    .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                        .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                                .addComponent(txtrgCli)
                                .addGap(14, 14, 14)
                                .addComponent(txtcpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(99, 99, 99)
                                .addComponent(jLabel15)))
                        .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcnpjCli)
                                    .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(34, 34, 34)
                .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                        .addComponent(txtdatacadCli)
                        .addContainerGap())))
        );
        jPanel3CadCliLayout.setVerticalGroup(
            jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addComponent(txtnomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtendCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcompCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbairroCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcidadeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtufCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcepCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrgCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcnpjCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcelCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemailCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3CadCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton4)
                                .addComponent(jButton5))))
                    .addGroup(jPanel3CadCliLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtdatacadCli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(19, 19, 19))
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/24x24/Abort.png"))); // NOI18N
        jButton2.setToolTipText("SAIR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3CadCli, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanelPesqCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanelPesqCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3CadCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(527, 606));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btpesquisaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpesquisaCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btpesquisaCliActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         Cliente cliente = new Cliente();
         cliente.setNome_cli("");
         cliente.setEndereco_cli("");
         cliente.setNumero_cli("");
         cliente.setComp_cli("");
         cliente.setCep_cli("");
         cliente.setBairro_cli("");
         cliente.setCidade_cli("");
    
   ClienteDAO cliDao = new ClienteDAO();
    cliDao.cadastrar(cliente);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtdatacadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdatacadCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdatacadCliActionPerformed

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
            java.util.logging.Logger.getLogger(ViewClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btpesquisaCli;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3CadCli;
    private javax.swing.JPanel jPanelPesqCli;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbairroCli;
    private javax.swing.JTextField txtcelCli;
    private javax.swing.JTextField txtcepCli;
    private javax.swing.JTextField txtcidadeCli;
    private javax.swing.JFormattedTextField txtcnpjCli;
    private javax.swing.JTextField txtcodCli;
    private javax.swing.JTextField txtcompCli;
    private javax.swing.JFormattedTextField txtcpfCli;
    private javax.swing.JFormattedTextField txtdatacadCli;
    private javax.swing.JTextField txtemailCli;
    private javax.swing.JTextField txtendCli;
    private javax.swing.JTextField txtnomeCli;
    private javax.swing.JTextField txtnome_clip;
    private javax.swing.JTextField txtnumCli;
    private javax.swing.JFormattedTextField txtrgCli;
    private javax.swing.JTextField txttelCli;
    private javax.swing.JTextField txtufCli;
    // End of variables declaration//GEN-END:variables
}
