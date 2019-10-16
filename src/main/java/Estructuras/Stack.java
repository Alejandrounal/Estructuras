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
public class Stack <T>{
    private int top;
    private int tamaño;
    private  Object[] arreglo;
    
    public Stack() {
     tamaño = 4;
     arreglo = new Object[tamaño];
     top = 0;
    }
    
    public void push(T num){
        if(full()){
            throw new RuntimeException("La pila ya esta llena");
        }else{
        arreglo[top] = num;
        top++;
       System.out.println(" Agregado:   " + num);
            }
        }
      
      public T pop(){
        if(empty()){
           throw new RuntimeException("Stack esta vacio"); 
        }else{
        this.top--;
        return (T) arreglo[top];
    }}
      
    public boolean full(){
        return this.top >= this.tamaño;
    }
    
    public boolean empty(){
       return top<=0; 
    }
    
    public void printStack(){
        while(!empty()) 
            System.out.print(pop() + "");
        System.out.println(); 
    }
  
}
