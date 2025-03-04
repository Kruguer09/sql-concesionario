/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vista;

import controlador.Acceso;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Rueda;

/**
 * Menú que permite añadir neumáticos a la base de datos
 * @author USER
 */
public class MenuAlta extends javax.swing.JDialog {

    private Acceso modelo=new Acceso();

    /**
     * Creates new form MenuAlta
     */
    public MenuAlta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Menú alta Ruedas");
        ImageIcon imgIcono = new ImageIcon("src/faviconRueda.png");
        setIconImage(imgIcono.getImage());
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tDiametro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tModelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tAncho = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbPerfil = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbIc = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbIv = new javax.swing.JComboBox<>();
        btGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btCancelar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(255, 0, 51));
        btCancelar.setText("CANCELAR");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Código:");

        jLabel3.setText("Marca:");

        jLabel4.setText("Modelo:");

        jLabel5.setText("Ancho: ");

        jLabel6.setText("Perfil:");

        jLabel7.setText("IC: ");

        jLabel8.setText("Diámetro:");

        cbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALTO", "MEDIO", "BAJO" }));

        jLabel9.setText("IV:");

        cbIc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "70", "71", "72", "73", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120" }));

        jLabel10.setText("Precio: ");

        cbIv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "H", "N", "Q", "R", "S", "T", "V", "W", "Y" }));
        cbIv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIvActionPerformed(evt);
            }
        });

        btGuardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btGuardar.setForeground(new java.awt.Color(51, 255, 51));
        btGuardar.setText("GUARDAR");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("         NUEVO NEUMÁTICO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tAncho, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbIc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbIv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tDiametro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(tMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tDiametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(tModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbIc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(tAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbIv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(tPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardar)
                    .addComponent(btCancelar))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        int confirmacion;
        try {
            double numero = Double.parseDouble(tCodigo.getText());
            // Si llegamos aquí, el contenido es un número válido
            try {
                double numero2 = Double.parseDouble(tPrecio.getText());
                // Si llegamos aquí, el contenido es un número válido
                if (tCodigo.getText().isEmpty() || tMarca.getText().isEmpty() || tModelo.getText().isEmpty() || tAncho.getText().isEmpty() || tDiametro.getText().isEmpty() || tPrecio.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Errores en los datos o campos vacíos", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (modelo.openConnection() == 1) {
                        confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro que quiere agregar '"
                                + tMarca.getText() + " " + tModelo.getText() + "'?", "¡Atención", JOptionPane.YES_NO_OPTION);
                        if (JOptionPane.YES_OPTION == confirmacion) {
                            Rueda r = new Rueda();
                            r.setiCodigo(Integer.parseInt(tCodigo.getText()));
                            r.setsMarca(tMarca.getText());
                            r.setsModelo(tModelo.getText());
                            r.setiAncho(Integer.parseInt(tAncho.getText()));
                            r.setePerfil(cbPerfil.getSelectedItem().toString());
                            r.setdDiamtro(Double.parseDouble(tDiametro.getText()));
                            r.setiIC(Integer.parseInt(cbIc.getSelectedItem().toString()));
                            r.seteIV(cbIv.getSelectedItem().toString());
                            r.setdPrecio(Double.parseDouble(tPrecio.getText()));
                            Acceso ac = new Acceso();
                            //ac.agregaRuega(r);
                            if (modelo.agregaRuega(r)) {
                                JOptionPane.showMessageDialog(null, "¡Operación realizada con éxito!");
                            }
                            tModelo.setText("");
                            tMarca.setText("");
                            tCodigo.setText("");
                            tPrecio.setText("");
                            tDiametro.setText("");
                            tAncho.setText("");
                        } else {
                            JOptionPane.showMessageDialog(null, "No se ha podido realizar la inserción");
                        }
                    }

                }

            } catch (NumberFormatException ex) {
                // Si se lanza NumberFormatException, el contenido no es un número válido
                JOptionPane.showMessageDialog(this, "Error: El contenido no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            // Si se lanza NumberFormatException, el contenido no es un número válido
            JOptionPane.showMessageDialog(this, "Error: El contenido no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btGuardarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void cbIvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbIvActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuAlta dialog = new MenuAlta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JComboBox<String> cbIc;
    private javax.swing.JComboBox<String> cbIv;
    private javax.swing.JComboBox<String> cbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tAncho;
    private javax.swing.JTextField tCodigo;
    private javax.swing.JTextField tDiametro;
    private javax.swing.JTextField tMarca;
    private javax.swing.JTextField tModelo;
    private javax.swing.JTextField tPrecio;
    // End of variables declaration//GEN-END:variables
}
