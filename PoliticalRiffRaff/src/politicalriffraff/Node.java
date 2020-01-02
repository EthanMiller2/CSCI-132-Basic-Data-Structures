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
public class Node {
    private RiffRaff object;
    private Node next;
    private Node prev;
    
    //Creates a node
    public Node(RiffRaff a)
    {
        object = a;
        next = null;
        prev = null;
    }
    
    //Method to set next node
    public void setNext(Node n)
    {
        next = n;
    }
    
    //Method to set prev node
    public void setPrev(Node p)
    {
            prev = p;
    }
    
    //Method to get next node
    public Node getNext()
    {
        return next;
    }
    
    //Method to get prev node
    public Node getPrev()
    {
        return prev;
    }
    
    //Method to get OBject number
    public int getNum()
    {
        return object.getNum();
    }
}
