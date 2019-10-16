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
public class ListArray {
    static private final int N=5;
    private int position, count, larray[];
    public ListArray() {
        count=0; 
        larray = new int[N];  
    } 
    
    private boolean empty() { 
        return count<=0;
    } 
    private boolean full() { 
        return count>=N;
    }
    
    public boolean delete(int item) { 
        boolean deleted=false;
        if(!empty())
            if(search(item)) { 
                for(int j=position; j<count-1; j++)
                    larray[j] = larray[j+1];
                count--; 
                deleted = true;
            } 
        else 
            System.out.println("List is Empty");
        return deleted;
    } 
    
    public boolean insert(int item) { 
        boolean inserted=false;
        if(!full()) 
            if(!search(item)) {
                for(int j=count; j>position; j--)
                    larray[j] = larray[j-1];
                larray[position] = item;
                count++;
                inserted = true; 
            } 
        else
            System.out.println("List is Full");
        return inserted;
    }
    
   private boolean search(int item) {
       boolean found=false, stop=false;
       position = 0;
       while(position < count && !stop)
           if(larray[position] >= item) {
               stop = true; 
               if(larray[position] == item)
                   found = true;
           }else
               position++;
               return found;
    }
   
   public void output() { 
       System.out.print("List: "); 
       int j = 0;
       while(j != count) {
           System.out.print(larray[j]+" ");
           j++; 
       } 
       System.out.println(); 
   }
 
}
