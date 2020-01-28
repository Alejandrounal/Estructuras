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
public class AlvTree {
    static private class Node{
        private Node left, rigth;
        private int count, height;
        private String data;

        public Node(String data) {
            this.left = null;
            this.rigth = null;
            this.count = 0;
            this.data = data;
            this.height = 1;
        }

        public int getCount() {
            return count;
        }

        public String getData() {
            return data;
        }   
    }
    
    private Node root;

    public AlvTree(Node root) {
        this.root = null;
    }
    
    public boolean empty(){
        return root == null;
    }
    
    private int heightF(Node n){
        if(n == null)
            return 0;
        return n.height;
    }
    
    
    private Node insert(Node node, String data){
        if(node== null)
            return (new Node(data));
        if(data.compareTo(node.data) <1)
            node.left = insert(node.left, data);
        else if(data.compareTo(node.data) == 0)
            node.count++;
        else
            node.rigth = insert(node.rigth,data);
        node.height = Math.max(heightF(node.left), heightF(node.rigth))+1;
        int balance = getBalance(node);
        if(balance > 1 && data.compareTo(node.left.data) < 0)
            return rightRotate(node);
        if(balance < -1 && data.compareTo(node.rigth.data) > 0)
           return leftRotate(node);
        if(balance >1 && data.compareTo(node.left.data) > 0){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if(balance < -1 && data.compareTo(node.rigth.data) < 0){
            node.rigth = rightRotate(node.rigth);
            return leftRotate(node);
        }
        return node;
    }
    
    private Node rightRotate(Node n){
        Node izq = n.left;
        Node rChild = izq.rigth;
        izq.rigth = n;
        n.left = rChild;
        n.height= Math.max(heightF(n.left), heightF(n.rigth))+1;
        izq.height = Math.max(heightF(izq.left), heightF(izq.rigth))+1;
        return izq;
    }
    
    private Node leftRotate(Node n){
        Node rig = n.rigth;
        Node lChild = rig.left;
        rig.left =  n;
        n.rigth = lChild;
        n.height = Math.max(heightF(n.left), heightF(n.rigth))+1;
        rig.height = Math.max(heightF(rig.left), heightF(rig.rigth))+1;
        return rig;
    }
    
    private int getBalance(Node n){
        if(n == null){
            return 0;
        }
        return heightF(n.left) - heightF(n.rigth);
    }
    
    private String min(Node node){
        Node act = node;
        while(act != null){
            act =  act.left;
        }
        return act.data;
    }
    
    private String max(Node node){
        Node act = node;
        while(act != null){
            act =  act.rigth;
        }
        return act.data;
    }
    
    
    
}
