/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.passwordmanager;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author me
 */
public class MainForm extends javax.swing.JFrame {

    private Connection con;
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    private DefaultListModel model = new DefaultListModel();
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        getList();
    }

    
    
    
    //method load list entry
    private void getList(){
        try {
            model.clear();
            con = koneksi.getKoneksi();
            st = con.createStatement();
            rs = st.executeQuery("SELECT i2.name_item, i1.id_item FROM item i1 JOIN item i2 ON i1.id_item = i2.id_item");
            while(rs.next()){
                String list = rs.getString("name_item");
                model.addElement(list);
            }
            listEntry.setModel(model);
            con.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }
    
    //method generate id entry
    private String ent(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime now = LocalDateTime.now();
        return "ENT" + now.format(dtf);   
    }
    
    //method bersihkan panel new entry dan entry
    private void bersihNew(){
        txtNameNew.setText("");
        txtUsernameNew.setText("");
        txtPasswordNew.setText("");
    }
    private void bersihEntry(){
        txtName.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listEntry = new javax.swing.JList<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Entry = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnEdit = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        txtUsernameNew = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPasswordNew = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNameNew = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listEntry.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listEntry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listEntryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listEntry);

        Entry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntryMouseClicked(evt);
            }
        });

        txtName.setEditable(false);
        txtName.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel6.setText("password");

        txtUsername.setEditable(false);
        txtUsername.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel5.setText("username");

        txtPassword.setEditable(false);
        txtPassword.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel4.setText("name");

        btnDelete.setText("delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 255, 102));
        btnEdit.setText("edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EntryLayout = new javax.swing.GroupLayout(Entry);
        Entry.setLayout(EntryLayout);
        EntryLayout.setHorizontalGroup(
            EntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EntryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(txtUsername)
                    .addComponent(txtName)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(438, Short.MAX_VALUE))
        );
        EntryLayout.setVerticalGroup(
            EntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EntryLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Entry", Entry);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        btnAdd.setText("add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel7.setText("password");

        jLabel8.setText("username");

        jLabel9.setText("name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNameNew, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(txtUsernameNew, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(btnAdd)
                            .addComponent(txtPasswordNew, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(438, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNameNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsernameNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPasswordNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("New Entry", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try {
            String name = txtNameNew.getText();
            String username = txtUsernameNew.getText();
            String password = txtPasswordNew.getText();
            
            con = koneksi.getKoneksi();
            ps = con.prepareStatement("INSERT INTO item VALUES (?,?,?,?)");
            ps.setString(1, ent());
            ps.setString(2, name);
            ps.setString(3, username);
            ps.setString(4, password);
            if(name.isEmpty() || username.isEmpty() || password.isEmpty()){
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Added");
                bersihNew();
                getList();
            }else{
                JOptionPane.showMessageDialog(this, "lengkapi form");
            }
            
            con.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    //event ketika mouse di click pada list entry, maka akan menampilkan data dari list ke jtextfield
    private void listEntryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listEntryMouseClicked
        // TODO add your handling code here:
        try {
            String selectedModel = listEntry.getSelectedValue();
            
            String username = getUsername(selectedModel);
            txtUsername.setText(username);
            
            String name = getName(selectedModel);
            txtName.setText(name);
            
            String password = getPassword(selectedModel);
            txtPassword.setText(password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_listEntryMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            con = koneksi.getKoneksi();
            String name = txtName.getText();
            ps = con.prepareStatement("DELETE FROM item WHERE name_item='"+name+"'");

            
            int answer = JOptionPane.showConfirmDialog(this, "apakah kamu yakin",null,JOptionPane.YES_NO_OPTION);
            if(answer == JOptionPane.YES_OPTION){
                ps.execute();
                JOptionPane.showMessageDialog(this, "entry berhasil dihapus");
                getList();
                bersihEntry();
            }else{
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            con = koneksi.getKoneksi();
            String name = txtName.getText();
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            ps = con.prepareStatement("UPDATE item SET name_item = '"+name+"', username_item = '"+username+"', password_item ='"+password+"' WHERE name_item='"+name+"'");
            int answer = JOptionPane.showConfirmDialog(this, "simpan perubahan?",null,JOptionPane.YES_NO_OPTION);
            if(answer == JOptionPane.YES_OPTION){
                ps.execute();
                getList();
                
                JOptionPane.showMessageDialog(this, "berhasil diupdate");
            }else{
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if(btnEdit.isSelected()){
            btnEdit.setBackground(new Color(0x99FF33));
            txtName.setEditable(true);
            txtUsername.setEditable(true);
            txtPassword.setEditable(true);
            btnUpdate.setEnabled(true);
        }else{
            btnEdit.setBackground(new Color(0xFFFF66));
            txtName.setEditable(false);
            txtUsername.setEditable(false);
            txtPassword.setEditable(false);
            btnUpdate.setEnabled(false); 
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void EntryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntryMouseClicked
        // TODO add your handling code here:
        listEntry.clearSelection();
        bersihEntry();
    }//GEN-LAST:event_EntryMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        bersihNew();
    }//GEN-LAST:event_jPanel1MouseClicked

    //method get Name
    private String getName(String name){
        String result="";
        try {
            con = koneksi.getKoneksi();
            ps = con.prepareStatement("SELECT name_item FROM item WHERE name_item=?");
            ps.setString(1, name);
            rs = ps.executeQuery();
            if(rs.next()){
                result = rs.getString("name_item");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        return result;
    }
    
    //method get username
    private String getUsername(String name){
        String result="";
        try {
            con = koneksi.getKoneksi();
            ps = con.prepareStatement("SELECT username_item FROM item WHERE name_item=?");
            ps.setString(1, name);
            rs = ps.executeQuery();
            if(rs.next()){
                result = rs.getString("username_item");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        return result;
    }
    
    //method get password
    private String getPassword(String name){
        String result="";
        try {
            con = koneksi.getKoneksi();
            ps = con.prepareStatement("SELECT password_item FROM item WHERE name_item=?");
            ps.setString(1, name);
            rs = ps.executeQuery();
            if(rs.next()){
                result = rs.getString("password_item");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        return result;
    }
    
    
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Entry;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JToggleButton btnEdit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> listEntry;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNameNew;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPasswordNew;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUsernameNew;
    // End of variables declaration//GEN-END:variables
}
