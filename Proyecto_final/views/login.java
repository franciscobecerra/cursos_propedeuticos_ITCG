/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Proyecto_final.views;

import Proyecto_final.clases.ReadFilesUsers;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author franciscobecerra
 */
public class login extends javax.swing.JFrame {
    private ReadFilesUsers USERS;
    int con = 0;
    
    public login() {
        USERS = new ReadFilesUsers();
        
        
        initComponents();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        this.setVisible( true );
        error.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        createAndEnter = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 248, 248));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        password.setBackground(new java.awt.Color(153, 153, 153));
        password.setFont(new java.awt.Font(".SF NS Text", 0, 24)); // NOI18N
        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setText("contrasena");
        password.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        password.setMargin(new java.awt.Insets(2, 10, 2, 6));
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
        });
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 340, 40));

        createAndEnter.setBackground(new java.awt.Color(0, 204, 204));
        createAndEnter.setFont(new java.awt.Font("AvantGarde Bk BT", 0, 18)); // NOI18N
        createAndEnter.setForeground(new java.awt.Color(255, 255, 255));
        createAndEnter.setText("Crear y Entrar");
        createAndEnter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createAndEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAndEnterMouseClicked(evt);
            }
        });
        createAndEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAndEnterActionPerformed(evt);
            }
        });
        jPanel1.add(createAndEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 150, 40));

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 420, 10));

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -40, 420, 10));

        jLabel1.setFont(new java.awt.Font("Geometos", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("INICIO DE SESSION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        user.setBackground(new java.awt.Color(153, 153, 153));
        user.setFont(new java.awt.Font(".SF NS Text", 0, 18)); // NOI18N
        user.setForeground(new java.awt.Color(204, 204, 204));
        user.setText("Ingresa el nombre de usuario");
        user.setAlignmentX(1.5F);
        user.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        user.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
        });
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 340, 40));

        labelPassword.setForeground(new java.awt.Color(51, 51, 51));
        labelPassword.setText("Contraseña");
        jPanel1.add(labelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        labelUser.setForeground(new java.awt.Color(51, 51, 51));
        labelUser.setText("Usuario");
        jPanel1.add(labelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        login.setBackground(new java.awt.Color(255, 102, 102));
        login.setFont(new java.awt.Font("AvantGarde Bk BT", 0, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Entrar");
        login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 150, 40));

        error.setBackground(new java.awt.Color(255, 255, 255));
        error.setForeground(new java.awt.Color(204, 0, 51));
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error.setText("Error al ingresar al sistema, contraseña o usuario invalidos");
        jPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 380, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static boolean validation( String type, String value ){
        Pattern regex;
        Matcher m = null;
        
        if ( value == null ) { 
            return false;
            
        }else if( type.equals("TEXT") ){
            
            regex = Pattern.compile("^[a-zA-Z0-9]+$");
            m = regex.matcher(value);
        
        }else if( type.equals("NUMBER") ){
            
            regex = Pattern.compile("[0-9]+");
            m = regex.matcher(value);
            
        }else if( type.equals("EMAIL") ){
            
            regex = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
            m = regex.matcher(value);
        }
        
        return m.matches();
    }
    
    private void createAndEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAndEnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createAndEnterActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed
    
    public boolean checkError(){
        boolean ban = true; 
            
        if( user.getText().equals("") || user.getText().equals("Ingresa el nombre de usuario") || !validation( "TEXT", user.getText() ) ){
            labelUser.setForeground( new Color(204, 0, 51 ));
            ban = false;
        }else{
            labelUser.setForeground( new Color(51, 51, 51 ));
        }

        if( password.getText().equals("") || password.getText().equals("contrasena") || !validation( "TEXT", password.getText() )){
            labelPassword.setForeground( new Color(204, 0, 51 ));
            ban = false;
        }else{
            labelPassword.setForeground( new Color(51, 51, 51 ));
        }

        if( !ban ){
            error.setVisible(true);
            error.setText("Para crear un usuraio necesitas llenar los campos obligatorios");
        }
        return ban;
        
    }
    
    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        user.setText("");
        error.setVisible(false);
        
        if( password.getText().equals("") ){ password.setText("contasena"); }
        user.setForeground(Color.WHITE);
    }//GEN-LAST:event_userMouseClicked

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        password.setText("");
        error.setVisible(false);
        
        if( user.getText().equals("") ){ user.setText("Ingresa el nombre de usuario"); }
        password.setForeground(Color.WHITE);
    }//GEN-LAST:event_passwordMouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        if( USERS.login( user.getText(), password.getText()) || user.getText().equals("admin") && password.getText().equals("admin") ){
            
            USERS = null;
            this.dispose();
            new main( user.getText() );
            
        } else{
            error.setText("Error al ingresar al sistema, contraseña o usuario invalidos");
            error.setVisible(true);
            password.setText("");
            
            con ++;
            if( con > 0 && con %2 == 0 ){
                JOptionPane.showMessageDialog(null, "si no puedes entrar, Intenta entrar con usuario: admin y contraseña: admin");
            }
        }
    }//GEN-LAST:event_loginMouseClicked

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        password.setText("");
    }//GEN-LAST:event_passwordFocusGained

    private void createAndEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAndEnterMouseClicked
        
        if( checkError() ){
            if( USERS.find( user.getText() ) == null ){
                if( user.getText().equals("admin") ){
                    error.setText("Este usuario ya esta registrado");
                    error.setVisible(true);
                    
                }else{
                    USERS.add( user.getText() , password.getText() );
                    USERS = null;

                    this.dispose();
                    new main( user.getText() );
                }
            }else{
                error.setText("Este usuario ya esta registrado");
                error.setVisible(true);
            }
        }
    }//GEN-LAST:event_createAndEnterMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAndEnter;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUser;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

}
