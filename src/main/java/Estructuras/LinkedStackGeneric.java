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
public class LinkedStackGeneric <T>{
    private NodeGeneric top;

    public LinkedStackGeneric() {
        this.top = null;
    }
    
    public boolean push(T item){
        boolean pushed =false;
        NodeGeneric newp = new NodeGeneric(item);
        newp.setNext(top);
        top = newp;
        return true;
    }
    
    public T pop(){
        T result = null;
        if(top!= null){
            result = (T)top.getData();
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
