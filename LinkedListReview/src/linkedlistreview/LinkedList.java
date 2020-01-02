/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistreview;

/**
 *
 * @author ethanmiller
 */
public class LinkedList {

    private Node first;
    private Node listBfirst;
            
    public LinkedList()
    {
        
    }

    //Adds Nodes to the list
    public void add(String name) {

        Node temp = new Node(name);

        if (first == null) {
            first = temp;

        } else {
            first.setPrev(temp);
            temp.setNext(first);
            first = temp;
        }
    }
    
    //fills Array with strings
    public void fill()
    {
        //Hardcoded String array
        String [] listnames = new String [] {"Joe", "Suzy", "Ethan", "Brendan", "Jimmy", "Sam", "Donald", "Henry", "Amy", "Leah"};
        for(int i = 0; i < listnames.length; i++)
        {
           add(listnames[i]); 
            
        }
    }
    
    //Prints the Nodes
    public void print(Node inNode)
    {
        
        
        while(inNode != null)
        {
            System.out.println("Name: " + inNode.getName());
            inNode = inNode.getNext();
        }
        System.out.println();
        
    }
    
    //Reverses the list
    public void reverseList()
    {
        Node current = first.getNext();
        Node revNext = new Node(first.getName());
        
        while (current != null)
        {
            Node revPrev = new Node(current.getName());
            revNext.setPrev(revPrev);
            revPrev.setNext(revNext);
            revNext = revPrev;
            current = current.getNext();
        }
    
        listBfirst = revNext;
    }
    
    
    //Main Method
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList ll = new LinkedList();
        ll.fill();
        ll.print(ll.first);
        ll.reverseList();
        ll.print(ll.listBfirst);
        
        
    }

    
}

