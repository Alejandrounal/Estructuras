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
public class Main {
    public static void main(String[] args) {
    

// agregar cosas a la pila    ******************************    

    int number; 
    Stack stack; 
    stack = new Stack();
    Scanner scanner = new Scanner(System.in);
    System.out.println();
    System.out.print("Ingrese un numero menos de 0 para salir"); 
    number = scanner.nextInt(); 
    while(number >= 0 && !stack.full()) {
    stack.push(number); 
    System.out.print("Enter an integer or a -1 to stop: ");
    number = scanner.nextInt();
    } 
    
        System.out.println("El resultado reverso es");
        stack.printStack();
        System.out.println("\n\n\n");
       //***fin de agregar cosas a la pila *******************
    
    //******agregar cosas a la cola********************************
    
    int number2; 
    Queue cola; 
    cola = new Queue();
    Scanner scanner2 = new Scanner(System.in);
    System.out.println();
    System.out.print("Ingrese un numero menos de 0 para salir de la cola   "); 
    number = scanner.nextInt(); 
    while(number >= 0 && !cola.full()) {
    cola.enqueue(number); 
    System.out.print("Enter an integer or a -1 to stop: ");
    number = scanner.nextInt();
    } 
    
   System.out.println("El resultado de la cola es:    ");
   cola.printQueue();
    //************************Termina llenar la cola*************************
    
    
   /*///////////***************************Impriir de manera recursiva una lista nlazada  ********
   /*
    Node ref = null;
    public static void printRecursive(NodeGeneric < String > ref) {
        if(ref ! = null) { 
        System.out.println(ref.getData()); 
        printRecursive(ref.getNext()); } 
    }*/ 
    
    
   /////////*********************Agregar e imprimir informacion de la lista enlazada*****************
    
    Scanner scanner3 = new Scanner(System.in);  
    String respuesta;
    int numero;
    LinkedList list = new LinkedList();
    System.out.println(); 
    System.out.print("Do you wish to i = insert, d = delete, ");
    System.out.print("p = print, or s = stop: ");
    respuesta = scanner.next();
    while(!respuesta.equals("s")) {
        if(respuesta.equals("i")) {
            System.out.print("Enter a number to insert into the list: ");
            numero = scanner.nextInt();
            System.out.print("The number " + numero);
            if (list.insert(numero))
                System.out.println(" was inserted");
            else
                System.out.println(" was not inserted");
            }else if(respuesta.equals("d")) {
            System.out.print("Enter a number to delete from the list: ");
            numero = scanner.nextInt();
            System.out.print("The number " + numero); 
            if(list.delete(numero))
                System.out.println(" was removed");
            else System.out.println(" was not removed");
            }else if(respuesta.equals("p"))
                list.printRecursive();
            else {
                System.out.print("The command entered is not i, d, p, ");
                System.out.println("or s, please try again.");
            }
            System.out.println();
            System.out.print("Do you wish to i = insert, d = delete, ");
            System.out.print("p = print, or s = stop: ");
            respuesta = scanner.next();
            }
            System.out.println();
            System.out.println("End of Program"); 
            System.out.println();
            
    /////////////////// Termina agregar información a la lista enlazada *****************************************
            
    ///////////********************Agregar cosas al Stack enlazado*************
    
    LinkedStack stackl = new LinkedStack();
    stackl.push(5);
    stackl.push(6);
    stackl.push(7);
    stackl.push(8);
    stackl.printLinkedStack();
    
        System.out.println("\n\n\n\n\n");
    
    /////////**************************Fin agregar cosas al stack enlazado****************************
    
    
    ///////////************************Agregar cosas a ala cola enlazada/****************************
    
    LinkedQueue colaE = new LinkedQueue();
    colaE.enqueue(6);
    colaE.enqueue(2);
    colaE.enqueue(9);
    colaE.enqueue(10);
    colaE.enqueue(15);
    colaE.pritnLinkedQueue();
    
    ////////////////******************Fin de agregar cosas a la cola enlazada*********************///////////////
    
    
    //////////////////////////Inicio prueba binary search tree //////////////////////////////////////////
    Scanner scanner4; 
    scanner4 = new Scanner(System.in);
    int number4;
    BinarySearchTree tree;
    tree = new BinarySearchTree();
    System.out.println(); 
    System.out.print("Enter a positive integer to insert ");
    System.out.print("or a negative integer to stop: "); 
    number4 = scanner4.nextInt(); 
    while(number4 >= 0) {
        tree.insertBST(number4); 
        tree.traverseBST();
        System.out.println(); 
    System.out.print("Enter a positive integer to insert ");
    System.out.print("or a negative integer to stop: "); 
    number4 = scanner4.nextInt(); 
    }
    System.out.println();
    System.out.print("Enter a positive integer to remove "); 
    System.out.print("or a negative integer to quit: "); 
    number4 = scanner4.nextInt(); 
    while(number4 >= 0) {
        tree.removeBST(number4); 
        tree.traverseBST();
        System.out.println(); 
        System.out.print("Enter a positive integer to remove ");
        System.out.print("or a negative integer to quit: "); 
        number4 = scanner4.nextInt();
    }
    System.out.println();
    System.out.println("End of Program"); 
    System.out.println();
        }      
    } 
    
    

