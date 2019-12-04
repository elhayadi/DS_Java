/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

import java.util.LinkedList;

/**
 *
 * @author Mohamed Elhayadi
 */
public class MyBuffer {
    LinkedList<String> data = new LinkedList<>();
    int taille;
    public MyBuffer(int size){ taille=size;};
    public void addWord(String mot){
        if(data.size()>taille){
            data.add(mot);
        }
    }
    
}
