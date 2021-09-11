/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_juanmembreno;

import java.io.Serializable;

/**
 *
 * @author usuario
 */
public class lugardestino implements Serializable  {
    private String nombre;
     private int distancia;
     private String superficie;
     private int saturacionoxigeno;
private static final long SerialVersionUID=798L;
    public lugardestino() {
    }

    public lugardestino(String nombre, int distancia, String superficie, int saturacionoxigeno) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.superficie = superficie;
        this.saturacionoxigeno = saturacionoxigeno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public int getSaturacionoxigeno() {
        return saturacionoxigeno;
    }

    public void setSaturacionoxigeno(int saturacionoxigeno) {
        this.saturacionoxigeno = saturacionoxigeno;
    }

    @Override
    public String toString() {
       return nombre;
    }
     
}
