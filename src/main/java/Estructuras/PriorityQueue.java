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
public class PriorityQueue {
    private final int n = 20;
    private int array[];
    private int size;

    public PriorityQueue() {
        array = new int[n];
        this.size = 0;
    }
    
    public void inserItem(int item){
        array[size] = item;
        moveUp();
        size++;
    }
    
    private void moveUp(){
        int child = size;
        int parent = (child-1)/2;
        int temp = array[child];
        while(child > 0 && temp < array[parent]){
            array[child] = array[parent];
            child = parent;
            parent = (child-1)/2;
        }
        array[child] = temp;
    }
    
    public int removeMin(){
        int min = array[0];
        array[0] = array[--size];
        moveDown();
        return min;
    }
    
    private void moveDown(){
        boolean flag = false;
        int smallest = -1;
        int parent = 0;
        int child = 2*parent+1;
        int temp = array[parent];
        while(child < size && !flag){
            smallest = array[child];
            if(child+1 < size && array[child+1] < array[child])
                smallest = array[++child];
            if(smallest < temp){
                array[parent] = smallest;
                parent = child;
            }
            else
                flag = true;
            child = 2*parent+1;
        }
        array[parent] = temp;
    }
    
}
    

