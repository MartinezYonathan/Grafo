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
public class Nodo {
    
    private int costoDeInicio = Integer.MAX_VALUE;
    
    public Nodo() {
    }

    public int getCostoDeInicio() {
        return costoDeInicio;
    }

    public void setCostoDeInicio(int costoDeInicio) {
        this.costoDeInicio = costoDeInicio;
    }

    private boolean visitado = false;

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    private ArrayList<Vertice> vertice = new ArrayList<>();

    public ArrayList<Vertice> getVertices() {
        return vertice;
    }

    public void setVertices(ArrayList<Vertice> vertice) {
        this.vertice = vertice;
    }

}
