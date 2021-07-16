package Proyecto_final.views;

import Proyecto_final.clases.Contacts;
import Proyecto_final.clases.ReadFilesContacts;
import Proyecto_final.clases.ReadFilesUsers;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author franciscobecerra
 */
public class main extends javax.swing.JFrame {
    private String login;
    DefaultListModel LIST;
    ReadFilesContacts READ;
    String AUX = "";
            
    public main( String login ) {
        this.login = login;
        
        center();
        READ = new ReadFilesContacts();
        
        initComponents();
        setState("SETUP");
        
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listContacts = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        textEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        labelLastname = new javax.swing.JLabel();
        textNumber = new javax.swing.JTextField();
        textName = new javax.swing.JTextField();
        labelNumber = new javax.swing.JLabel();
        textLastname = new javax.swing.JTextField();
        labelName = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        newB = new javax.swing.JButton();
        cancele = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        updateAccount = new javax.swing.JMenuItem();
        deleteAccount = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listContacts.setBackground(new java.awt.Color(255, 255, 255));
        listContacts.setFont(new java.awt.Font("Avenir Next", 0, 16)); // NOI18N
        listContacts.setForeground(new java.awt.Color(51, 51, 51));
        listContacts.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listContactsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listContacts);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 236, 260));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delete.setBackground(new java.awt.Color(255, 102, 102));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("ELIMINAR");
        delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.setOpaque(true);
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, 120, 28));

        update.setBackground(new java.awt.Color(0, 204, 204));
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("MODIFICAR");
        update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.setOpaque(true);
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 12, 121, 28));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        textEmail.setBackground(new java.awt.Color(204, 204, 204));
        textEmail.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        textEmail.setForeground(new java.awt.Color(51, 51, 51));
        textEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        textEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textEmailFocusGained(evt);
            }
        });
        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });

        labelEmail.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(51, 51, 51));
        labelEmail.setText("CORREO");

        labelLastname.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        labelLastname.setForeground(new java.awt.Color(51, 51, 51));
        labelLastname.setText("APELLIDOS");

        textNumber.setBackground(new java.awt.Color(204, 204, 204));
        textNumber.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        textNumber.setForeground(new java.awt.Color(51, 51, 51));
        textNumber.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        textNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textNumberFocusGained(evt);
            }
        });

        textName.setBackground(new java.awt.Color(204, 204, 204));
        textName.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        textName.setForeground(new java.awt.Color(51, 51, 51));
        textName.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        textName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textNameFocusGained(evt);
            }
        });

        labelNumber.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        labelNumber.setForeground(new java.awt.Color(51, 51, 51));
        labelNumber.setText("TELEFONO");

        textLastname.setBackground(new java.awt.Color(204, 204, 204));
        textLastname.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        textLastname.setForeground(new java.awt.Color(51, 51, 51));
        textLastname.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        textLastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textLastnameFocusGained(evt);
            }
        });

        labelName.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        labelName.setForeground(new java.awt.Color(51, 51, 51));
        labelName.setText("NOMBRE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNumber)
                    .addComponent(labelName)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmail)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLastname)
                    .addComponent(textLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLastname)
                    .addComponent(labelName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumber)
                    .addComponent(labelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 52, -1, -1));

        add.setBackground(new java.awt.Color(0, 153, 102));
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("CREAR");
        add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add.setOpaque(true);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 253, 121, 28));

        newB.setBackground(new java.awt.Color(0, 153, 101));
        newB.setForeground(new java.awt.Color(255, 255, 255));
        newB.setText("NUEVO");
        newB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        newB.setOpaque(true);
        newB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newBMouseClicked(evt);
            }
        });
        jPanel1.add(newB, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 12, 121, 28));

        cancele.setBackground(new java.awt.Color(255, 102, 102));
        cancele.setForeground(new java.awt.Color(255, 255, 255));
        cancele.setText("CANCELAR");
        cancele.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancele.setOpaque(true);
        cancele.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canceleMouseClicked(evt);
            }
        });
        jPanel1.add(cancele, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 253, 121, 28));

        error.setBackground(new java.awt.Color(255, 255, 255));
        error.setForeground(new java.awt.Color(204, 0, 51));
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error.setText("hola");
        jPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 470, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 490, 310));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Geometos", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(listContacts);
        jLabel1.setText("CONTACTOS");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 330));

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setForeground(new java.awt.Color(51, 51, 51));

        menu.setBackground(new java.awt.Color(153, 153, 153));
        menu.setText("usuario");

        updateAccount.setText("Cambiar contraseña");
        updateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateAccountMouseClicked(evt);
            }
        });
        updateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAccountActionPerformed(evt);
            }
        });
        menu.add(updateAccount);

        deleteAccount.setText("Eliminar cuenta");
        deleteAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteAccountMouseClicked(evt);
            }
        });
        deleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountActionPerformed(evt);
            }
        });
        menu.add(deleteAccount);

        jMenuBar1.add(menu);

        setJMenuBar(jMenuBar1);

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
    
    public void center(){    
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation( dim.width / 2 - 370 , dim.height / 2 - 180 );
    }
    
    public void updateList(){
        LIST = new DefaultListModel();
        ArrayList<Contacts> CONTACTS = READ.get();        
        
        for( Contacts contact : CONTACTS ){
            LIST.addElement( contact.getName() +" "+ contact.getLastname() );
        }
        
        listContacts.setModel(LIST);
    }
    
    public boolean checkCreateButton(){
        boolean aux = true;
        
        labelName.setForeground(new Color( 51, 51, 51 ));
        labelLastname.setForeground(new Color( 51, 51, 51 ));
        labelNumber.setForeground(new Color( 51, 51, 51 ));
        labelEmail.setForeground(new Color( 51, 51, 51 ));
        
        error.setVisible(false);
        
        
        if( !validation( "TEXT", textName.getText() )){
            labelName.setForeground(new Color( 204, 0, 51 ));
            aux = false;
        }
        
        if( !validation( "TEXT", textLastname.getText()) ){
            labelLastname.setForeground(new Color( 204, 0, 51 ));
            aux = false;
        }
        
        if( !validation( "NUMBER", textNumber.getText()) ){
            labelNumber.setForeground(new Color( 204, 0, 51 ));
            aux = false;
        }
        
        if( !validation( "EMAIL", textEmail.getText()) ){
            labelEmail.setForeground(new Color( 204, 0, 51 ));
            aux = false;
        }
        
        if( !aux ){
            error.setText("ES NECERIO LLENAR TODOS LOS CAMPOS EN ROJO");
            error.setVisible(true);
        }
        
        return aux;
    }
    
    public void setState( String state ){
        if( state.equals("SETUP") ){
            add.setVisible(false);
            cancele.setVisible(false);
            delete.setEnabled(false);
            update.setEnabled(false);
            error.setVisible(false);

            textName.setEnabled(false);
            textLastname.setEnabled(false);
            textNumber.setEnabled(false);
            textEmail.setEnabled(false);
            
            updateList();
            menu.setText(this.login);
            if( this.login.equals("admin") ){
                menu.setEnabled(false);
            }
            
        }else if( state.equals("EDIT") ){

            add.setVisible(true);
            cancele.setVisible(true);
            
            update.setVisible(false);
            delete.setVisible(false);
            newB.setVisible(false);
            
            textName.setEnabled(true);
            textLastname.setEnabled(true);
            textNumber.setEnabled(true);
            textEmail.setEnabled(true);

            textName.setText("");
            textName.setBackground(new Color(251, 237, 187));

            textLastname.setText("");
            textLastname.setBackground(new Color(251, 237, 187));

            textNumber.setText("");
            textNumber.setBackground(new Color(251, 237, 187));

            textEmail.setText("");
            textEmail.setBackground(new Color(251, 237, 187));
            
        }else if( state.equals("NO_EDIT") ){

            add.setText("CREAR");
            
            update.setVisible(true);
            delete.setVisible(true);
            newB.setVisible(true);
            
            add.setVisible(false);
            cancele.setVisible(false);
            
            textName.setEnabled(false);
            textLastname.setEnabled(false);
            textNumber.setEnabled(false);
            textEmail.setEnabled(false);
            update.setEnabled(false);
            delete.setEnabled(false);

            textName.setBackground(new Color(204, 204, 204));
            textLastname.setBackground(new Color(204, 204, 204));
            textNumber.setBackground(new Color(204, 204, 204));
            textEmail.setBackground(new Color(204, 204, 204));
            
        }else if( state.equals("UPDATE") ){
            
            update.setEnabled(true);
            delete.setEnabled(true);
            
            textName.setEnabled(true);
            textLastname.setEnabled(true);
            textNumber.setEnabled(true);
            textEmail.setEnabled(true);

            textName.setBackground(new Color(251, 237, 187));
            textLastname.setBackground(new Color(251, 237, 187));
            textNumber.setBackground(new Color(251, 237, 187));
            textEmail.setBackground(new Color(251, 237, 187));
            
        }else if( state.equals("ITEM_SELECTED") ){ 
            update.setEnabled(true);
            delete.setEnabled(true);
            
        }else if( state.equals("CLEAR") ){
            textName.setText("");
            textLastname.setText("");
            textNumber.setText("");
            textEmail.setText("");
            
            labelName.setForeground(new Color( 51, 51, 51 ));
            labelLastname.setForeground(new Color( 51, 51, 51 ));
            labelNumber.setForeground(new Color( 51, 51, 51 ));
            labelEmail.setForeground(new Color( 51, 51, 51 ));

            error.setVisible(false);

        }else if( state.equals("UPDATE_SETUP") ){
            add.setText("ACTUALIZAR");
            
            add.setVisible(true);
            cancele.setVisible(true);
            
//            delete.setEnabled(false);
//            newB.setEnabled(false);
        }
        
    }
    
    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        
        if( checkCreateButton() ){
            
            if( add.getText() == "CREAR" ){
                READ.add( textName.getText(), textLastname.getText(), textNumber.getText(), textEmail.getText() );

                setState("NO_EDIT");
                setState("CLEAR");

                JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                updateList();
                
            }else if( add.getText() == "ACTUALIZAR" ){
            
                READ.update( AUX, textName.getText(), textLastname.getText(), textNumber.getText(), textEmail.getText() );

                AUX = "";
                add.setVisible(false);
                add.setText("CREAR");

                setState("NO_EDIT");

                JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                updateList();
            }
        }
    }//GEN-LAST:event_addMouseClicked

    private void newBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newBMouseClicked
        add.setText("CREAR");
        setState("EDIT");
    }//GEN-LAST:event_newBMouseClicked

    private void canceleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canceleMouseClicked
        setState("CLEAR");
        setState("NO_EDIT");
        
