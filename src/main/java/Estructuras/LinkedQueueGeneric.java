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
public class LinkedQueueGeneric <T>{
    private NodeGeneric front, rear;

    public LinkedQueueGeneric() {
        this.front = null;
        this.rear = null;
    }
    
    public boolean enqueue(T item){
        NodeGeneric newp = new NodeGeneric(item);
        if(rear!=null){
            rear.setNext(newp);
        }else{    
            front = newp;
        }
        rear = newp;
        return true;
    }
    
    public T dequeue(){
       T result = null;
       if(!empty()){
             result = (T)front.getData();
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
