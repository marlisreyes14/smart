/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class usuarios extends javax.swing.JPanel {
 conector conecta = new conector();
        Connection con = conecta.getConexion();
    /**
     * Creates new form usuarios
     */
    public usuarios() {
        initComponents();
        mostrar("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        id_usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nombre_usuario = new javax.swing.JTextField();
        telefono_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        direccion_usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_datos = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("eliminar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrar.png"))); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Direccion del usuario");

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Limpiar.png"))); // NOI18N
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        id_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_usuarioActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Id del usuario");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Nombre del usuario");

        direccion_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccion_usuarioActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Telefono del usuario");

        Tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
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
        Tbl_datos.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(Tbl_datos);

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actualizar.png"))); // NOI18N
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(direccion_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telefono_usuario))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(id_usuario)
                                    .addComponent(nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(telefono_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(direccion_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
          try {
         // TODO add your handling code here:
         PreparedStatement pps = con.prepareStatement("INSERT INTO usuario(ID_USUARIO,	NOMBRE_USUARIO,	TELEFONO,	DIRECCION) VALUES (?,?,?,?)");
         pps.setString(1, id_usuario.getText());
         pps.setString(2, nombre_usuario.getText());
         pps.setString(3, telefono_usuario.getText());
         pps.setString(4, direccion_usuario.getText());
         pps.executeUpdate();
         JOptionPane.showMessageDialog(null, "Cita guardada exitosamente");
         
     } catch (SQLException ex) {
         Logger.getLogger(producto.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void id_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_usuarioActionPerformed

    private void direccion_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccion_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccion_usuarioActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        id_usuario.setText("");
        nombre_usuario.setText("");
        telefono_usuario.setText("");
        direccion_usuario.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
             PreparedStatement pps = con.prepareStatement("UPDATE usuario SET NOMBRE_USUARIO='"+nombre_usuario.getText()+"',DIRECCION='"+direccion_usuario.getText()+"',TELEFONO='"+telefono_usuario.getText()+"' WHERE ID_USUARIO='"+id_usuario.getText()+"'");
             pps.executeUpdate();
             mostrar("");
  
        } catch (SQLException ex) {
            Logger.getLogger(producto.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int fila = Tbl_datos.getSelectedRow();
        if(fila>=0){
            id_usuario.setText(Tbl_datos.getValueAt(fila, 0).toString());
            nombre_usuario.setText(Tbl_datos.getValueAt(fila, 1).toString());
            telefono_usuario.setText(Tbl_datos.getValueAt(fila, 2).toString());
            direccion_usuario.setText(Tbl_datos.getValueAt(fila, 3).toString());
            
        }
        else{
            JOptionPane.showMessageDialog(null, "No fue seleccionada");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int fila = Tbl_datos.getSelectedRow();
        String id="";
        id=Tbl_datos.getValueAt(fila, 0).toString();

        try {
            PreparedStatement pps = con.prepareStatement("DELETE FROM producto WHERE ID_PRODUCTO='"+id+"'");
            pps.executeUpdate();
            mostrar("");
        } catch (SQLException ex) {
            Logger.getLogger(producto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed
public  void mostrar(String nombre){
  DefaultTableModel  modelo = new DefaultTableModel();
modelo.addColumn("Id usuarios");
        modelo.addColumn("Nombre del usuario");
        modelo.addColumn("Telefono del usuario");
        modelo.addColumn("Direccion del usuario");
       Tbl_datos.setModel(modelo);
        String sql="";
        if(nombre.equals("")){
            sql="SELECT * FROM `usuario`";
            
            
        
        }else{
            sql="SELECT * FROM `usuario`";
        }
        String usuarios[]=new String[6];
        Statement set;
    try {
        set = con.createStatement();
        ResultSet result=set.executeQuery(sql);
        while(result.next()){
            usuarios[0]=result.getString(1);
            usuarios[1]=result.getString(2);
            usuarios[2]=result.getString(3);
            usuarios[3]=result.getString(4);

            modelo.addRow(usuarios);
        }
        Tbl_datos.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(inventario.class.getName()).log(Level.SEVERE, null, ex);
    }
        
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tbl_datos;
    private javax.swing.JTextField direccion_usuario;
    private javax.swing.JTextField id_usuario;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre_usuario;
    private javax.swing.JTextField telefono_usuario;
    // End of variables declaration//GEN-END:variables
}
