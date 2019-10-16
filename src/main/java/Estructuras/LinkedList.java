/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Alejandro
 */
public class LinkedList {
    private Node head, ptr, prev;
    
    public boolean insert(int item){
        boolean inserted = false;
        ptr = head;
        prev = null;
        while(ptr !=null && ptr.getData() < item){
            prev = ptr;
            ptr = ptr.getNext();
        }
       if(ptr == null || ptr.getData() != item){     
        inserted = true;
        Node newp = new Node(item);
        newp.setNext(ptr);
        if(prev == null)
            head = newp;
        else
            prev.setNext(newp);
       }return inserted;
    }
    
    public boolean delete(int item){
        boolean deleted = false;
        ptr = head;
        prev = null;
        while(ptr !=null && ptr.getData() < item){
            prev = ptr;
            ptr = ptr.getNext();
        }
        if(ptr==null){
            deleted = false;
        }
        if(ptr.getData() != item){
            deleted = false;
        }
        
        if(ptr.getData() == item){
           deleted = true;
           if(prev == null){
               head = ptr.getNext();
           }else if(ptr.getNext() == null){
               prev.setNext(null);
           }else{ 
              prev.setNext(ptr.getNext());
              ptr.getNext().setPrev(ptr.getPrev());
        }
        }return deleted;
    }
      
    public void printRecursive() { 
        System.out.print("Imprimir lista recursivamente: ");
        printR(head); System.out.println();
    }
    
    private void printR(Node p) { 
        if(p != null) {
            System.out.print(p.getData()+" ");
            printR(p.getNext()); } 
    }
    
    
}
