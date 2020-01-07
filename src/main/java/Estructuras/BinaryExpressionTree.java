/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class BinaryExpressionTree {
    private Node root;

    public BinaryExpressionTree(Node root) {
        root = null;
    }
    
    private class Node{
        private Node left;
        private Node rigth;
        private char data;

        public Node() {
            this(' ');
        }

        public Node(char data) {
            this.left = null;
            this.rigth = null;
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRigth() {
            return rigth;
        }

        public void setRigth(Node rigth) {
            this.rigth = rigth;
        }

        public char getData() {
            return data;
        }

        public void setData(char data) {
            this.data = data;
        }
        
        
    }////////////////////////////////Finaliza clase Nodo....////////////////////
    
    //////////////////////////////////////////////Metodo que invoca el metodo preorder.
    public void prefix(){
        System.out.print("prefix: ");
        preOrder(root);
        System.out.println("");
    }
    /*  ///////////////////////////////////////preorder de la forma larga
        private void preOrder(Node p){
            if(p.left != null && p.rigth != null){
                System.out.println(p.data);
                preOrder(p.left);
                preOrder(p.rigth);
            }else{
                System.out.println(p.data);
            }
    }*/
    
    //////////Preorder forma corta
     private void preOrder(Node p){
        System.out.println(p.data);
        if(!(p.left == null || p.rigth == null)){
            preOrder(p.left);
            preOrder(p.rigth);
        }
    }
    ////////////////////////////////////////////// metodo que llama al inorder metodo
     public void inFix(Node root) { 
         System.out.print("Inﬁx: "); 
         inOrder(root); 
         System.out.println(); 
     }

    public void inOrder(Node p){
        if(!(p.left == null || p.rigth == null)){
            System.out.println('(');
            inOrder(p.left);
            System.out.print(p.data);
            inOrder(p.rigth);
            System.out.println(')');
        }else
            System.out.print(p.data);
    }
    
    //////Crear el arbol
    public void createTree(){
        System.out.println("");
        System.out.println("Ingrese una expresion en prefix");
        System.out.println("");
        root = inputData();
    }
    
    /////////////////////// Expresión que lena el arbol
    private Node inputData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un operador u operando");
        char data = scan.next().charAt(0);
        Node p =  new Node(data);
        if(data == '+' || data == '-' || data == '*' || data == '/'){
            p.left = inputData();
            p.rigth = inputData();
        }
        return p;
    }  
}
    