/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Dimension;

import java.io.InputStream;

import javax.swing.JInternalFrame;

public class VentanaP extends javax.swing.JFrame {

    public InputStream foto1=this.getClass().getResourceAsStream("/imagenes/fondo6.jpg");

    public VentanaP() {
        initComponents();
        setTitle("Ventana principal");
        //this.setLocationRelativeTo(null);
        
    }
    void centrar(JInternalFrame frame){
        escritorio.add(frame);
        Dimension dimension = escritorio.getSize();
        Dimension regis =frame.getSize();
        frame.setLocation((dimension.width - regis.width)/2, (dimension.height - regis.height)/2);
        frame.show();
    }
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        opcionregistro = new javax.swing.JMenuItem();
        mostrarusuario = new javax.swing.JMenuItem();
        Empleado = new javax.swing.JMenu();
        Iproveedor = new javax.swing.JMenuItem();
        Bproveedor = new javax.swing.JMenuItem();
        Producto = new javax.swing.JMenu();
        Rproducto = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        generarfactura = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu2.setBackground(new java.awt.Color(204, 204, 204));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios24x24.png"))); // NOI18N
        jMenu2.setText("Clientes");

        opcionregistro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opcionregistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo24x24.png"))); // NOI18N
        opcionregistro.setText("Registrar Cliente");
        opcionregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionregistroActionPerformed(evt);
            }
        });
        jMenu2.add(opcionregistro);

        mostrarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes24x24.png"))); // NOI18N
        mostrarusuario.setText("Mostrar Clientes");
        mostrarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarusuarioActionPerformed(evt);
            }
        });
        jMenu2.add(mostrarusuario);

        jMenuBar1.add(jMenu2);

        Empleado.setBackground(new java.awt.Color(204, 204, 204));
        Empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/producto24x24_1.png"))); // NOI18N
        Empleado.setText("Empleados");
        Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadoActionPerformed(evt);
            }
        });

        Iproveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo24x24.png"))); // NOI18N
        Iproveedor.setText("Ingresar empleado");
        Iproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IproveedorActionPerformed(evt);
            }
        });
        Empleado.add(Iproveedor);

        Bproveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios24x24.png"))); // NOI18N
        Bproveedor.setText("Mostrar empleados");
        Bproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BproveedorActionPerformed(evt);
            }
        });
        Empleado.add(Bproveedor);

        jMenuBar1.add(Empleado);

        Producto.setBackground(new java.awt.Color(204, 204, 204));
        Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/movimientos24x24.png"))); // NOI18N
        Producto.setText("Vehículos");

        Rproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo24x24.png"))); // NOI18N
        Rproducto.setText("Registrar vehículos");
        Rproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RproductoActionPerformed(evt);
            }
        });
        Producto.add(Rproducto);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/producto24x24.png"))); // NOI18N
        jMenuItem2.setText("Lista de vehículos registrados");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Producto.add(jMenuItem2);

        jMenuBar1.add(Producto);

        jMenu3.setBackground(new java.awt.Color(204, 204, 204));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facturaReporte24x24.png"))); // NOI18N
        jMenu3.setText("Factura");

        generarfactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facturaNuevo24x24.png"))); // NOI18N
        generarfactura.setText("Generar Factura");
        generarfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarfacturaActionPerformed(evt);
            }
        });
        jMenu3.add(generarfactura);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionregistroActionPerformed
       // escritorio.removeAll();
        registro r =new registro();
        centrar(r);
        
    }//GEN-LAST:event_opcionregistroActionPerformed

    private void generarfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarfacturaActionPerformed
       
    }//GEN-LAST:event_generarfacturaActionPerformed

    private void mostrarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarusuarioActionPerformed
      
      Listac l = new Listac();
        centrar(l);
    }//GEN-LAST:event_mostrarusuarioActionPerformed

    private void RproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RproductoActionPerformed
        registrovehiculo gp = new registrovehiculo();
        centrar(gp);
    }//GEN-LAST:event_RproductoActionPerformed

    private void IproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IproveedorActionPerformed
       registroempleado re = new registroempleado();
        centrar(re);
    }//GEN-LAST:event_IproveedorActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        listadevehiculos p  = new listadevehiculos();
        centrar(p);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadoActionPerformed
       
    }//GEN-LAST:event_EmpleadoActionPerformed

    private void BproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BproveedorActionPerformed
        Buscarempleado b = new Buscarempleado();
        centrar(b);
        
    }//GEN-LAST:event_BproveedorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look; and feel */
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
            java.util.logging.Logger.getLogger(VentanaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaP().setVisible(true);
                
                
                
            }
        });
    }
/*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Bproveedor;
    private javax.swing.JMenu Empleado;
    private javax.swing.JMenuItem Iproveedor;
    private javax.swing.JMenu Producto;
    private javax.swing.JMenuItem Rproducto;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem generarfactura;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem mostrarusuario;
    private javax.swing.JMenuItem opcionregistro;
    // End of variables declaration//GEN-END:variables
}*/
     private javax.swing.JMenuItem Bproveedor;
    private javax.swing.JMenuItem Iproveedor;
    public javax.swing.JMenu Producto;
    private javax.swing.JMenuItem Rproducto;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem generarfactura;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    public javax.swing.JMenu Empleado;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem mostrarusuario;
    private javax.swing.JMenuItem opcionregistro;
}
