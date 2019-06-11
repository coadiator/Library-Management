/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management;

/**
 *
 * @author Codiator
 */
class user1 {
    private final int edition; 
    private final String bno,name,writer,publisher;
    
    public user1(String bno,String name, String writer,int edition,String publisher)
    {
        this.bno=bno;
        this.name=name;
        this.writer=writer;
        this.edition=edition;
        this.publisher=publisher;
        
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
    
}
