/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo_analicis_algoritmo;

import java.util.ArrayList;

/**
 *
 * @author MABY
 */
public class Grafo {

    private Nodo[] nodo;

    public Nodo[] getNodo() {
        return nodo;
    }

    private int numDeNodos;

    public int getNumDeNodos() {
        return numDeNodos;
    }

    private Vertice[] vertice;

    public Vertice[] getVertice() {
        return vertice;
    }

    private int numDeVertices;

    public int getNumDeVertices() {
        return numDeVertices;
    }

    public Grafo(Vertice[] vertice) {

        // El vértice se pasa, así que guárdelos
        this.vertice = vertice;

        // Crea  los nodos, listo para ser actualizado con el vértice
        this.numDeNodos = CalculaNumDeNodos(vertice);
        this.nodo = new Nodo[this.numDeNodos];
        for (int n = 0; n < this.numDeNodos; n++) {
            this.nodo[n] = new Nodo();
        }

        // Agrega todo el vértice al nodo. Cada borde se agrega a 2 nodo (el "DeNodo" y el "ANodo")
        this.numDeVertices = vertice.length;
        for (int verticeAdd = 0; verticeAdd < this.numDeVertices; verticeAdd++) {
            this.nodo[vertice[verticeAdd].getDeNodo()].getVertices().add(vertice[verticeAdd]);
            this.nodo[vertice[verticeAdd].getANodo()].getVertices().add(vertice[verticeAdd]);
        }
    }

    private int CalculaNumDeNodos(Vertice[] vertices) {
        int numDeNodos = 0;
        for (Vertice e : vertices) {
            if (e.getANodo() > numDeNodos) {
                numDeNodos = e.getANodo();
            }
            if (e.getDeNodo() > numDeNodos) {
                numDeNodos = e.getDeNodo();
            }
        }
        numDeNodos++;
        return numDeNodos;
    }

//    public void CalculaLaDistanciaMasCorta() {
//        // Establecer el nodo 0 como fuente
//        this.nodo[0].setCostoDeInicio(0);
//        int nextNodo = 0;
//
//        // Visita cada nodo, en orden de distancia almacenada
//        for (int i = 0; i < this.nodo.length; i++) {
//
//            // Hace un bucle alrededor del vértice que se une al nodo actual
//            ArrayList<Vertice> numVerticeAcual = this.nodo[nextNodo].getVertices();
//            for (int unirVetice = 0; unirVetice < numVerticeAcual.size(); unirVetice++) {
//
//                // Determine el vertice vecino unido del nodo actual
//                int nodoVecino = numVerticeAcual.get(unirVetice).getVecinoIndex(nextNodo);
//
//                // Solo entra en un vecino no visitado
//                if (!this.nodo[nodoVecino].isVisitado()) {
//
//                    // Calcule la distancia tentativa para el vecino
//                    int costoTentativo = this.nodo[nextNodo].getCostoDeInicio() + numVerticeAcual.get(unirVetice).getCosto();
//
//                    // Sobrescriba si la distancia tentativa es menor que la almacenada actualmente
//                    if (costoTentativo < nodo[nodoVecino].getCostoDeInicio()) {
//                        nodo[nodoVecino].setCostoDeInicio(costoTentativo);
//                    }
//                }
//            }
//
//            // Todos los vecinos son revisados ​​por lo que este nodo ahora es visitado
//            nodo[nextNodo].setVisitado(true);
//
//            //El próximo nodo a visitar debe ser el que tenga la distancia más corta.
//            nextNodo = getNodeShortestDistanced();
//        }
//    }
//    private int getNodeShortestDistanced() {
//
//        int storedNodeIndex = 0;
//        int storedDist = Integer.MAX_VALUE;
//
//        for (int i = 0; i < this.nodo.length; i++) {
//            int currentDist = this.nodo[i].getCostoDeInicio();
//            if (!this.nodo[i].isVisitado() && currentDist < storedDist) {
//                storedDist = currentDist;
//                storedNodeIndex = i;
//            }
//        }
//        return storedNodeIndex;
//    }
    public String ImprimirNodos() {
        String texto = "Numero de nodos = " + this.numDeNodos;
        texto += "\nNumero de Vertices = " + this.numDeVertices;

        for (int ver = 0; ver < this.numDeVertices; ver++) {
            texto += "\n" + vertice[ver].toString();
        }
        
        for (int nod = 0; nod < this.numDeNodos; nod++) {
            texto += "\n" + nodo[nod].toString();
        }

//        for (int verticeAdd = 0; verticeAdd < this.numDeVertices; verticeAdd++) {
//            this.nodo[vertice[verticeAdd].getDeNodo()].getVertices();
//            this.nodo[vertice[verticeAdd].getANodo()].getVertices().add(vertice[verticeAdd]);
//        }
        return texto;
    }

    @Override
    public String toString() {

        String texto = "Numero de nodos = " + this.numDeNodos;
        texto += "\nNumero de Vertices = " + this.numDeVertices;

        for (int i = 0; i < this.nodo.length; i++) {
            texto += ("\nLa distancia más corta desde el nodo 0 al nodo " + i + " is " + nodo[i].getCostoDeInicio());
        }

        return texto;
    }
}
