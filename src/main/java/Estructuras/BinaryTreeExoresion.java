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
public class BinaryTreeExoresion {
    private Node root;

    public BinaryTreeExoresion(Node root) {
        this.root = null;
    }
    
    private class Node{
        private Node rigth, left;
        private char data;

        public Node() {
            this(' ');
        }

        public Node(char data) {
            this.rigth = null;
            this.left = null;
            this.data = data;
        }
    }
    
    public void preFix() {
        System.out.print("Preﬁx:"); 
        preOrder(root); 
        System.out.println(); 
    }
    
    private void preOrder(Node p){
        if(!(p.left == null && p.rigth == null)){
            System.out.println(p.data);
            preOrder(p.left);
            preOrder(p.rigth);
        }else
            System.out.println(p.data);
    }
    
    public void infix(Node root){
        System.out.print("Infix:"); 
        inOrder(root); 
        System.out.println(); 
    }
    
    private void inOrder(Node p){
         if(!(p.left == null && p.rigth == null)){
             System.out.print('(');
             inOrder(p.left);            
             System.out.println(p.data);
             inOrder(p.rigth);
             System.out.print(')');

         }else
             System.out.println(p.data);
    }
    
    public void postFix(Node root){
        System.out.print("Postﬁx:"); 
        postOrder(root); 
        System.out.println(); 
    }
    
    private void postOrder(Node p){
         if(!(p.left == null && p.rigth == null)){
             System.out.println(p.data);
             System.out.println(p.rigth);
             System.out.println(p.data);
         }else
             System.out.println(p.data);
    }
    
    
}
