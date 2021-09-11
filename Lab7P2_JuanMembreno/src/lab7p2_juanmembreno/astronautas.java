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
public class astronautas implements Serializable {

    private int id;
    private String nombre;
    private String nacionalidad;
    private String titulo;
    private String contextura;
    private double peso;
    private int cantmisiones;
    private static final long SerialVersionUID = 765L;

    public astronautas() {
    }

    public astronautas(int id, String nombre, String nacionalidad, String titulo, String contextura, double peso,int cantmisiones ) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.titulo = titulo;
        this.contextura = contextura;
        this.peso = peso;
        this.cantmisiones=cantmisiones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContextura() {
        return contextura;
    }

    public void setContextura(String contextura) {
        this.contextura = contextura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCantmisiones() {
        return cantmisiones;
    }

    public void setCantmisiones(int cantmisiones) {
        this.cantmisiones = cantmisiones;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
