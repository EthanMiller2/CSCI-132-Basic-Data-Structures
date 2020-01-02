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
public class Node {
    
    private Node next;
    private Node prev;
    private String name;
    
    public Node(String inName)
    {
            name = inName;
    }


public void setNext(Node n)
    {
        next = n;
    }
    
    public void setPrev(Node p)
    {
            prev = p;
    }
    
    public Node getNext()
    {
        return next;
    }
    
    public Node getPrev()
    {
        return prev;
    }
    
    public String getName()
    {
        return name;
    }
}
