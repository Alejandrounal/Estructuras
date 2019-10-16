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
public class LinkedStack {
    private Node top;

    public LinkedStack() {
        this.top = null;
    }
    
    public boolean push(int item){
        boolean pushed =false;
        Node newp = new Node(item);
        newp.setNext(top);
        top = newp;
        return true;
    }
    
    public int pop(){
        int result = -1;
        if(top!= null){
            result = top.getData();
            top = top.getNext();
        }return result;
    }
    
    public boolean empty(){
        return top == null;
    }
    
    public void printLinkedStack(){
        while(!empty())
            System.out.println(pop());
    }
}
