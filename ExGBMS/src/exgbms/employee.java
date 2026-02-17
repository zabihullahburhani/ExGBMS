/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exgbms;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;

public class employee extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public employee() {
        initComponents();
        getConnection();
        
        jPanel1.requestFocus();
        setLocationRelativeTo(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    // د ډیټابېس مسیر (Path)
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    void getConnection() {
        
        try {
            // SQLite Driver Load
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:./src/db/Golds-1.db");
            
            System.out.println("cont");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("not found" + ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    // -------------countting customer -----------------------

    @SuppressWarnings("unchecxxxked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtfulname = new javax.swing.JTextField();
        txtnic = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        picture = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_trash_25px.png"))); // NOI18N
        jButton1.setText("حذف");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 120, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_macos_minimize_25px.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 30, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_multiply_25px.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 30, 30));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ثبت کارمندان");
        jLabel7.setToolTipText("");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 320, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("آی دی کارمند:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 190, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_search_25px.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
        });
        jLabel9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel9KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel9KeyTyped(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 30, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("نمبرتذکره:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 190, -1));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("نوع یوز:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 190, 30));

        txtID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDFocusLost(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 270, 40));

        txtfulname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfulname.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtfulname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtfulname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfulnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfulnameFocusLost(evt);
            }
        });
        jPanel1.add(txtfulname, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 270, 40));

        txtnic.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtnic.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtnic.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtnic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnicFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnicFocusLost(evt);
            }
        });
        txtnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnicActionPerformed(evt);
            }
        });
        jPanel1.add(txtnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 270, 40));

        txtphone.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtphone.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtphone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtphone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtphoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtphoneFocusLost(evt);
            }
        });
        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });
        txtphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtphoneKeyTyped(evt);
            }
        });
        jPanel1.add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 270, 40));

        jButton2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_add_25px.png"))); // NOI18N
        jButton2.setText("ثبت");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 320, 120, 40));

        jButton3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_installing_updates_25px.png"))); // NOI18N
        jButton3.setText("عکس");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 130, 40));

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("نام کامل:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 190, -1));

        picture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        picture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 130, 110));

        jButton4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_installing_updates_25px.png"))); // NOI18N
        jButton4.setText("ویرایش");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 130, 40));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "manager" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 270, 40));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("تفلون:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, 190, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //        //کودحذف

        try {
            
            String txtid = txtID.getText();
            String full = txtfulname.getText();
            if (txtid.equals("") || full.equals("")) {
                JOptionPane.showMessageDialog(this, "اول باید معلومات را از دیتابییس بگیرید سپس حذف کنید!");
                
            } else {
                
                ps = conn.prepareStatement("DELETE FROM Employee WHERE Employee_id=?");
                ps.setString(1, txtID.getText());
                int a = JOptionPane.showConfirmDialog(null, "ایاموفق هستیدکه" + txtID.getText() + "است حذف شود؟", "پيام برنامه", JOptionPane.YES_OPTION);
                if (a == 0) {
                    
                    ps.executeUpdate();
                    ps.close();
                    JOptionPane.showMessageDialog(null, "موافقانه مشتری حذف شد");
                    txtID.setText("");
                    txtfulname.setText("");
                    picture.setIcon(null);
                    txtphone.setText("");
                    txtnic.setText("");
                    
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnicActionPerformed

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void txtIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusGained
        
        txtID.setBorder(new MatteBorder(0, 0, 2, 0, Color.BLUE));
        try {
            ps = conn.prepareStatement("select max(Employee_id)+1 from Employee");
            rs = ps.executeQuery();
            if (rs.next()) {
                txtID.setText(rs.getString("max(Employee_id)+1"));
            }
        } catch (Exception e) {
            
        }

    }//GEN-LAST:event_txtIDFocusGained

    private void txtIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusLost
        
        txtID.setBorder(new MatteBorder(0, 0, 1, 0, Color.GRAY));
    }//GEN-LAST:event_txtIDFocusLost

    private void txtfulnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfulnameFocusGained
        
        txtfulname.setBorder(new MatteBorder(0, 0, 2, 0, Color.BLUE));
    }//GEN-LAST:event_txtfulnameFocusGained

    private void txtfulnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfulnameFocusLost
        
        txtfulname.setBorder(new MatteBorder(0, 0, 1, 0, Color.GRAY));
    }//GEN-LAST:event_txtfulnameFocusLost

    private void txtnicFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnicFocusGained
        txtnic.setBorder(new MatteBorder(0, 0, 2, 0, Color.BLUE));
    }//GEN-LAST:event_txtnicFocusGained

    private void txtnicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnicFocusLost
        
        txtnic.setBorder(new MatteBorder(0, 0, 1, 0, Color.GRAY));
    }//GEN-LAST:event_txtnicFocusLost

    private void txtphoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtphoneFocusGained
        
        txtphone.setBorder(new MatteBorder(0, 0, 2, 0, Color.BLUE));
    }//GEN-LAST:event_txtphoneFocusGained

    private void txtphoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtphoneFocusLost
        txtphone.setBorder(new MatteBorder(0, 0, 1, 0, Color.GRAY));        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String id = txtID.getText();
            String full = txtfulname.getText();
            String nic = txtnic.getText();
            String p = txtphone.getText();
            
            if (id.equals("") || full.equals("") || nic.equals("") || p.equals("")) {
                new fill().setVisible(true);
            } else {
                ps = conn.prepareStatement("INSERT INTO Employee(Employee_id,Fullname,Role,Phone,NIC,Profile_picture)VALUES(?,?,?,?,?,?)");
                ps.setString(1, txtID.getText());
                ps.setString(2, txtfulname.getText());
                ps.setString(3, jComboBox1.getSelectedItem().toString());
                ps.setString(4, txtphone.getText());
                ps.setString(5, txtnic.getText());
                ps.setBytes(6, photoh);
                ps.executeUpdate();
                ps.close();
                JOptionPane.showMessageDialog(this, "کارمند ثبت شد!");
                txtID.setText("");
                txtfulname.setText("");
                picture.setIcon(null);
                txtphone.setText("");
                txtnic.setText("");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            JFileChooser jfs = new JFileChooser("D:\\picture\\");
            jfs.showOpenDialog(this);
            
            String path = jfs.getSelectedFile().getAbsolutePath();
            ImageIcon icon = new ImageIcon(path);
            Image img = icon.getImage().getScaledInstance(picture.getWidth(), picture.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(img);
            picture.setIcon(icon);
            picture.setText("");
            File image = new File(path);
            try {
                FileInputStream fjc = new FileInputStream(image);
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                for (int read; (read = fjc.read(buf)) != -1;) {
                    bos.write(buf, 0, read);
                    
                }
                photoh = bos.toByteArray();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered

    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel9KeyPressed

    }//GEN-LAST:event_jLabel9KeyPressed

    private void jLabel9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel9KeyTyped

    }//GEN-LAST:event_jLabel9KeyTyped

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        try {
            ps = conn.prepareStatement("SELECT *FROM Employee WHERE Employee_id=?");
            ps.setString(1, txtID.getText());
            rs = ps.executeQuery();
            if (rs.next()) {
                txtfulname.setText(rs.getString(2));
                txtnic.setText(rs.getString(5));
                txtphone.setText(rs.getString(4));
                jComboBox1.setSelectedItem(rs.getString(3));
                photoh = rs.getBytes(6);
                Image image = getToolkit().createImage(photoh);
                
                ImageIcon icon = new ImageIcon(image);
                Image img = icon.getImage().getScaledInstance(picture.getWidth(), picture.getHeight(), Image.SCALE_SMOOTH);
                icon = new ImageIcon(img);
                picture.setIcon(icon);
                picture.setText("");
                
            } else {
                JOptionPane.showMessageDialog(this, "به این آی دی" + txtID.getText() + "کارمند نیست!");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void txtphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtphoneKeyTyped

    }//GEN-LAST:event_txtphoneKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String id = txtID.getText();
            String full = txtfulname.getText();
            String nic = txtnic.getText();
            String p = txtphone.getText();
            
            if (id.equals("") || full.equals("") || nic.equals("") || p.equals("")) {
                new fill().setVisible(true);
            } else {
                ps = conn.prepareStatement("UPDATE Employee SET Fullname=?,Role=?,Phone=?,NIC=? WHERE Employee_id=?");
                
                ps.setString(1, txtfulname.getText());
                
                ps.setString(2, jComboBox1.getSelectedItem().toString());
                ps.setString(4, nic);
                ps.setString(3, txtphone.getText());
                ps.setString(5, txtID.getText());
                ps.executeUpdate();
                ps.close();
                JOptionPane.showMessageDialog(this, "موافقانه معلومات" + txtfulname.getText() + "-" + "ویرایش شد");
                txtID.setText("");
                txtfulname.setText("");
                picture.setIcon(null);
                txtphone.setText("");
                txtnic.setText("");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    int posX, posY;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
    }//GEN-LAST:event_jPanel1MouseDragged

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
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee().setVisible(true);
            }
        });
    }
    byte[] photoh = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel picture;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtfulname;
    private javax.swing.JTextField txtnic;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
