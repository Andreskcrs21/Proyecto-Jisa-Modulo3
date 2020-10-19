/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import com.mysql.jdbc.Connection;

/**
 *
 * @author IDEAPAD 330
 */
public class listadevehiculos extends javax.swing.JInternalFrame {

    /**
     * Creates new form listapro
     */
    public listadevehiculos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Lista vehículos");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Lista de vehículos registrados");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        clientes.setBackground(new java.awt.Color(255, 204, 204));
        clientes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Marca", "Color", "Modelo", "Categoría", "Existencia", "Año", "Precio", "Sucursal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientes.setAlignmentX(0.6F);
        clientes.setAlignmentY(0.6F);
        jScrollPane1.setViewportView(clientes);
        if (clientes.getColumnModel().getColumnCount() > 0) {
            clientes.getColumnModel().getColumn(0).setResizable(false);
            clientes.getColumnModel().getColumn(1).setResizable(false);
            clientes.getColumnModel().getColumn(2).setResizable(false);
            clientes.getColumnModel().getColumn(3).setResizable(false);
            clientes.getColumnModel().getColumn(4).setResizable(false);
            clientes.getColumnModel().getColumn(5).setResizable(false);
            clientes.getColumnModel().getColumn(6).setResizable(false);
            clientes.getColumnModel().getColumn(7).setResizable(false);
            clientes.getColumnModel().getColumn(8).setResizable(false);
        }

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Mostrar lista de vehículos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(353, 353, 353))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            DefaultTableModel modelo = new DefaultTableModel(); //declaro un varaible de tipo DefaultTableModel

            clientes.setModel(modelo); //llamo a la tabla y le agrego el modelo
            PreparedStatement ps = null; // sirve para preparar la consulta

            ResultSet rs = null;

            Coneccion co = new Coneccion(); //creo un objeto de la clase coneccion
            Connection con = co.getConexion(); // creo una variable de tipo Connection y la igualo al metodo de la conecion

            //agrego los parametro de la consulta y la ejecuto
            ps = (PreparedStatement) con.prepareStatement("select Codigo,Marca,Color,Modelo,Categoria,Existencia,Año,Precio,Sucursal from vehiculos");

            rs = ps.executeQuery(); // trae todo los datos de la consulta

            ResultSetMetaData r  = (ResultSetMetaData) rs.getMetaData(); //le pasamos el resultado de laconsulta

            int cColumnas = r.getColumnCount();
            modelo.addColumn("Código");
            modelo.addColumn("Marca");
            modelo.addColumn("Color");
            modelo.addColumn("Modelo");
            modelo.addColumn("Categoría");
            modelo.addColumn("Existencia");
            modelo.addColumn("Año");
            modelo.addColumn("Precio");
            modelo.addColumn("Sucursal");
            
            

            while(rs.next()){
                Object [] filas = new Object[cColumnas]; // declaro un arreglo de tipo objeto
                for (int i = 0; i < cColumnas; i++) {
                    filas [i] = rs.getObject(i+1);

                }
                modelo.addRow(filas); //agrego lod datos al modelo
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable clientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
