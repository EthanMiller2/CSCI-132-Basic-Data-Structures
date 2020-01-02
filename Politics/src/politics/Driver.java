/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Politics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ethanmiller
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the name of the file you would like to use");
        String fileName = scan.nextLine();

        try {
            Scanner file = new Scanner(new File(fileName));
            int n = file.nextInt();
            int k = file.nextInt();
            int m = file.nextInt();
            
            LinkedList l1 = new LinkedList(n,k,m);
            l1.ringAroundTheRosy();

        } catch (FileNotFoundException ex) {
            System.out.println("File Not found");
        }
    }

}
