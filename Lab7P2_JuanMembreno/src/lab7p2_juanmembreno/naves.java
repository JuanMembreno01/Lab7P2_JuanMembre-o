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
public class naves  implements Serializable{
     private String nombre;
      private String identificador;
               private int cantmaxpersonas;
                private int tiempodespegue;
                 private int tempoaterrizaje;
                  private double velocidadviaja;
                  private int distanciamax;
                  private int cantcombustible;
                  private int cobustiblereserva;
 private static final long SerialVersionUID=778L;
    public naves() {
    }

    public naves(String nombre, String identificador, int cantmaxpersonas, int tiempodespegue, int tempoaterrizaje, double velocidadviaja, int distanciamax, int cantcombustible, int cobustiblereserva) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.cantmaxpersonas = cantmaxpersonas;
        this.tiempodespegue = tiempodespegue;
        this.tempoaterrizaje = tempoaterrizaje;
        this.velocidadviaja = velocidadviaja;
        this.distanciamax = distanciamax;
        this.cantcombustible = cantcombustible;
        this.cobustiblereserva = cobustiblereserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getCantmaxpersonas() {
        return cantmaxpersonas;
    }

    public void setCantmaxpersonas(int cantmaxpersonas) {
        this.cantmaxpersonas = cantmaxpersonas;
    }

    public int getTiempodespegue() {
        return tiempodespegue;
    }

    public void setTiempodespegue(int tiempodespegue) {
        this.tiempodespegue = tiempodespegue;
    }

    public int getTempoaterrizaje() {
        return tempoaterrizaje;
    }

    public void setTempoaterrizaje(int tempoaterrizaje) {
        this.tempoaterrizaje = tempoaterrizaje;
    }

    public double getVelocidadviaja() {
        return velocidadviaja;
    }

    public void setVelocidadviaja(double velocidadviaja) {
        this.velocidadviaja = velocidadviaja;
    }

    public int getDistanciamax() {
        return distanciamax;
    }

    public void setDistanciamax(int distanciamax) {
        this.distanciamax = distanciamax;
    }

    public int getCantcombustible() {
        return cantcombustible;
    }

    public void setCantcombustible(int cantcombustible) {
        this.cantcombustible = cantcombustible;
    }

    public int getCobustiblereserva() {
        return cobustiblereserva;
    }

    public void setCobustiblereserva(int cobustiblereserva) {
        this.cobustiblereserva = cobustiblereserva;
    }

    @Override
    public String toString() {
return nombre;
    }
                  
}
