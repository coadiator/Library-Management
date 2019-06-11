/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Codiator
 */
class ret_book {

    public ret_book(String aa, String bb, String qq) {
        JOptionPane.showMessageDialog(null, aa+" "+bb+" "+qq);
        try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://118.185.43.122/library","0537cs161006","archit");
                //JOptionPane.showMessageDialog(null, "jdbc:mysql://localhost:3306/archit1");

                Statement pit=con.createStatement();
                String qry="update " +  aa + "_lib set ret_date = now() where l_code= '" + bb +"' and bb_no = '"+ qq+"';";
                System.out.println(qry);
                //JOptionPane.showMessageDialog(null, pst);
               int res= pit.executeUpdate(qry);
               
                if(res > 0 )
                {
                    JOptionPane.showMessageDialog(null, "Sucessfully Return!");
                            //JOptionPane.showMessageDialog(null, "Welcome " + bb);
                    Statement pit1=con.createStatement();
                    String qry1="select  datediff(ret_date,issue_date) from " +  aa + "_lib where l_code= '" + bb +"' and bb_no = '"+ qq+"';";
                    System.out.println(qry1);
                    
                    ResultSet rs= pit1.executeQuery(qry1);
                    if(rs.next())
                    {
                        //OptionPane.showMessageDialog(null, rs.getInt(1));
                        int aq =rs.getInt(1);
                        int fine = 0;
                        if(rs.getInt(1) > 15)
                        {
                            fine = (aq - 15);
                            Statement pit2=con.createStatement();
                            String qry2="update " +  aa + "_lib set fine = "+fine+" where l_code= '" + bb +"' and bb_no = '"+ qq+"';";
                            System.out.println(qry2);
                            int rs2= pit1.executeUpdate(qry2);
                            if(rs2 > 0)
                            {
                                JOptionPane.showMessageDialog(null, "Please pay fine ₹ " + fine );
                            }
                        }
                    
                    }
                }
                else
                    JOptionPane.showMessageDialog(null, "*********Error*************");     
						

						 
            }
        catch(HeadlessException | ClassNotFoundException | SQLException except) { }
    }

    private Object book(String aa, String qq) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
    