//        newB.setEnabled(true);
        
    }//GEN-LAST:event_canceleMouseClicked

    private void listContactsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listContactsValueChanged
        Contacts constact = READ.find( listContacts.getSelectedValue() );
        AUX = listContacts.getSelectedValue();
        
        if( constact != null ){
            setState("ITEM_SELECTED");

            textName.setText( constact.getName() );
            textLastname.setText( constact.getLastname() );
            textNumber.setText( constact.getNumber() );
            textEmail.setText( constact.getEmail() ); 
        }
        
    }//GEN-LAST:event_listContactsValueChanged

    private void textNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNameFocusGained
        
    }//GEN-LAST:event_textNameFocusGained

    private void textLastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textLastnameFocusGained
    
    }//GEN-LAST:event_textLastnameFocusGained

    private void textNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNumberFocusGained

    }//GEN-LAST:event_textNumberFocusGained

    private void textEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textEmailFocusGained

    }//GEN-LAST:event_textEmailFocusGained

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
//        LIST.setElementAt( "hola perros", listContacts.getSelectedIndex() );
        setState("UPDATE");
        setState("UPDATE_SETUP");
        
    }//GEN-LAST:event_updateMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
        
        if( resp == 0 ){
            setState("NO_EDIT");
            setState("CLEAR");
            
            READ.delete( listContacts.getSelectedValue() );
            updateList();
        }
        
    }//GEN-LAST:event_deleteMouseClicked

    private void updateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAccountActionPerformed
        String respuesta = JOptionPane.showInputDialog(null, "Escribe tu nueva contraseña");
        
        ReadFilesUsers USERS = new ReadFilesUsers();
        USERS.update( login, respuesta );
        USERS = null;
        
        JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
    }//GEN-LAST:event_updateAccountActionPerformed

    private void deleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccountActionPerformed
        if( !login.equals("-") ){
            
            ReadFilesUsers USERS = new ReadFilesUsers();
            USERS.delete( login );
            USERS = null;
        }
        System.exit(0);
    }//GEN-LAST:event_deleteAccountActionPerformed

    private void updateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateAccountMouseClicked
    }//GEN-LAST:event_updateAccountMouseClicked

    private void deleteAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAccountMouseClicked
    }//GEN-LAST:event_deleteAccountMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main( "admin" ).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton cancele;
    private javax.swing.JButton delete;
    private javax.swing.JMenuItem deleteAccount;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelLastname;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelNumber;
    private javax.swing.JList<String> listContacts;
    private javax.swing.JMenu menu;
    private javax.swing.JButton newB;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textLastname;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textNumber;
    private javax.swing.JButton update;
    private javax.swing.JMenuItem updateAccount;
    // End of variables declaration//GEN-END:variables
}
