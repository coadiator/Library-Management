/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Coadiator
 */
public class School_Details extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form School_Details
    */
    String Str1= null;
    byte[] p_img = null;
    ImageIcon img;
    String p;
    byte[] person_image;
    public School_Details() {
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

        jFrame1 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        lb1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        lb2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        lb3 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        lb5 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        lb4 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        lb10 = new javax.swing.JLabel();
        lb11 = new javax.swing.JLabel();
        lb_image = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        lbp2 = new javax.swing.JLabel();
        p2 = new javax.swing.JPasswordField();
        lbp1 = new javax.swing.JLabel();
        p1 = new javax.swing.JPasswordField();
        lbl = new javax.swing.JLabel();
        tl = new javax.swing.JTextField();
        bc = new javax.swing.JButton();
        bsub = new javax.swing.JButton();
        lbcheck = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb1.setText("Name*");

        lb2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb2.setText("Address*");

        t2.setColumns(1);
        t2.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        t2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        t2.setToolTipText("");
        t2.setAutoscrolls(false);
        t2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        lb3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb3.setText("City*");

        t3.setColumns(1);
        t3.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        t3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        t3.setToolTipText("");
        t3.setAutoscrolls(false);
        t3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });

        lb5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb5.setText("Pincode*");

        lb4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb4.setText("State*");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Telephone No.");

        lb7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb7.setText("Mobile No.*");

        lb8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb8.setText("Email id*");

        lb9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb9.setText("Website");

        lb10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb10.setText("Government*");

        lb11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb11.setText("School Logo");

        b1.setText("Choose Image");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        lbp2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbp2.setText("Confirm Password*");

        lbp1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbp1.setText("Password*");

        lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl.setText("Login id*");

        bc.setText("check");
        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });

        bsub.setText("Submit");
        bsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubActionPerformed(evt);
            }
        });

        lbcheck.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        lbcheck.setText("ID Status");

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setText("School/College Details...");

        buttonGroup1.add(rb1);
        rb1.setText("YES");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb2);
        rb2.setText("NO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bsub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lb7)
                        .addComponent(lb8)
                        .addComponent(lb9)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbp2)
                                .addComponent(lbp1)
                                .addComponent(lb1)
                                .addComponent(lb2)
                                .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb4)
                                .addComponent(lb5)
                                .addComponent(jLabel1)
                                .addComponent(lb10)
                                .addComponent(lb11)
                                .addComponent(lbl))
                            .addGap(116, 116, 116)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tl, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bc))
                                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(t7, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(t6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(t5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(t3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lbcheck, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(p2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb1)
                                        .addGap(18, 18, 18)
                                        .addComponent(rb2)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(b1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lb_image, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(79, 79, 79))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl)
                    .addComponent(bc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbcheck)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbp2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb1)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb2)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb3)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb4)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb5)
                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb7)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb8)
                    .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb9)
                    .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb10)
                            .addComponent(rb1)
                            .addComponent(rb2))
                        .addGap(49, 49, 49)
                        .addComponent(lb11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(b1))
                            .addComponent(lb_image, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bsub)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        img = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lb_image.getWidth(),lb_image.getHeight(),Image.SCALE_SMOOTH));
        lb_image.setIcon(img);
        try{
            File img1 = new File(filename);
            FileInputStream fis = new FileInputStream(img1);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum=fis.read(buf))!=-1;){
                bos.write(buf, 0, readNum);
            }
           person_image = bos.toByteArray();
        }
        catch(IOException e){
            //JOptionPane.showMessageDialog(null,e);
        }
    
        
            
    }//GEN-LAST:event_b1ActionPerformed

    private void bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcActionPerformed
        // TODO add your handling code here:
        if(tl.getText().trim().isEmpty())
				JOptionPane.showMessageDialog(null, "Empty Entry!");     
         		else
			{ 
                        p = tl.getText();
						try
						{
                                                    Class.forName("com.mysql.jdbc.Driver");
                                                    Connection con=DriverManager.getConnection("jdbc:mysql://118.185.43.122/library","0537cs161006","archit");
                                                    //JOptionPane.showMessageDialog(null, "jdbc:mysql://localhost:3306/archit1");
						
                                                    PreparedStatement pit=con.prepareStatement("select * from school where l_id=?");
                                                    pit.setString(1,p);
                                                    
                                                    //JOptionPane.showMessageDialog(null, pit);
                                                    ResultSet rs= pit.executeQuery();

                                                    if(rs.next())
                                                    {
                                                        lbcheck.setForeground(new java.awt.Color(255, 51, 51));
                                                        lbcheck.setText("Username not available");
                                                    } 
                                                    
                                                    else
                                                    {
                                                        lbcheck.setForeground(new java.awt.Color(51, 255, 0));
                                                        lbcheck.setText("Username available");
                                                    } 
                                                    
						}

						catch(HeadlessException | ClassNotFoundException | SQLException except) { }

					
			}		
        
    }//GEN-LAST:event_bcActionPerformed

    @SuppressWarnings("deprecation")
    private void bsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsubActionPerformed
        // TODO add your handling code here:
        if((t1.getText().trim().isEmpty()) || (t2.getText().isEmpty()) || (p1.getText().isEmpty()) || (p2.getText().isEmpty()) || (t5.getText().trim().isEmpty()) || (t6.getText().trim().isEmpty()) || (t7.getText().trim().isEmpty()) || (t4.getText().trim().isEmpty()) || (t8.getText().trim().isEmpty()) || (t9.getText().trim().isEmpty()))
				JOptionPane.showMessageDialog(null, "Empty Entry!");     
		
        else
        {
            String hh = new String(p2.getPassword());
            String ii = new String(p1.getPassword());

            if(ii.equals(hh)== true)
            {
                String aa = t1.getText();
                String bb = t2.getText();
                String cc = t3.getText();
                String dd = t4.getText();
                String ee = t5.getText();
                String ff= t6.getText();
                String gg = t7.getText();
                String jj = t8.getText();
                String kk = t9.getText();
                String ll = null;
                if(rb1.isSelected()){    
                    ll="yes";    
                }
                else
                if(rb2.isSelected()){    
                    ll="no";
                }    
                
                    //JOptionPane.showMessageDialog(null, "Sucessfully Read!");

						try
						{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://118.185.43.122/library","0537cs161006","archit");
						//JOptionPane.showMessageDialog(null, "DBMS ENTER");
						
						PreparedStatement pst=con.prepareStatement("insert into school values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
						pst.setString(1,p);
						pst.setString(2,hh);
						pst.setString(3,aa);
						pst.setString(4,bb);
						pst.setString(5,cc);
						pst.setString(6,ee);
						pst.setString(7,ff);
						pst.setString(8,gg);
                                                pst.setString(9,dd);
						pst.setString(10,jj);
						pst.setString(11,kk);
                                                pst.setString(12,ll);
						pst.setBytes(13,person_image);
						//pst.setString(13,img);
						//JOptionPane.showMessageDialog(null, pst);
                                                int res= pst.executeUpdate();
                                                
                                                Statement pit1=con.createStatement();
                                                String qry="create table " +  p  +"_book(b_no varchar(6) primary key,b_name varchar(100),b_writter varchar(50),b_edition int(3),b_publi varchar(100),b_qty int(3),b_ref varchar(3));";
                                                int res1 = pit1.executeUpdate(qry);
                                                
                                                
                                                Statement pit2=con.createStatement();
                                                String qry1="create table " +  p  +"_stu(L_code varchar(8) primary key,name varchar(50),f_name varchar(50),mob varchar(10),p_mob varchar(10),branch varchar(35),Sec varchar(1),val varchar(4),p_add varchar(100),l_add varchar(100),sem int(1),enroll varchar(12));";
                                                int res2 = pit2.executeUpdate(qry1);
                                                
                                                
                                                Statement pit3=con.createStatement();
                                                String qry2="create table "+p+"_lib(l_code varchar(8),b_no varchar(6),issue_date date,ret_date date,bb_no varchar(8),fine int(5),foreign key(l_code) references "+p+"_stu(L_code),foreign key(b_no) references "+p+"_book(b_no));";
                                                int res3 = pit3.executeUpdate(qry2);
                                                //PreparedStatement pit1=con.prepareStatement("create table ?(b_no varchar(6) primary key,b_name varchar(100),b_writter varchar(50),b_edition int(3),b_publi varchar(100),b_qty int(3),b_ref varchar(3))");
                                                //pit1.setString(1,p);
                                                //System.out.println(res + "  " + res1);
                                               
						//ResultSet res1= pit1.executeQuery();
						if(res > 0 && res1 == 0 && res2 == 0 && res3 == 0){
							JOptionPane.showMessageDialog(null, "Sucessfully submit!");
                                                        
                                                        //JOptionPane.showMessageDialog(null, "Welcome " + bb);
                                                        new Menu1(aa).setVisible(true);
                                                        setVisible(false);
                                                }
						else
							JOptionPane.showMessageDialog(null, "*********Error*************");     
						

						 
                                                }
						catch(HeadlessException | ClassNotFoundException | SQLException except) { }
            }
	}
    }//GEN-LAST:event_bsubActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb1ActionPerformed

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
            java.util.logging.Logger.getLogger(School_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(School_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(School_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(School_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new School_Details().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton bc;
    private javax.swing.JButton bsub;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JLabel lb_image;
    private javax.swing.JLabel lbcheck;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbp1;
    private javax.swing.JLabel lbp2;
    private javax.swing.JPasswordField p1;
    private javax.swing.JPasswordField p2;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    private javax.swing.JTextField tl;
    // End of variables declaration//GEN-END:variables
}