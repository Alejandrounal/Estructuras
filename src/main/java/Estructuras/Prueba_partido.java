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
    
    static void printPartidosCola(LinkedQueueGeneric<Partidos> cola){         
        while(!cola.empty()){
            Partidos partido = cola.dequeue();
            System.out.println("equipo1:   "+partido.getEquipo1()+ "  vs      equipo2:   "+ partido.getEquipo2()+"   en   "+ partido.getFecha() );
        }     
    }
    
    static void prinPartidosStack(LinkedStackGeneric<Partidos> pila){
        while(!pila.empty()){
            Partidos partido =  pila.pop();
            System.out.println("equipo1:   "+partido.getEquipo1()+ "  vs      equipo2:   "+ partido.getEquipo2()+"   en   "+ partido.getFecha() );
        }
    }
    
    public static void main(String[] args) {
        LinkedQueueGeneric<Partidos> colaPartidos = new LinkedQueueGeneric<Partidos>();
        Partidos p1 = new Partidos("panteras","julitos","marzo");
        colaPartidos.enqueue(p1);
        Partidos p2 = new Partidos("palimir","chico","febrero");
        colaPartidos.enqueue(p2);
        if(colaPartidos.empty())
            System.out.println("Esque esta desocupada");
        else
            System.out.println("esta ocupada");
       printPartidosCola(colaPartidos);
       
       
       LinkedStackGeneric<Partidos> pilaPar = new LinkedStackGeneric<Partidos>();
       pilaPar.push(p1);
       pilaPar.push(p2);
       prinPartidosStack(pilaPar);
    }
}
