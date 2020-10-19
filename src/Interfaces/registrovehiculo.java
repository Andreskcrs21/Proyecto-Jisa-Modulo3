/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


import Clases.Vehiculo;
import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author IDEAPAD 330
 */
public class registrovehiculo extends javax.swing.JInternalFrame {

    /**
     * Creates new form Gproducto
     */
    public registrovehiculo() {
        initComponents();
    }
    void limpiar(){
        textocodigo.setText("");
        textomarca.setText("");
        textocolor.setText("");
        textomodelo.setText("");
        textocategoria.setText("");
        textoexistencia.setText("");
        textoaño.setText("");
        textoprecio.setText("");
        textosucursal.setText("");
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        textocodigo = new javax.swing.JTextField();
        textomarca = new javax.swing.JTextField();
        textocolor = new javax.swing.JTextField();
        textoexistencia = new javax.swing.JTextField();
        textoaño = new javax.swing.JTextField();
        textoprecio = new javax.swing.JTextField();
        textosucursal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        registar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        textomodelo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textocategoria = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Registro de vehículos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro de vehículos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        textocodigo.setBackground(new java.awt.Color(255, 255, 102));
        textocodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textocodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textocodigoActionPerformed(evt);
            }
        });
        textocodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textocodigoKeyTyped(evt);
            }
        });
        getContentPane().add(textocodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 190, -1));

        textomarca.setBackground(new java.awt.Color(255, 255, 102));
        textomarca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textomarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textomarcaKeyTyped(evt);
            }
        });
        getContentPane().add(textomarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 190, -1));

        textocolor.setBackground(new java.awt.Color(255, 255, 102));
        textocolor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textocolor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textocolorKeyTyped(evt);
            }
        });
        getContentPane().add(textocolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 190, -1));

        textoexistencia.setBackground(new java.awt.Color(255, 255, 102));
        textoexistencia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoexistencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoexistenciaKeyTyped(evt);
            }
        });
        getContentPane().add(textoexistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 190, -1));

        textoaño.setBackground(new java.awt.Color(255, 255, 102));
        textoaño.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoaño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoañoKeyTyped(evt);
            }
        });
        getContentPane().add(textoaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 190, -1));

        textoprecio.setBackground(new java.awt.Color(255, 255, 102));
        textoprecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoprecioKeyTyped(evt);
            }
        });
        getContentPane().add(textoprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 190, -1));

        textosucursal.setBackground(new java.awt.Color(255, 255, 102));
        textosucursal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textosucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textosucursalActionPerformed(evt);
            }
        });
        textosucursal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textosucursalKeyTyped(evt);
            }
        });
        getContentPane().add(textosucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 190, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sucursal");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Código");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Marca");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Color");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Existencia");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Año");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        registar.setBackground(new java.awt.Color(255, 255, 255));
        registar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        registar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar24x24.png"))); // NOI18N
        registar.setText("Registar");
        registar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registarActionPerformed(evt);
            }
        });
        getContentPane().add(registar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Precio");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        textomodelo.setBackground(new java.awt.Color(255, 255, 102));
        textomodelo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textomodelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textomodeloKeyTyped(evt);
            }
        });
        getContentPane().add(textomodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 190, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Categoría");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Modelo");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Modelo");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        textocategoria.setBackground(new java.awt.Color(255, 255, 102));
        textocategoria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textocategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textocategoriaKeyTyped(evt);
            }
        });
        getContentPane().add(textocategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 190, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ford-gt-ford.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 730, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textocodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textocodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textocodigoActionPerformed

    private void textocodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textocodigoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo digite números");
        } else if (textocolor.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_textocodigoKeyTyped

    private void textomarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textomarcaKeyTyped
        char validar = evt.getKeyChar();// sirve para validar que solo ingrese letras
        if (Character.isDigit(validar)) { // para validar que solo ingrese lettras
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Digite solo letras");
        } else if (textomarca.getText().length() >= 25) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();// sirve para hacer un sonido al final
        }
    }//GEN-LAST:event_textomarcaKeyTyped

    private void textocolorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textocolorKeyTyped
       char validar = evt.getKeyChar();// sirve para validar que solo ingrese letras
        if (Character.isDigit(validar)) { // para validar que solo ingrese lettras
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Digite solo letras");
        } else if (textocolor.getText().length() >= 25) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();// sirve para hacer un sonido al final
        }
    }//GEN-LAST:event_textocolorKeyTyped

    private void textoexistenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoexistenciaKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo digite números");
        } else if (textoexistencia.getText().length() >= 2) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_textoexistenciaKeyTyped

    private void textoañoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoañoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo digite números");
        } else if (textoaño.getText().length() >= 4) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_textoañoKeyTyped

    private void textoprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoprecioKeyTyped
         char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo digite números");
        } /*else if (textoaño.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }*/
    }//GEN-LAST:event_textoprecioKeyTyped

    private void textosucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textosucursalActionPerformed

    }//GEN-LAST:event_textosucursalActionPerformed

    private void textosucursalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textosucursalKeyTyped
       if (textosucursal.getText().length() >= 50) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_textosucursalKeyTyped

    private void registarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registarActionPerformed
        Coneccion co;
        //PreparedStatement ps;
        Vehiculo c = new Vehiculo(textocodigo.getText(), textomarca.getText(),textocolor.getText(),
                textomodelo.getText(),textocategoria.getText(),textoexistencia.getText()
            ,textoaño.getText(),textoprecio.getText(), textosucursal.getText());

        // sirve para que el usuario llene todos los comapos
        if (textocodigo.getText().equals(" ") || textomarca.getText().equals(" ") ||textocolor.getText().equals(" ")||
                textoexistencia.getText().equals(" ")||textoaño.getText().equals(" ")
            ||textoprecio.getText().equals("")|| textosucursal.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
            // javax.swing.JOptionPane.showMessageDialog(this, "Llene todos los campos " + javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            co = new Coneccion();
            Connection con = co.getConexion();
            try {
                CallableStatement insert = (CallableStatement) con.prepareCall("call Insert_vehiculos (?,?,?,?,?,?,?,?,?)");
               // ps = (PreparedStatement) con.prepareStatement("insert into vehiculos(Codigo,Marca,Color,Modelo,Existencia,Año,Precio,Sucursal) values(?,?,?,?,?,?,?,?)");
                insert.setString(1, textocodigo.getText());
                insert.setString(2, textomarca.getText());
                insert.setString(3, textocolor.getText());
                insert.setString(4, textomodelo.getText());
                insert.setString(5, textocategoria.getText());
                insert.setString(6, textoexistencia.getText());
                insert.setString(7, textoaño.getText());
                insert.setString(8, textoprecio.getText());
                insert.setString(9, textosucursal.getText());

                int res = insert.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Vehículo guardado con Éxito !!!!!!!!!");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "error");
                }
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_registarActionPerformed

    private void textomodeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textomodeloKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textomodeloKeyTyped

    private void textocategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textocategoriaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textocategoriaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
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
    private javax.swing.JButton registar;
    private javax.swing.JTextField textoaño;
    private javax.swing.JTextField textocategoria;
    private javax.swing.JTextField textocodigo;
    private javax.swing.JTextField textocolor;
    private javax.swing.JTextField textoexistencia;
    private javax.swing.JTextField textomarca;
    private javax.swing.JTextField textomodelo;
    private javax.swing.JTextField textoprecio;
    private javax.swing.JTextField textosucursal;
    // End of variables declaration//GEN-END:variables
}
