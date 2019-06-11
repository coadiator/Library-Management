/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Codiator
 */
class issue_book {

    public issue_book(String xyz, String sid, String p) {
        
        int qr = Integer.parseInt(p);
            while(qr > 9999 )
                 qr=qr/10;
            String qr1= String.valueOf(qr);
        try
						{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://118.185.43.122/library","0537cs161006","archit");
						JOptionPane.showMessageDialog(null, "DBMS ENTER");
						
						PreparedStatement pst=con.prepareStatement("insert into "+xyz+"_lib  values(?,?,now(),NULL,?,?)");
						pst.setString(1,sid);
						pst.setString(2,qr1);
						pst.setString(3,p);
						pst.setInt(4,0);
						
						//pst.setString(13,img);
						JOptionPane.showMessageDialog(null, pst);
                                                int res= pst.executeUpdate();
                                                if(res > 0 ){
							JOptionPane.showMessageDialog(null, "Sucessfully submit!");
                                                        
                                                        //JOptionPane.showMessageDialog(null, "Welcome " + bb);
                                                        
                                                }
						else
							JOptionPane.showMessageDialog(null, "*********Error*************");     
						

						 
                                                }
						catch(HeadlessException | ClassNotFoundException | SQLException except) { }
    }
    
}
