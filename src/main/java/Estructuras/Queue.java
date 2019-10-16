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
public class Queue <T>{
    private int front;
    private int tam;
    private T[] arr;
    private final int n = 4;
    private int cont;
    private int rear;
    
     public Queue() {
       front = 0;
       arr = (T[]) new Object[n]; 
       rear = 0;
    }
     
     public boolean empty(){
       return cont <= 0; 
    }
    
    public boolean full(){
       return cont >= n;
    } 
    
    public void enqueue(T item){
        if(full())
           throw new RuntimeException("Ya esta lleno");
        arr[rear] = item;
        cont++;
        rear++;
        rear%=n;
    }
    
     public T  dequeue(){
        int x = rear; 
        if(empty())
             throw new RuntimeException("Esta vacio");
        rear++;
        rear%=n;
        cont--;
        return arr[x];
    }
    
     public void printQueue(){
        while(!empty()) 
            System.out.print(dequeue() + "");
        System.out.println();  
     }
     
     public void printPartidos(){
         while(!empty())
             System.out.println();
     }
}
