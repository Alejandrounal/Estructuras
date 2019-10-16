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
public class LinkedQueue {
    private Node front, rear;

    public LinkedQueue() {
        this.front = null;
        this.rear = null;
    }
    
    public boolean enqueue(int item){
        Node newp = new Node(item);
        if(rear!=null){
            rear.setNext(newp);
        }else{    
            front = newp;
        }
        rear = newp;
        return true;
    }
    
    public int dequeue(){
        int result = 0;
       if(!empty()){
             result = front.getData();
             if(front.getNext() == null)
                 front = null;
             else
                 front= front.getNext();
       }return result;
    }
    
    public boolean empty(){
        return front==null;
    }
    
    public void pritnLinkedQueue(){
        while(!empty())
            System.out.println(dequeue());
    }
}
