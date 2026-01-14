/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces.Roles;

import ControladoraLogica.ControladoraLogica;
import ControladoraLogica.Mascota;
import ControladoraLogica.Usuario;
import Interfaces.Animales.VerAnimalesPantalla;
import Interfaces.InicioSesion.PantallaPostLogin;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author facun
 */
public class ListaUsuarios extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ListaUsuarios.class.getName());

    private DefaultTableModel tabla_usuarios;
    private ControladoraLogica control_bbdd = new ControladoraLogica();

    private Usuario usuario;

    public ListaUsuarios(Usuario usuario) {
        this.usuario = usuario;
        initComponents();

        configurar_tabla_usuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_usuarios = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_usuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_usuarios);

        jButton1.setText("REFRESH TABLA");
        jButton1.setFocusable(false);
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("ELIMINAR");
        jButton2.setFocusable(false);
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("EDITAR");
        jButton3.setFocusable(false);
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setText("VOLVER ATRAS");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        jButton5.setText("VER ANIMALES");
        jButton5.setFocusable(false);
        jButton5.addActionListener(this::jButton5ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        PantallaPostLogin pp = new PantallaPostLogin(usuario);
        pp.setVisible(true);
        pp.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (tbl_usuarios.getSelectedRow() != -1) {
            int id_eliminar = Integer.parseInt(String.valueOf(tbl_usuarios.getValueAt(tbl_usuarios.getSelectedRow(), 0)));
            control_bbdd.eliminar_usuario(id_eliminar);
            configurar_tabla_usuarios();
        } else {
            JOptionPane.showMessageDialog(this, "Primero selecciona una fila...", "Atencion", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        configurar_tabla_usuarios();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (tbl_usuarios.getSelectedRow() != -1) {
            int id_buscar = Integer.parseInt(String.valueOf(tbl_usuarios.getValueAt(tbl_usuarios.getSelectedRow(), 0)));
            Usuario usuario_editar = control_bbdd.buscar_usuario(id_buscar);

            EditarUsuario pp = new EditarUsuario(usuario_editar, usuario);
            pp.setVisible(true);
            pp.setLocationRelativeTo(null);

        } else {
            JOptionPane.showMessageDialog(this, "Primero selecciona una fila...", "Atencion", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbl_usuarios;
    // End of variables declaration//GEN-END:variables

    protected void configurar_tabla_usuarios() {

        tabla_usuarios = (DefaultTableModel) tbl_usuarios.getModel();
        String cabecera[] = {"Id", "Nombre_usuario", "contrasenia", "Permiso"};
        tabla_usuarios.setColumnIdentifiers(cabecera);

        tabla_usuarios.setRowCount(0);
        ArrayList<Usuario> lista_usuarios = control_bbdd.traerListaUsuario();
        if (!lista_usuarios.isEmpty()) {
            for (Usuario usuario_en_lista : lista_usuarios) {
                Object[] usuario = {usuario_en_lista.getId(),
                    usuario_en_lista.getNombre_usuario(),
                    usuario_en_lista.getContrasenia_usuario(),
                    usuario_en_lista.getPermiso()};
                tabla_usuarios.addRow(usuario);
            }
            tbl_usuarios.setModel(tabla_usuarios);
        } else {
            tbl_usuarios.setModel(tabla_usuarios);
        }

    }
}
