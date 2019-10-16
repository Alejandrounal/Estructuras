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
public class Prueba_partido {
    public static void main(String[] args) {
        Queue colaPartido = new Queue();
        colaPartido.enqueue(new Partidos("panteras","julitos","marzo"));
        colaPartido.enqueue(new Partidos("palimir","chico","febrero"));
        colaPartido.printQueue();
    }
}
