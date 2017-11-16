/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo_analicis_algoritmo;

import java.util.Comparator;

/**
 *
 * @author MABY
 */
public class Vertice {

    private int deNodo;
	
    public int getDeNodo() {
        return deNodo;
    }

    private int aNodo;

    public int getANodo() {
        return aNodo;
    }

    private int costo;

    public int getCosto() {
        return costo;
    }

    public Vertice(int deNodo, int aNodo, int costo) {
        this.deNodo = deNodo;
        this.aNodo = aNodo;
        this.costo = costo;
    }

    public int getVecinoIndex(int nodeIndex) {
        if (this.deNodo == nodeIndex) {
            return this.aNodo;
        } else {
            return this.deNodo;
        }
    }

    
    
    public int toCompare(Vertice vertice) {
        if (this.costo < vertice.getCosto()) {
            return -1;
        }
        if (this.costo > vertice.getCosto()) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        return "(" + this.deNodo + " -> " + this.aNodo + ", " + this.costo + ")";
    }
}
