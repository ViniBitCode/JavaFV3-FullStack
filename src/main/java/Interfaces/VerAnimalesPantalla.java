/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Logica.ControladoraLogica;
import Logica.Mascota;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VerAnimalesPantalla extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VerAnimalesPantalla.class.getName());
    
    private DefaultTableModel tabla_animales;
    private ControladoraLogica control_bbdd = new ControladoraLogica();
    private boolean volver_pantalla = false;

    public VerAnimalesPantalla() {
        initComponents();
        configurarTablaAnimales();
        configurarTextFields();
    }

    private void configurarTablaAnimales() {
        tabla_animales = (DefaultTableModel) tbl_animales.getModel();
        String cabecera[] = {"Id","Nombre mascota", "Edad", "Raza", "Telefono", "Nombre duenio", "Direccion duenio", "Fecha registro"};
        tabla_animales.setColumnIdentifiers(cabecera);
        
        mostrarTablaAnimales();
        
        
        
    }   

    private void mostrarTablaAnimales(){
        tabla_animales.setRowCount(0);
        ArrayList<Mascota> lista_mascotas = control_bbdd.traerListaMascotas();
        for (Mascota mascota_en_lista : lista_mascotas) {
            Object[] mascota = {mascota_en_lista.getId(), 
                                mascota_en_lista.getNombre_mascota(), 
                                mascota_en_lista.getEdad(), 
                                mascota_en_lista.getRaza(), 
                                mascota_en_lista.getTelefono(), 
                                mascota_en_lista.getNombre_duenio(), 
                                mascota_en_lista.getDireccion_duenio(), 
                                mascota_en_lista.getFecha_registrado()};
            tabla_animales.addRow(mascota);
        }
        tbl_animales.setModel(tabla_animales);
    }
    
    private void configurarTextFields(){
        JTextField text_fields[] = new JTextField[2];
        text_fields[0] = jTextField1;
        text_fields[1] = jTextField2;

        String texto_gris[] = {"Buscar por ID","Buscar por nombre de mascota"};
        
        for (int i = 0; i < text_fields.length; i++) {
            final int index = i;
            JTextField text_field = text_fields[i];
            text_field.addFocusListener(new java.awt.event.FocusAdapter() {
                
                @Override
                public void focusGained(java.awt.event.FocusEvent evt){
                    if (text_field.getText().equals(texto_gris[index])) {
                        text_field.setText("");
                        text_field.setForeground(java.awt.Color.BLACK);
                    }
                }
                
                @Override
                public void focusLost(java.awt.event.FocusEvent evt){
                    
                        text_field.setForeground(java.awt.Color.GRAY);
                        text_field.setText(texto_gris[index]);
                    
                }
                
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_animales = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_eliminar_mascota = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(tbl_animales);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btn_eliminar_mascota.setText("ELIMINAR MASCOTA");
        btn_eliminar_mascota.setFocusable(false);
        btn_eliminar_mascota.addActionListener(this::btn_eliminar_mascotaActionPerformed);

        jButton2.setText("BUSCAR");
        jButton2.setFocusable(false);
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("BUSCAR");
        jButton3.setFocusable(false);
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton5.setText("VOLVER ATRAS");
        jButton5.setFocusable(false);
        jButton5.addActionListener(this::jButton5ActionPerformed);

        jTextField1.setForeground(java.awt.Color.gray);
        jTextField1.setText("Buscar por ID");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        jTextField2.setForeground(java.awt.Color.gray);
        jTextField2.setText("Buscar por nombre de mascota");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addActionListener(this::jTextField2ActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_eliminar_mascota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_eliminar_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminar_mascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_mascotaActionPerformed
        if(tbl_animales.getSelectedRow() != -1) {
            int id_eliminar = Integer.parseInt(String.valueOf(tbl_animales.getValueAt(tbl_animales.getSelectedRow(), 0)));
            control_bbdd.eliminar_mascota(id_eliminar);
            configurarTablaAnimales();
        } else {
            JOptionPane.showMessageDialog(this, "Primero selecciona una fila...","Atencion",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_eliminar_mascotaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       if(volver_pantalla == true) {
           mostrarTablaAnimales();
           volver_pantalla = false;
       } else {
            this.dispose();
            PrimerPantalla pp = new PrimerPantalla();
            pp.setVisible(true);
            pp.setLocationRelativeTo(null); 
       }
        
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        try {
            int id_buscar = Integer.parseInt(jTextField1.getText());
            Mascota mascota = control_bbdd.buscarMascota(id_buscar);
            
            if(mascota == null) {
                JOptionPane.showMessageDialog(this, "No hay ningun animal con el ID: [" + id_buscar + "]" ,"Atencion",JOptionPane.WARNING_MESSAGE);
                jTextField1.setText("");
            } else {
                Object[] object = { mascota.getId(), 
                                mascota.getNombre_mascota(), 
                                mascota.getEdad(), 
                                mascota.getRaza(), 
                                mascota.getTelefono(), 
                                mascota.getNombre_duenio(), 
                                mascota.getDireccion_duenio(), 
                                mascota.getFecha_registrado()};
                tabla_animales.setRowCount(0);
                tabla_animales.addRow(object);
                tbl_animales.setModel(tabla_animales);
                volver_pantalla = true;
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Pone un numero valido...","Atencion",JOptionPane.WARNING_MESSAGE);
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        try {
            String nombre_a_buscar = jTextField2.getText();
            List<Mascota> lista_nombres = control_bbdd.buscar_por_nombre(nombre_a_buscar);
            
            if(lista_nombres.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay ningun animal con el nombre: [" + nombre_a_buscar + "]" ,"Atencion",JOptionPane.WARNING_MESSAGE);
                jTextField1.setText("");
            } else {
                tabla_animales.setRowCount(0);
                for (Mascota mascota_en_lista : lista_nombres) {
                    Object[] mascota = {mascota_en_lista.getId(), 
                        mascota_en_lista.getNombre_mascota(), 
                        mascota_en_lista.getEdad(), 
                        mascota_en_lista.getRaza(), 
                        mascota_en_lista.getTelefono(), 
                        mascota_en_lista.getNombre_duenio(), 
                        mascota_en_lista.getDireccion_duenio(), 
                        mascota_en_lista.getFecha_registrado()};
                    tabla_animales.addRow(mascota);
                }
                tbl_animales.setModel(tabla_animales);
                volver_pantalla = true;
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Pone un nombre valido...","Atencion",JOptionPane.WARNING_MESSAGE);
            jTextField1.setText("");
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar_mascota;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tbl_animales;
    // End of variables declaration//GEN-END:variables

}
