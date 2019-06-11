/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management;

import java.sql.Date;

/**
 *
 * @author Codiator
 */
class user {
    private final int edition,fine; 
    private final String bno,name,writer,publisher;
    Date issue_date,ret_date;
    
    public user(String bno,String name, String writer,int edition,String publisher,Date issue_date,Date ret_date,int fine)
    {
        this.bno=bno;
        this.name=name;
        this.writer=writer;
        this.edition=edition;
        this.publisher=publisher;
        this.issue_date=issue_date;
        this.ret_date=ret_date;
        this.fine=fine;
        
    }
    

    
    public String getsno(){
        return bno;
    }
    
    public String getsname(){
        return name;
    }
    
    public String getswriter(){
        return writer;
    }
    
    public int getsedition(){
        return edition;
    }
    
    public String getspubli(){
        return publisher;
    }
    
    public Date getsisue(){
        return issue_date;
    }
     
     public Date getsreturn(){
        return ret_date;
    }
     
    public int getfine(){
        return fine;
    }
}
