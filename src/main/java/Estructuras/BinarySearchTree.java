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
public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }
    
    private class Node{
        private Node left;
        private Node rigth;
        private int data;

        public Node() {
            this(0);
        }

        public Node(int data) {
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
   
    }
    
    //////////////////////////////////Metodo que llama traverse
    public void traverseBST(){
        System.out.println("El arbol es o esta");
        if(root != null)
            traverse(root);
        else
            System.out.print("El arrbol esta desocupado");
        System.out.println();
    }
    
    //////////////Este es un metodo que recorre InOrder el arbol,,,,, Con este se puede hacer imprimir el arbol binario
    private void traverse(Node p){
        if(p.left != null){
            traverse(p.left);
        }
        System.out.print(" "+p.data);
        if(p.rigth != null){
            traverse(p.rigth);
        }
    }
    
    /////////////////////////Metodo para llamar la inserción en el Search   binary tree
    
    public void insertBST(int num){
        root = insert(num, root);
    }
    
    ////////////Metodo para insertar 
    private Node insert(int num, Node p){
        if(p == null)
            p = new Node(num);
        else
            if(num < p.data)
                p.left = insert(num,p.left);
            else
                if(num > p.data)
                    p.rigth = insert(num,p.rigth);
                else
                    System.out.println("El numero ya esta en el arbol y no puede ser insertado");
        return p;
    }
    
    private Node findMin(Node p){
        if(p != null){
            while(p.left != null){
            p = p.left;
            }    
        }return p;
    }
    
    private Node findMax(Node p){
        if(p != null){
            while(p.rigth != null){
                p = p.rigth;
            }
        }return p;
    }
    
    public void removeBST(int num){
        root = remove(num,root);
    }
    
    private Node remove(int num, Node p){
        if(p != null){
            if(num < p.data)
                p.left = remove(num,p.left);
            else
                if(num > p.data)
                    p.rigth = remove(num,p.rigth);
                else
                    if(p.left == null & p.rigth == null)
                        p= null;
                    else
                        if(p.left == null)
                            p = p.rigth;
                        else
                            if(p.rigth == null)
                                p = p.left;
                            else{
                                Node t  = findMin(p.rigth);
                                p.data = t.data;
                                p.rigth = remove(p.data, p.rigth);
                            }                      
        }else
            System.out.println("El arbol esta vacio y no se pudo remover");
        return p;
    }
}
