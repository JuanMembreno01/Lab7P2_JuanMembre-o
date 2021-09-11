/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_juanmembreno;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;

/**
 *
 * @author usuario
 */
public class recorrido  extends Thread{
    
    private JProgressBar progBar_c;
    private JProgressBar progBar_r;
    private ArrayList<astronautas> a=new ArrayList();
    private naves nave;
    private int cantpasajeros;
    private lugardestino destino;
    private boolean avanzar;
    private boolean vive;

 

    public recorrido(JProgressBar progBar_c, naves nave, int cantpasajeros, lugardestino destino,ArrayList<astronautas> a) {
        this.progBar_c = progBar_c;
        this.progBar_r = progBar_r;
        this.nave = nave;
        this.cantpasajeros = cantpasajeros;
        this.destino = destino;
        this.avanzar = true;
        this.vive = true;
        this.a=a;
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
               int prueba=destino.getDistancia()-nave.getCantcombustible();
               System.out.println(prueba);
               // progBar_c.setValue(Math.round(prueba));
                progBar_c.setValue(progBar_c.getValue()+Math.round(prueba));
                progBar_c.setString(Integer.toString(
                        progBar_c.getValue()) + " Kilometros");

               int distanciafaltante=destino.getDistancia()-nave.getCantcombustible();
               if(distanciafaltante>0){
                   JOptionPane.showMessageDialog(null, "Nos quedamos sin combustible (Use el de repuesto)");
                   vive=false;
              }
              
            }//FIN IF
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
            }
        }

    }

}
