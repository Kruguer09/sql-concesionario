/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vista;

import controlador.Acceso;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import modelo.Rueda;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Menú que permite gestionar diferentes operaciones de la base de datos como
 * actualizar, eliminar o eliminar por perfil
 *
 * @author Jose A Ferre Rico
 */
public class MenuBD extends javax.swing.JDialog {

    private Acceso modelo;
    private ArrayList<Rueda> lRuedas;

    /**
     * Creates new form MenuBD
     */
    public MenuBD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Acceso a datos de Ruedas");
        ImageIcon imgIcono = new ImageIcon("src/faviconRueda.png");
        setIconImage(imgIcono.getImage());
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public MenuBD(java.awt.Frame parent, boolean modal, Acceso modelo) {
        super(parent, modal);
        initComponents();
        setTitle("Acceso a datos de Ruedas");
        ImageIcon imgIcono = new ImageIcon("src/faviconRueda.png");
        setIconImage(imgIcono.getImage());
        setResizable(false);
        setLocationRelativeTo(null);
        this.modelo = modelo;

        cargarTabla();
        ListSelectionModel selectionModel = tTabla.getSelectionModel();
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    // Obtener la fila seleccionada
                    int filaSeleccionada = tTabla.getSelectedRow();

                    // Verificar si hay una fila seleccionada
                    if (filaSeleccionada != -1) {
                        // Obtener los valores de la fila seleccionada desde el modelo de la tabla
                        Object valor1 = tTabla.getValueAt(filaSeleccionada, 0);
                        Object valor2 = tTabla.getValueAt(filaSeleccionada, 1);
                        Object valor3 = tTabla.getValueAt(filaSeleccionada, 2);
                        Object valor4 = tTabla.getValueAt(filaSeleccionada, 3);
                        Object valor5 = tTabla.getValueAt(filaSeleccionada, 4);
                        Object valor6 = tTabla.getValueAt(filaSeleccionada, 5);
                        Object valor7 = tTabla.getValueAt(filaSeleccionada, 6);
                        Object valor8 = tTabla.getValueAt(filaSeleccionada, 7);
                        Object valor9 = tTabla.getValueAt(filaSeleccionada, 8);

                        // Mostrar los valores en los JTextField
                        etCodigo.setText(valor1.toString());
                        etMarca.setText(valor2.toString());
                        etModelo.setText(valor3.toString());
                        etAncho.setText(valor4.toString());
                        cbPerfil.setSelectedItem(valor5.toString());
                        etDiametro.setText(valor6.toString());
                        cbIC.setSelectedItem(valor7.toString());
                        cbIV.setSelectedItem(valor8.toString());
                        etPrecio.setText(valor9.toString());
                    }
                }
            }
        });
    }

    /**
     * Método que carga la tabla con los elementos de la base de datos
     */
    public void cargarTabla() {

        DefaultTableModel oldModel = (DefaultTableModel) tTabla.getModel();
        DefaultTableModel newModel = borrarTabla(oldModel);
        //modelo.openConnection();
        String select = "SELECT * FROM neumatico";
        this.lRuedas = this.modelo.getRuedas(select);
        this.lRuedas.forEach((current) -> {
            newModel.addRow(new Object[]{current.getiCodigo(), current.getsMarca(), current.getsModelo(), current.getiAncho(), current.getePerfil(), current.getdDiamtro(), current.getiIC(), current.geteIV(), current.getdPrecio()});
        });
        tTabla.setModel(newModel);
    }

    public DefaultTableModel borrarTabla(DefaultTableModel model) {
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        return model;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbPerfil = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        etDiametro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbIC = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbIV = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        etPrecio = new javax.swing.JTextField();
        bCancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bActualizar1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cpTablaNeumaticos = new javax.swing.JScrollPane();
        tTabla = new javax.swing.JTable();
        etCodigo = new javax.swing.JTextField();
        etMarca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        etModelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        etAncho = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bActualizar2 = new javax.swing.JButton();
        bActualizar3 = new javax.swing.JButton();
        btXml = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        cbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALTO", "MEDIO", "BAJO" }));

        jLabel5.setText("Ancho");

        jLabel6.setText("Perfil:");

        cbIC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "70", "71", "72", "73", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120" }));

        jLabel7.setText("Diámetro:");

        cbIV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "H", "N", "Q", "R", "S", "T", "V", "W", "Y" }));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("LISTADO NEUMÁTICOS");

        jLabel8.setText("IC:");

        bCancelar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        bCancelar.setForeground(new java.awt.Color(255, 0, 51));
        bCancelar.setText("CANCELAR");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        jLabel9.setText("IV:");

        jLabel11.setText("mm");

        bActualizar1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        bActualizar1.setForeground(new java.awt.Color(51, 255, 51));
        bActualizar1.setText("ACTUALIZAR");
        bActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizar1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Precio:");

        jLabel12.setText("€");

        tTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Marca", "Modelo", "Ancho", "Perfil", "Diámetro", "IC", "IV", "Precio"
            }
        ));
        cpTablaNeumaticos.setViewportView(tTabla);

        jLabel2.setText("Código:");

        jLabel3.setText("Marca:");

        etAncho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etAnchoActionPerformed(evt);
            }
        });

        jLabel4.setText("Modelo:");

        bActualizar2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        bActualizar2.setForeground(new java.awt.Color(51, 255, 51));
        bActualizar2.setText("ELIMINAR");
        bActualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizar2ActionPerformed(evt);
            }
        });

        bActualizar3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        bActualizar3.setForeground(new java.awt.Color(51, 255, 51));
        bActualizar3.setText("ELIMINAR PERFIL BAJO");
        bActualizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizar3ActionPerformed(evt);
            }
        });

        btXml.setText("carga xml");
        btXml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXmlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(cpTablaNeumaticos, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etAncho, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbIV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etDiametro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(bActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bActualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bActualizar3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(btXml, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(etCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(etMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etDiametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(etModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(etAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbIV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(cbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(cpTablaNeumaticos, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar)
                    .addComponent(bActualizar1)
                    .addComponent(bActualizar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bActualizar3)
                    .addComponent(btXml))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void etAnchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etAnchoActionPerformed


    }//GEN-LAST:event_etAnchoActionPerformed

    private void bActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizar1ActionPerformed
        int codigo = Integer.parseInt(etCodigo.getText());
        String marca = etMarca.getText();
        String modelo = etModelo.getText();
        int ancho = Integer.parseInt(etAncho.getText());
        String perfil = cbPerfil.getSelectedItem().toString();
        double diametro = Double.parseDouble(etDiametro.getText());
        int ic = Integer.parseInt(cbIC.getSelectedItem().toString());
        String iv = cbIV.getSelectedItem().toString();
        double precio = Double.parseDouble(etPrecio.getText());

        // Crear un objeto Rueda con los datos actualizados
        Rueda ruedaActualizada = new Rueda(codigo, ancho, ic, precio, diametro, marca, modelo, perfil, iv);

        // Actualizar la rueda en la base de datos
        boolean actualizacionExitosa = this.modelo.actualizarRueda(ruedaActualizada);

        // Verificar si la actualización fue exitosa y recargar la tabla
        if (actualizacionExitosa) {
            JOptionPane.showMessageDialog(this, "Datos actualizados correctamente.");
            cargarTabla();  // Recargar la tabla después de la actualización
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar los datos, el código no se puede cambiar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bActualizar1ActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bActualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizar2ActionPerformed
        if (tTabla.getSelectedRow() != -1) {
            // Obtener el código de la fila seleccionada
            int codigo = Integer.parseInt(etCodigo.getText());

            // Eliminar la rueda en la base de datos
            boolean eliminacionExitosa = modelo.eliminarRueda(codigo);

            // Verificar si la eliminación fue exitosa y recargar la tabla
            if (eliminacionExitosa) {
                JOptionPane.showMessageDialog(MenuBD.this, "Rueda eliminada correctamente.");
                cargarTabla();  // Recargar la tabla después de la eliminación
                etCodigo.setText("");
                etModelo.setText("");
                etMarca.setText("");
                etPrecio.setText("");
                etDiametro.setText("");
                etAncho.setText("");
            } else {
                JOptionPane.showMessageDialog(MenuBD.this, "Error al eliminar la rueda.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(MenuBD.this, "Selecciona una fila antes de eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bActualizar2ActionPerformed

    private void bActualizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizar3ActionPerformed
        String perfilAEliminar = "BAJO";

        // Mostrar un cuadro de diálogo de confirmación
        int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar todos los elementos con perfil 'BAJO'?", "Confirmación", JOptionPane.YES_NO_OPTION);

        // Verificar la respuesta del usuario
        if (opcion == JOptionPane.YES_OPTION) {
            // Llamar al método de eliminación en el modelo (Acceso)
            boolean eliminacionExitosa = modelo.eliminarRuedasPorPerfil(perfilAEliminar);

            // Verificar si la eliminación fue exitosa y recargar la tabla
            if (eliminacionExitosa) {
                JOptionPane.showMessageDialog(this, "Elementos eliminados correctamente.");
                cargarTabla();  // Recargar la tabla después de la eliminación
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar los elementos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // El usuario seleccionó "No" en el cuadro de diálogo de confirmación
            JOptionPane.showMessageDialog(this, "Eliminación cancelada por el usuario.");
        }
    }//GEN-LAST:event_bActualizar3ActionPerformed

    private void btXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXmlActionPerformed
        DocumentBuilder dBuilder = null;
        Document document;
        try {
            File fXmlFile = new File("taller.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            dBuilder = dbFactory.newDocumentBuilder();
            //document = dBuilder.parse(fXmlFile);

            document = dBuilder.parse(fXmlFile);
            Element nodoRaiz = document.getDocumentElement();
            NodeList listaLibros = nodoRaiz.getChildNodes();
            ArrayList<Rueda> alRuedas = new ArrayList();
            Acceso modelo = new Acceso();
            for (int i = 0; i < listaLibros.getLength(); i++) {
                Node libroActual = listaLibros.item(i);
                if (libroActual.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementLibroActual = (Element) libroActual;
                    Rueda rTemporal = new Rueda();
                    rTemporal.setiCodigo(Integer.parseInt(elementLibroActual.getAttribute("ID")));
                    rTemporal.setsMarca(elementLibroActual.getElementsByTagName("marca").item(0).getTextContent().trim());
                    rTemporal.setsModelo(elementLibroActual.getElementsByTagName("modelo").item(0).getTextContent().trim());
                    rTemporal.setiAncho(Integer.parseInt(elementLibroActual.getElementsByTagName("ancho").item(0).getTextContent()));
                    rTemporal.setePerfil(elementLibroActual.getElementsByTagName("perfil").item(0).getTextContent().trim());
                    rTemporal.setdDiamtro(Double.parseDouble(elementLibroActual.getElementsByTagName("diametro").item(0).getTextContent()));
                    rTemporal.setiIC(Integer.parseInt(elementLibroActual.getElementsByTagName("ic").item(0).getTextContent()));
                    rTemporal.seteIV(elementLibroActual.getElementsByTagName("iv").item(0).getTextContent().trim());
                    rTemporal.setdPrecio(Double.parseDouble(elementLibroActual.getElementsByTagName("precio").item(0).getTextContent()));
                    alRuedas.add(rTemporal);

                    modelo.agregaRuega(rTemporal);
                    
                }

            }
            

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(MenuBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(MenuBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MenuBD.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btXmlActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException, TransformerException {
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
            java.util.logging.Logger.getLogger(MenuBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuBD dialog = new MenuBD(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton bActualizar1;
    private javax.swing.JButton bActualizar2;
    private javax.swing.JButton bActualizar3;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton btXml;
    private javax.swing.JComboBox<String> cbIC;
    private javax.swing.JComboBox<String> cbIV;
    private javax.swing.JComboBox<String> cbPerfil;
    private javax.swing.JScrollPane cpTablaNeumaticos;
    private javax.swing.JTextField etAncho;
    private javax.swing.JTextField etCodigo;
    private javax.swing.JTextField etDiametro;
    private javax.swing.JTextField etMarca;
    private javax.swing.JTextField etModelo;
    private javax.swing.JTextField etPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTable tTabla;
    // End of variables declaration//GEN-END:variables
}
