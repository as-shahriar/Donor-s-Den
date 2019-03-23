
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asif Shahriar
 */
public class Register extends javax.swing.JFrame {

    static int indexCity,indexBg,ind,inm,iny;
    
    public Register() {
        initComponents();
    }

    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING); 
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
   
         }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        submitReg = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fuser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        fpass2 = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        fcell = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<String>();
        jLabel13 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<String>();
        jComboBox5 = new javax.swing.JComboBox<String>();
        jSeparator5 = new javax.swing.JSeparator();
        fpass1 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(52, 73, 94));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitReg.setBackground(new java.awt.Color(249, 89, 14));
        submitReg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitReg.setForeground(new java.awt.Color(255, 255, 255));
        submitReg.setText("Submit");
        submitReg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitRegActionPerformed(evt);
            }
        });
        jPanel1.add(submitReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 350, 60, 30));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 163, 10));

        fuser.setBackground(new java.awt.Color(52, 73, 94));
        fuser.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        fuser.setForeground(new java.awt.Color(255, 255, 255));
        fuser.setBorder(null);
        jPanel1.add(fuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 250, 160, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 71, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 170, 10));

        fpass2.setBackground(new java.awt.Color(52, 73, 94));
        fpass2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fpass2.setForeground(new java.awt.Color(255, 255, 255));
        fpass2.setBorder(null);
        jPanel1.add(fpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 280, 150, -1));

        jPanel3.setBackground(new java.awt.Color(249, 89, 14));

        jLabel2.setFont(new java.awt.Font("Adobe Garamond Pro Bold", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Donor's Den");

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create new Account");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(341, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(135, 135, 135)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        fname.setBackground(new java.awt.Color(52, 73, 94));
        fname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        fname.setForeground(new java.awt.Color(255, 255, 255));
        fname.setBorder(null);
        fname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fnameMouseClicked(evt);
            }
        });
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 163, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 163, 10));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cell No:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        fcell.setBackground(new java.awt.Color(52, 73, 94));
        fcell.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        fcell.setForeground(new java.awt.Color(255, 255, 255));
        fcell.setBorder(null);
        jPanel1.add(fcell, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 90, 160, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 163, -1));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Blood Group:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(52, 73, 94));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "B+", "O+", "AB+", "A-", "B-", "O-", "AB-" }));
        jComboBox1.setBorder(null);
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 163, -1));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("City: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 40, -1));

        jComboBox2.setBackground(new java.awt.Color(52, 73, 94));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bagerhat ", "Bandarban ", "Barguna ", "Barisal ", "Bhola ", "Bogra ", "Brahmanbaria ", "Chandpur ", "Chittagong ", "Chuadanga ", "Comilla ", "Cox's Bazar ", "Dhaka ", "Dinajpur ", "Faridpur ", "Feni ", "Gaibandha ", "Gazipur ", "Gopalganj ", "Habiganj ", "Jaipurhat ", "Jamalpur ", "Jessore ", "Jhalakati ", "Jhenaidah ", "Khagrachari ", "Khulna ", "Kishoreganj ", "Kurigram ", "Kushtia ", "Lakshmipur ", "Lalmonirhat ", "Madaripur ", "Magura ", "Manikganj ", "Meherpur ", "Moulvibazar ", "Munshiganj ", "Mymensingh ", "Naogaon ", "Narail ", "Narayanganj ", "Narsingdi ", "Natore ", "Nawabganj ", "Netrakona ", "Nilphamari ", "Noakhali ", "Pabna ", "Panchagarh ", "Parbattya Chattagram", "Patuakhali ", "Pirojpur ", "Rajbari ", "Rajshahi ", "Rangpur ", "Satkhira ", "Shariatpur ", "Sherpur ", "Sirajganj ", "Sunamganj ", "Sylhet ", "Tangail ", "Thakurgaon " }));
        jComboBox2.setBorder(null);
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 340, 340));

        jComboBox3.setBackground(new java.awt.Color(52, 73, 94));
        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox3.setBorder(null);
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, -1, 30));

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Last Donation:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, 20));

        jComboBox4.setBackground(new java.awt.Color(52, 73, 94));
        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBox4.setBorder(null);
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, 30));

        jComboBox5.setBackground(new java.awt.Color(52, 73, 94));
        jComboBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2020", "2019", "2018", "2017" }));
        jComboBox5.setBorder(null);
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 170, 10));

        fpass1.setBackground(new java.awt.Color(52, 73, 94));
        fpass1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fpass1.setForeground(new java.awt.Color(255, 255, 255));
        fpass1.setBorder(null);
        jPanel1.add(fpass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 310, 150, -1));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Confirm Password:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 130, -1));

        jButton2.setBackground(new java.awt.Color(69, 86, 104));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Login");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 63, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitRegActionPerformed
        String name = fname.getText();
        String cell = fcell.getText();
        String user = fuser.getText();
        String pass1 = fpass1.getText();
        String pass2 = fpass2.getText();
        String bg=(String)jComboBox1.getSelectedItem();
        String city =(String)jComboBox2.getSelectedItem();
        int day=Integer.parseInt((String)jComboBox3.getSelectedItem());
        int month=Integer.parseInt((String)jComboBox4.getSelectedItem());
        int year=Integer.parseInt((String)jComboBox5.getSelectedItem());
        
        if(name.length()==0 || cell.length()==0 || user.length()==0 || pass1.length()==0 ){
            JOptionPane.showMessageDialog(null,"Fill up everything!");
            return;
        }
        
        if(!pass1.equals(pass2)){
             JOptionPane.showMessageDialog(null,"Password do not match!");
             return;
        }
        try {
            if(new Database().isUser(user)){
                JOptionPane.showMessageDialog(null,"Username Exist!\nTry another");
                return;
            }
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null,"Connection Problem", "Error",JOptionPane.INFORMATION_MESSAGE);
        } 
        
        try {
            new Database().reg(name, cell, bg,city, day,month ,year , user, pass2);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Connection Problem", "Error",JOptionPane.INFORMATION_MESSAGE);
       }
        indexCity = jComboBox2.getSelectedIndex();
        indexBg = jComboBox1.getSelectedIndex();
        ind=jComboBox3.getSelectedIndex();
        inm=jComboBox4.getSelectedIndex();
        iny=jComboBox5.getSelectedIndex();
         
        JOptionPane.showMessageDialog(null,"Registration Successful!");
        new Login().setVisible(true);
        close();
            
    }//GEN-LAST:event_submitRegActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       new Login().setVisible(true);
       close();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fnameMouseClicked
       fname.setText("");
    }//GEN-LAST:event_fnameMouseClicked

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fcell;
    private javax.swing.JTextField fname;
    private javax.swing.JPasswordField fpass1;
    private javax.swing.JPasswordField fpass2;
    private javax.swing.JTextField fuser;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton submitReg;
    // End of variables declaration//GEN-END:variables
}
