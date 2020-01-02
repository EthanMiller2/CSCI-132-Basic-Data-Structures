/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Politics;

/**
 *
 * @author ethanmiller
 */
public class Node {

    private Node next;
    private Node prev;
    private int data;

    public Node(int inData) {
        data = inData;
        this.next = null;
        this.prev = null;
    }
    
    public void setData(int x)
    {
        this.data = x;
        
    }
    
    public void setNext(Node x)
    {
        this.next = x;
        
    }
    
    public void setPrev(Node x)
    {
        this.prev = x;
    }

    public Node getNext() {
        return next;

    }
    public Node getPrev()
    {
        return prev;
    }
    
    public int getData()
    {
        return data;
    }

}
