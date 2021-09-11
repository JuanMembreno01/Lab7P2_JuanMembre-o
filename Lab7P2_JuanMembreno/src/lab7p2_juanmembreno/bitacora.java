/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_juanmembreno;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;

/**
 *
 * @author usuario
 */
public class bitacora {
    
    private boolean avanzar;
    private boolean vive;
   private int numero;
   private int numero2;
    private boolean flag;

   

    public bitacora(int numero,int numero2) {
        this.numero = numero;
        this.numero2 = numero2;
    }
    

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void run() {
        FileWriter salida = null;
        BufferedWriter br = null;
        flag = true;
        while (vive) {
            if (avanzar) {
                try {
                    salida = new FileWriter("./bitacora.txt", true);
                    br = new BufferedWriter(salida);
                    br.write("misones esitosas:" + numero);
                    br.write("misones fallidas:" + numero2);  
                    br.newLine();
                    br.flush();
                    salida.close();

                } catch (Exception ex) {
                }
            }
            try {
                Thread.sleep(350);
            } catch (InterruptedException ex) {
                Logger.getLogger(bitacora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
