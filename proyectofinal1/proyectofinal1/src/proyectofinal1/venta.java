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
public class venta extends javax.swing.JPanel {
 conector conecta = new conector();
        Connection con = conecta.getConexion();
    /**
     * Creates new form venta
     */
    public venta() {
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
        jPanel2 = new javax.swing.JPanel();
        idcompra = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        idproducto = new javax.swing.JLabel();
        cantidad_venta = new javax.swing.JTextField();
        idproveedor = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        diascompra = new javax.swing.JLabel();
        estadocompra = new javax.swing.JLabel();
        id_usuario = new javax.swing.JTextField();
        id_venta = new javax.swing.JTextField();
        id_producto = new javax.swing.JTextField();
        estado_venta = new javax.swing.JTextField();
        estadocompra1 = new javax.swing.JLabel();
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        idcompra.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        idcompra.setText("Id del usuario");

        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });

        idproducto.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        idproducto.setText("Id de la venta");

        idproveedor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        idproveedor.setText("Id del producto");

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Vender.png"))); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Limpiar.png"))); // NOI18N
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        diascompra.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        diascompra.setText("Stock de la venta");

        estadocompra.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        estadocompra.setText("Cantidad a comprar");

        id_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_usuarioActionPerformed(evt);
            }
        });

        estado_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado_ventaActionPerformed(evt);
            }
        });

        estadocompra1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        estadocompra1.setText("Estado de la venta");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(estadocompra1)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idproveedor)
                                    .addComponent(idcompra)
                                    .addComponent(idproducto)
                                    .addComponent(estadocompra)
                                    .addComponent(diascompra))
                                .addGap(20, 20, 20)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(estado_venta, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stock, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidad_venta, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_producto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_usuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_venta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idproducto))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idproveedor))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estadocompra)
                            .addComponent(cantidad_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(diascompra)
                            .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estado_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadocompra1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
          try {
         // TODO add your handling code here:
         PreparedStatement pps = con.prepareStatement("INSERT INTO venta(ID_VENTA,	ID_USUARIO,	ID_PRODUCTO,		STOCK_DE_VENTA,	CANTIDAD,	ESTADO_DEL_PRODUCTO_DE_VENTA) VALUES (?,?,?,?,?,?)");
         pps.setString(1, id_venta.getText());
         pps.setString(2, id_usuario.getText());
         pps.setString(3, id_producto.getText());
         pps.setString(4, stock.getText());
         pps.setString(5, cantidad_venta.getText());
         pps.setString(6, estado_venta.getText());
         pps.executeUpdate();
         JOptionPane.showMessageDialog(null, "Cita guardada exitosamente");
         
     } catch (SQLException ex) {
         Logger.getLogger(producto.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void id_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_usuarioActionPerformed

    private void estado_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado_ventaActionPerformed

    }//GEN-LAST:event_estado_ventaActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        id_venta.setText("");
        id_usuario.setText("");
        id_producto.setText("");
        stock.setText("");
        cantidad_venta.setText("");
        estado_venta.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
             PreparedStatement pps = con.prepareStatement("UPDATE venta SET STOCK_DE_VENTA='"+stock.getText()+"',CANTIDAD='"+cantidad_venta.getText()+"',ESTADO_DEL_PRODUCTO_DE_VENTA='"+estado_venta.getText()+"' WHERE ID_VENTA='"+id_venta.getText()+"'");
             pps.executeUpdate();
             mostrar("");
  
        } catch (SQLException ex) {
            Logger.getLogger(producto.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int fila = Tbl_datos.getSelectedRow();
        if(fila>=0){
            id_venta.setText(Tbl_datos.getValueAt(fila, 0).toString());
            id_usuario.setText(Tbl_datos.getValueAt(fila, 1).toString());
            id_producto.setText(Tbl_datos.getValueAt(fila, 2).toString());
            stock.setText(Tbl_datos.getValueAt(fila, 3).toString());
            cantidad_venta.setText(Tbl_datos.getValueAt(fila, 4).toString());
            estado_venta.setText(Tbl_datos.getValueAt(fila, 5).toString());

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
modelo.addColumn("Id venta");
        modelo.addColumn("Id usuario");
        modelo.addColumn("Id producto");
        modelo.addColumn("Stock del producto");
        modelo.addColumn("Cantidad de la venta");
        modelo.addColumn("Estado de la venta");
       Tbl_datos.setModel(modelo);
        String sql="";
        if(nombre.equals("")){
            sql="SELECT * FROM `venta`";
            
            
        
        }else{
            sql="SELECT * FROM `venta`";
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
            usuarios[4]=result.getString(5);
            usuarios[5]=result.getString(6);
            modelo.addRow(usuarios);
        }
        Tbl_datos.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(inventario.class.getName()).log(Level.SEVERE, null, ex);
    }
        
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tbl_datos;
    private javax.swing.JTextField cantidad_venta;
    private javax.swing.JLabel diascompra;
    private javax.swing.JTextField estado_venta;
    private javax.swing.JLabel estadocompra;
    private javax.swing.JLabel estadocompra1;
    private javax.swing.JTextField id_producto;
    private javax.swing.JTextField id_usuario;
    private javax.swing.JTextField id_venta;
    private javax.swing.JLabel idcompra;
    private javax.swing.JLabel idproducto;
    private javax.swing.JLabel idproveedor;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField stock;
    // End of variables declaration//GEN-END:variables
}