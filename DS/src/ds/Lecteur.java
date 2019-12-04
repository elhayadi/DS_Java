/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohamed Elhayadi
 */
public class Lecteur extends Thread{
    String file;
    String thread;
    MyBuffer buff;
    
    public Lecteur(String threadName,String fileName, MyBuffer buf){
   file= fileName;
   thread=threadName;
   buff=buf;
    };
    
    public String readWord(){
                String mot="";
                int n=0;
        FileInputStream fis;
        try {
            fis = new FileInputStream(new File(file));
            while((n=fis.read())>=0){
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lecteur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lecteur.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return(mot);
    }
    @Override
    public void run(){
        
    }
}  

