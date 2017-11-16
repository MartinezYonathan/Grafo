/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo_analicis_algoritmo;

/**
 *
 * @author MABY
 */
public class Grafo_Analicis_Algoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vertice[] vertices =
        {	
            new Vertice(0,2,1),
            new Vertice(0,3,4),
            new Vertice(0,4,2),
            new Vertice(0,1,3),
            new Vertice(1,3,2),
            new Vertice(1,4,3),
            new Vertice(1,5,1),
            new Vertice(2,4,1),
            new Vertice(3,5,4),
            new Vertice(4,5,2),
            new Vertice(4,6,7),
            new Vertice(4,7,2),
            new Vertice(5,6,4),
            new Vertice(6,7,5)
        };
        
        Grafo grafo = new Grafo(vertices);
        System.out.println(grafo.ImprimirNodos());
    }
    
}
