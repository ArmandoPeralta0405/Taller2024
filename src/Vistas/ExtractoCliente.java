package Vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Liz
 */
public final class ExtractoCliente extends javax.swing.JInternalFrame {

    Modelos.ModCliente cli = new Modelos.ModCliente();

    Operaciones.OpeCliente daoCliente = new Operaciones.OpeCliente();

    ArrayList<Object[]> datos = new ArrayList<>();
    ArrayList<Object[]> datosCliente = new ArrayList<>();

    //VARIABLE QUE MANEJA QUE TIPOS DE OPERACIONES SE REALIZARAN: SI VA A SER ALTA, BAJA O MODIFICACION DEL REGISTRO
    String operacion = "";

    /**
     * Creates new form ExtractoCliente
     */
    public ExtractoCliente() {
        this.setTitle("FrmExtractoCliente");
        initComponents();
    }

    public void cargarExtracto() {
        DefaultTableModel modelo = (DefaultTableModel) tablaDatos.getModel();
        modelo.setRowCount(0);
        datos = daoCliente.obtenerExtracto(txtClienteCodigo.getText());
        for (Object[] obj : datos) {
            modelo.addRow(obj);
        }
        this.tablaDatos.setModel(modelo);
    }

    public void cargarCliente() {
        DefaultTableModel modelo = (DefaultTableModel) tablaDatosCliente.getModel();
        modelo.setRowCount(0);
        datosCliente = daoCliente.consultar(txtCriterioCliente.getText());
        for (Object[] obj : datosCliente) {
            modelo.addRow(obj);
        }
        this.tablaDatosCliente.setModel(modelo);
    }

