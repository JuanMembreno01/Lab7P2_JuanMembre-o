/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_juanmembreno;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author usuario
 */
public class recorridoreserva extends Thread {
       
   private JProgressBar progBar_c;
    private JProgressBar progBar_r;
    private ArrayList<astronautas> a=new ArrayList();
    private naves nave;
    private int cantpasajeros;
    private lugardestino destino;
    private boolean avanzar;
    private boolean vive;

   /* /public recorrido(JProgressBar progBar_c,
            JProgressBar progBar_d, JSpinner sp_consumo) {
        this.progBar_c = progBar_c;
        this.progBar_d = progBar_d;
        this.sp_consumo = sp_consumo;
        avanzar = true;
        vive = true;
    }*/

    public recorridoreserva(JProgressBar progBar_r, naves nave, int cantpasajeros, lugardestino destino,ArrayList<astronautas> a) {
        this.progBar_c = progBar_c;
        this.progBar_r = progBar_r;
        this.nave = nave;
        this.cantpasajeros = cantpasajeros;
        this.destino = destino;
        this.avanzar = true;
        this.vive = true;
        this.a=a;
    }

    public JProgressBar getProgBar_c() {
        return progBar_c;
    }

    public void setProgBar_c(JProgressBar progBar_c) {
        this.progBar_c = progBar_c;
    }

    public JProgressBar getProgBar_r() {
        return progBar_r;
    }

    public void setProgBar_r(JProgressBar progBar_r) {
        this.progBar_r = progBar_r;
    }

    public ArrayList<astronautas> getA() {
        return a;
    }

    public void setA(ArrayList<astronautas> a) {
        this.a = a;
    }

    public naves getNave() {
        return nave;
    }

    public void setNave(naves nave) {
        this.nave = nave;
    }

    public int getCantpasajeros() {
        return cantpasajeros;
    }

    public void setCantpasajeros(int cantpasajeros) {
        this.cantpasajeros = cantpasajeros;
    }

    public lugardestino getDestino() {
        return destino;
    }

    public void setDestino(lugardestino destino) {
        this.destino = destino;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                //lo que esta en coment es lo que teniaa pero no sirve
               // revisaaa bien porqueee  ocupo puntoss
               int distanciafaltante=destino.getDistancia()-nave.getCantcombustible();
               progBar_r.setValue(progBar_r.getValue()+(distanciafaltante-nave.getCobustiblereserva()));
                // progBar_r.setValue(progBar_r.getValue()+1);
         int bandera=distanciafaltante-nave.getCobustiblereserva();
       
               if(bandera<0){
                   JOptionPane.showMessageDialog(null, "Nos quedamos sin combustible de respuesto no podremos llegar al Destino");
                   vive=false;
                   
               }
             bandera--; 
            }//FIN IF
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
            }
        }

    }
 
}
