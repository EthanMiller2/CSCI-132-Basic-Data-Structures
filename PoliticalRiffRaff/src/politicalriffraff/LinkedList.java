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
public class LinkedList {

    private Node first;
    private Node last;

    public LinkedList() {
        first = null;
        last = null;
    }
    
    //Method to add all the candidates
    public void addN(int num) {
        int iter = 1;
        Node ref;

        while (iter != num + 1) {
            ref = new Node(new RiffRaff(iter));
            iter++;

            if (first == null) {
                first = ref;
                last = ref;
            } else {
                last.setNext(ref);
                ref.setPrev(last);

                last = last.getNext();
                last.setNext(first);
                last.setPrev(last);
            }
        }
    }
    
    //Method to set start of cirlce
    public void setStart(int k, int m, int n) {
        Node kStart = first;
        Node mStart = last;

        moveCircle(k, m, n, kStart, mStart);
    }
    
    //Method to go around circle
    public void moveCircle(int k, int m, int n, Node kStart, Node mStart) {
        Node kIter = kStart;
        Node mIter = mStart;

        int mNum = m;
        int kNum = k;

        while (mNum != 1) {
            mIter = mIter.getNext();
            mNum--;
            deleteCandidate(kIter, mIter);
        }
        while (kNum != n) {
            kIter = kIter.getNext();
            kNum++;
            deleteCandidate(kIter, mIter);

        }
        
        
        

    }

    //Method to delete Nodes
    public void delete(Node toRemove) {
        Node iter, lagPtr, next;
        iter = first;
        lagPtr = first;
        next = first;

        while (iter != null) {
            if (toRemove.getNum() == iter.getNum()) {
                if (iter == first) {
                    first = first.getNext();
                } else if (iter == last) {
                    last = last.getPrev();
                } else {
                    lagPtr.setNext(iter.getNext());
                    iter.setNext(null);
                    iter.setPrev(null);
                    next.setPrev(lagPtr);
                }
            } else {
                lagPtr = iter;
                iter = iter.getNext();
                next = iter.getNext();

            }

        }

    }
    
    //Method to remove Candidates
    public void deleteCandidate(Node kPos, Node mPos)
    {
        int worthyCandidate;
        Node kDelete = kPos;
        Node mDelete = mPos;
        
        if(kPos == mPos)//If candidates match
        {
            worthyCandidate = kPos.getNum();
            kDelete = kPos;
            
            kPos = kPos.getNext();
            mPos = mPos.getPrev();
            
            
            
            
            delete(kDelete);
            System.out.print(worthyCandidate);
      
        }
        else if(kPos != mPos)//If candidates dont match
        {
            kDelete = kPos;
            kPos = kPos.getNext();
            delete(kDelete);
            
            mDelete = mPos;
            mPos = mPos.getPrev();
            delete(mDelete);
        }
        
        
        
        
    }

}