    private void buscarCliente() {
        cargarCliente();
        BuscadorCliente.setModal(true);
        BuscadorCliente.setSize(820, 320);
        BuscadorCliente.setLocationRelativeTo(this);
        BuscadorCliente.setVisible(true);
        int fila = tablaDatosCliente.getSelectedRow();
        if (fila >= 0) {
            txtClienteCodigo.setText(tablaDatosCliente.getValueAt(fila, 0).toString());
            txtClienteDescripcion.setText(tablaDatosCliente.getValueAt(fila, 1).toString());
        } else {
            txtClienteCodigo.setText(null);
            txtClienteDescripcion.setText(null);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuscadorCliente = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtCriterioCliente = new org.jdesktop.swingx.JXTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaDatosCliente = new org.jdesktop.swingx.JXTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtClienteCodigo = new org.jdesktop.swingx.JXTextField();
        jLabel3 = new javax.swing.JLabel();
        txtClienteDescripcion = new org.jdesktop.swingx.JXTextField();
        txtClienteCedula = new org.jdesktop.swingx.JXTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtClienteRuc = new org.jdesktop.swingx.JXTextField();
        jLabel10 = new javax.swing.JLabel();
        txtClienteTelefono = new org.jdesktop.swingx.JXTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDatos = new org.jdesktop.swingx.JXTable();

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setBackground(new java.awt.Color(50, 104, 151));
        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("BUSCADOR DE CLIENTES");
        jLabel12.setOpaque(true);

        txtCriterioCliente.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtCriterioCliente.setPrompt("Aqui puede ingresar los filtros para la busqueda..");
        txtCriterioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCriterioClienteActionPerformed(evt);
            }
        });
        txtCriterioCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCriterioClienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCriterioClienteKeyTyped(evt);
            }
        });

        tablaDatosCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Identificador", "Nombre", "Cedula", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDatosCliente.setInheritsPopupMenu(true);
        tablaDatosCliente.setShowGrid(true);
        tablaDatosCliente.getTableHeader().setResizingAllowed(false);
        tablaDatosCliente.getTableHeader().setReorderingAllowed(false);
        tablaDatosCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosClienteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaDatosCliente);
        if (tablaDatosCliente.getColumnModel().getColumnCount() > 0) {
            tablaDatosCliente.getColumnModel().getColumn(0).setMinWidth(100);
            tablaDatosCliente.getColumnModel().getColumn(0).setPreferredWidth(100);
            tablaDatosCliente.getColumnModel().getColumn(0).setMaxWidth(100);
            tablaDatosCliente.getColumnModel().getColumn(2).setMinWidth(100);
            tablaDatosCliente.getColumnModel().getColumn(2).setPreferredWidth(100);
            tablaDatosCliente.getColumnModel().getColumn(2).setMaxWidth(100);
            tablaDatosCliente.getColumnModel().getColumn(3).setMinWidth(100);
            tablaDatosCliente.getColumnModel().getColumn(3).setPreferredWidth(100);
            tablaDatosCliente.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCriterioCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCriterioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout BuscadorClienteLayout = new javax.swing.GroupLayout(BuscadorCliente.getContentPane());
        BuscadorCliente.getContentPane().setLayout(BuscadorClienteLayout);
        BuscadorClienteLayout.setHorizontalGroup(
            BuscadorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BuscadorClienteLayout.setVerticalGroup(
            BuscadorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        jLabel1.setBackground(new java.awt.Color(0, 153, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formulario de Consultas de Extracto de Clientes");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtClienteCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtClienteCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtClienteCodigo.setPrompt("");
        txtClienteCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteCodigoActionPerformed(evt);
            }
        });
        txtClienteCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClienteCodigoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClienteCodigoKeyTyped(evt);
            }
        });

        jLabel3.setText("Código:");

        txtClienteDescripcion.setEditable(false);
        txtClienteDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtClienteDescripcion.setPrompt("");

        txtClienteCedula.setEditable(false);
        txtClienteCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtClienteCedula.setPrompt("");

        jLabel4.setText("Cédula:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setText("R.U.C.:");

        txtClienteRuc.setEditable(false);
        txtClienteRuc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtClienteRuc.setPrompt("");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel10.setText("Telefono:");

        txtClienteTelefono.setEditable(false);
        txtClienteTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtClienteTelefono.setPrompt("");

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Identificador", "N° Documento", "N° Timbrado", "Fecha", "Total Documento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDatos.setInheritsPopupMenu(true);
        tablaDatos.setShowGrid(true);
        tablaDatos.getTableHeader().setResizingAllowed(false);
        tablaDatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaDatos);
        if (tablaDatos.getColumnModel().getColumnCount() > 0) {
            tablaDatos.getColumnModel().getColumn(0).setMinWidth(100);
            tablaDatos.getColumnModel().getColumn(0).setPreferredWidth(100);
            tablaDatos.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClienteCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClienteDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClienteCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClienteRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtClienteTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtClienteCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtClienteDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtClienteRuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtClienteTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtClienteCedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCriterioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCriterioClienteActionPerformed
        cargarCliente();
    }//GEN-LAST:event_txtCriterioClienteActionPerformed

    private void txtCriterioClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCriterioClienteKeyPressed
        if (evt.VK_ESCAPE == evt.getKeyCode()) {
            txtClienteCodigo.setText(null);
            txtClienteDescripcion.setText(null);
            txtClienteCodigo.grabFocus();
            BuscadorCliente.dispose();
        }
    }//GEN-LAST:event_txtCriterioClienteKeyPressed

    private void txtCriterioClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCriterioClienteKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            evt.setKeyChar(Character.toUpperCase(c));
        }
        if (txtCriterioCliente.getText().length() == 100) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCriterioClienteKeyTyped

    private void tablaDatosClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosClienteMouseClicked
        if (evt.getClickCount() == 2) {
            if (tablaDatosCliente.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "SELECCIONE UNA FILA");
            } else {
                txtCriterioCliente.setText(null);
                BuscadorCliente.dispose();
            }
        }
    }//GEN-LAST:event_tablaDatosClienteMouseClicked

    private void txtClienteCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteCodigoActionPerformed
        if (txtClienteCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "NO PUEDE DEJAR EL CAMPO DE CLIENTE VACIO", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } else {
            int idcliente = Integer.parseInt(txtClienteCodigo.getText());
            cli.setIdcliente(idcliente);
            boolean resultado = daoCliente.consultarDatos(cli);
            if (resultado == true) {
                txtClienteDescripcion.setText(cli.getNombre() + ' ' + cli.getApellido());
                txtClienteCedula.setText(cli.getCedula());
                txtClienteRuc.setText(cli.getRuc());
                txtClienteTelefono.setText(cli.getTelefono());
                cargarExtracto();
            } else {
                txtClienteDescripcion.setText(null);
                txtClienteCedula.setText(null);
                txtClienteRuc.setText(null);
                txtClienteTelefono.setText(null);
                DefaultTableModel modelo = (DefaultTableModel) tablaDatos.getModel();
                modelo.setRowCount(0);
                this.tablaDatos.setModel(modelo);
                txtClienteCodigo.grabFocus();
            }
        }
    }//GEN-LAST:event_txtClienteCodigoActionPerformed

    private void txtClienteCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteCodigoKeyPressed
        if (evt.VK_F1 == evt.getKeyCode()) {
            buscarCliente();
        }
    }//GEN-LAST:event_txtClienteCodigoKeyPressed

    private void txtClienteCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteCodigoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
        if (txtClienteCodigo.getText().length() == 11) {
            evt.consume();
        }
    }//GEN-LAST:event_txtClienteCodigoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog BuscadorCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private org.jdesktop.swingx.JXTable tablaDatos;
    private org.jdesktop.swingx.JXTable tablaDatosCliente;
    private org.jdesktop.swingx.JXTextField txtClienteCedula;
    private org.jdesktop.swingx.JXTextField txtClienteCodigo;
    private org.jdesktop.swingx.JXTextField txtClienteDescripcion;
    private org.jdesktop.swingx.JXTextField txtClienteRuc;
    private org.jdesktop.swingx.JXTextField txtClienteTelefono;
    private org.jdesktop.swingx.JXTextField txtCriterioCliente;
    // End of variables declaration//GEN-END:variables
}
