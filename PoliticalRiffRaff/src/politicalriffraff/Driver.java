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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Driver {

    /**
     * @param args the command line arguments
     */
              
              
              
              
              
    public static void main(String[] args) throws IOException{
        int numNodes = 0;
        int k = 0;
        int m = 0;
        String filename;
        
        LinkedList l1 = new LinkedList();
        Scanner in = new Scanner(System.in);
        System.out.println("What is the name of the file that you would like to open?");
        filename = in.nextLine();
        try{
            FileReader fileName = new FileReader(filename);
            Scanner fileRead = new Scanner(fileName);
            numNodes = fileRead.nextInt();
            k = fileRead.nextInt();
            m = fileRead.nextInt();
            
            for(int i = 0; i <numNodes; i++)
            {
                l1.addN(i);
            }
        }
        
        catch(FileNotFoundException exception){
            System.out.println("file not found!");
        }
        
        l1.setStart(k, m, numNodes);

        
        
    }
    
    
    
}
