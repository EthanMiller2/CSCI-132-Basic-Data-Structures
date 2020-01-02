/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package politicalriffraff;

/**
 *
 * @author ethanmiller
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class Driver {

    /**
     * @param args the command line arguments
     */
              
              
              
              
              
    public static void main(String[] args) {
        // TODO code application logic here


              
              LinkedList list = new LinkedList();//Creates a linked list instance
              Scanner fileScan = null;//Initialize scanner for file reader;
              
        //Try block for file reader
        try{
            Scanner filescan = new Scanner(new FileReader("text.txt"));//Read in file
            int n = fileScan.nextInt();//Initialize n
            int k = fileScan.nextInt();//Initialize k
            int m = fileScan.nextInt();//Initialize m
            list.addN(n);//Fills list
            list.setStart(k, m, n);//Sets Start and goes around circle deleting candidates
            
        }        
        catch(Exception e){//Catches exception if file is not found
            System.out.println("Unable to find file");
        }
        
        
    }
    
    
    
}
