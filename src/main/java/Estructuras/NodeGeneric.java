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
public class NodeGeneric <T>{
    private NodeGeneric<T> next,prev;
    private T data;

    public NodeGeneric() {
        this(null);
    }

    public NodeGeneric(T data) {
        this.data = data;
        this.next = null;
    }

    public NodeGeneric getNext() {
        return next;
    }

    public void setNext(NodeGeneric<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodeGeneric<T> getPrev() {
        return prev;
    }

    public void setPrev(NodeGeneric<T> prev) {
        this.prev = prev;
    }
    
   

}
