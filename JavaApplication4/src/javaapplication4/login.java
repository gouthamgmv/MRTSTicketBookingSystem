/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class login extends javax.swing.JFrame {
    /**
     * Creates new form login
     */
     java.sql.Connection con;
    Statement st;
 PreparedStatement pstmt;
 ResultSet rs;
 CallableStatement cstmt;
 int b=100;
    public login() {
        String dburl="jdbc:mysql://localhost:3306/ts";
    try 
    {
     Class.forName("com.mysql.jdbc.Driver").newInstance();	
     System.out.println("Driver Loaded Succesfully!");
     con = DriverManager.getConnection (dburl,"root","ssn");
     System.out.println("Connection Established!");      
     } 
     catch(ClassNotFoundException e) 
     {
		        System.out.println("Driver not loaded!");
     }
     catch(SQLException e) 
	{
		        System.out.println("Connection not established!");
	}
     catch(Exception e)
	{
			System.out.println("Instantiation exception.");
	}
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_un = new javax.swing.JLabel();
        lb_pw = new javax.swing.JLabel();
        txt_un = new javax.swing.JTextField();
        txt_pw = new javax.swing.JPasswordField();
        bt_log = new javax.swing.JButton();
        bt_clr = new javax.swing.JButton();
        lb_euser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lb_nun = new javax.swing.JLabel();
        lb_npw = new javax.swing.JLabel();
        txt_nun = new javax.swing.JTextField();
        txt_npw = new javax.swing.JPasswordField();
        bt_reg = new javax.swing.JButton();
        bt_clr2 = new javax.swing.JButton();
        bt_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_un.setText("Username:");

        lb_pw.setText("Password:");

        txt_pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pwActionPerformed(evt);
            }
        });

        bt_log.setText("Login");
        bt_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_logActionPerformed(evt);
            }
        });

        bt_clr.setText("Clear");
        bt_clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_clrActionPerformed(evt);
            }
        });

        lb_euser.setText("Existing User");

        jLabel1.setText("New User");

        lb_nun.setText("Username:");

        lb_npw.setText("Password:");

        bt_reg.setText("Register");
        bt_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_regActionPerformed(evt);
            }
        });

        bt_clr2.setText("Clear");
        bt_clr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_clr2ActionPerformed(evt);
            }
        });

        bt_back.setText("Back");
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(bt_log)
                        .addGap(47, 47, 47)
                        .addComponent(bt_clr)
                        .addGap(140, 140, 140)
                        .addComponent(bt_reg)
                        .addGap(31, 31, 31)
                        .addComponent(bt_clr2)
                        .addGap(28, 28, 28)
                        .addComponent(bt_back))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_pw)
                                .addGap(18, 18, 18)
                                .addComponent(txt_pw))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_un)
                                .addGap(18, 18, 18)
                                .addComponent(txt_un, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_nun)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nun, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_npw)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_npw))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lb_euser)
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_euser)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_un)
                    .addComponent(txt_un)
                    .addComponent(lb_nun)
                    .addComponent(txt_nun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_pw)
                    .addComponent(lb_npw)
                    .addComponent(txt_npw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_log)
                    .addComponent(bt_clr)
                    .addComponent(bt_reg)
                    .addComponent(bt_clr2)
                    .addComponent(bt_back))
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_logActionPerformed
        try {
            pstmt=con.prepareStatement("select pword from user where uname=?");
                  pstmt.setString(1,txt_un.getText());
                  rs=pstmt.executeQuery();
                  rs.next();
                  String a;
                  a=txt_pw.getText();
                  if(a.equals(rs.getString(1)))
                  {
                      JOptionPane.showMessageDialog(this,"Login successful!");
                                     new postlogin().setVisible(true); // TODO add your handling code here:
                  }       
                  else
                  {
                      txt_un.setText("");
                       txt_pw.setText("");
                       JOptionPane.showMessageDialog(this,"Wrong username or password");
                  }
        } catch (SQLException ex) {
txt_un.setText("");
                       txt_pw.setText("");
                       JOptionPane.showMessageDialog(this,"Wrong username or password");
                          }
            
          
    }//GEN-LAST:event_bt_logActionPerformed

    private void bt_clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_clrActionPerformed
        txt_un.setText("");
        txt_pw.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_bt_clrActionPerformed

    private void txt_pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pwActionPerformed

    private void bt_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_regActionPerformed
      try {
            Random rand = new Random();
            Integer a;
				Object[] o = { new Integer(rand.nextInt(1000)) };
				a = (Integer)o[rand.nextInt(1)]; 
                      
            pstmt=con.prepareStatement("insert into user values(?,?,?)");
            String s=a.toString();
            pstmt.setString(1,s);
            pstmt.setString(2,txt_nun.getText());
            pstmt.setString(3,txt_npw.getText());
            pstmt.execute();
            JOptionPane.showMessageDialog(this,"Registered Succesfully");
        }
         catch(SQLException ex)
    {
         JOptionPane.showMessageDialog(this,"Username already taken! Please enter new username!");
    }     // TODO add your handling code here:
    }//GEN-LAST:event_bt_regActionPerformed

    private void bt_clr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_clr2ActionPerformed
                txt_nun.setText("");
                 txt_npw.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_bt_clr2ActionPerformed

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_backActionPerformed

    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
       
        //</editor-fold>

        /*
         * Create and display the form
         */
     /*   java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new login().setVisible(true);
            }
        });
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_clr;
    private javax.swing.JButton bt_clr2;
    private javax.swing.JButton bt_log;
    private javax.swing.JButton bt_reg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_euser;
    private javax.swing.JLabel lb_npw;
    private javax.swing.JLabel lb_nun;
    private javax.swing.JLabel lb_pw;
    private javax.swing.JLabel lb_un;
    private javax.swing.JPasswordField txt_npw;
    private javax.swing.JTextField txt_nun;
    private javax.swing.JPasswordField txt_pw;
    private javax.swing.JTextField txt_un;
    // End of variables declaration//GEN-END:variables
}
