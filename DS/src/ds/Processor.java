/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mohamed Elhayadi
 */
public class Processor extends Thread {
    MyBuffer buff;
    String Pname;
    HashMap<String,Integer> wordsCounts = new HashMap<>();
    public Processor(String PName,MyBuffer buf){
        buff=buf;
        Pname=PName;
    };
    public void processe(){
        boolean is_exists =false;
        int nbr;
        try{
            
                String word = buff.data.removeFirst();
            List<String> keys = (List<String>) wordsCounts.keySet();
            if(!keys.isEmpty()){
                         Iterator it = keys.iterator();
            while(it.hasNext()){
                if(it.next()==word){
                    is_exists=true;
                    nbr=wordsCounts.get(word)+1;
                    wordsCounts.put(word,nbr);
                    break;
                }
            }
            }
            if(!is_exists){
                wordsCounts.put(word,1);
            }
            
         
                               
        }catch(Exception ex){}
    }
    @Override
    public void run(){
        try{
            while(!buff.data.isEmpty()){
            Iterator it = buff.data.iterator();
            while(it.hasNext()){
                processe();
                it.next();
            }
            }
         }catch(Exception ex){
            
        }
    }
    public HashMap<String,Integer> GetWordsCounts(){
        return(wordsCounts);
    }
}
