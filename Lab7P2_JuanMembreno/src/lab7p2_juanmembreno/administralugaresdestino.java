/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_juanmembreno;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class administralugaresdestino {
    
    private ArrayList<lugardestino> listalugardestino= new ArrayList();
    private File archivo = null;

    public administralugaresdestino(String path) {
        archivo = new File(path);
    }

    public ArrayList<lugardestino> getListalugardestino() {
        return listalugardestino;
    }

    public void setListaPersonas(ArrayList<lugardestino> listalugardestino) {
        this.listalugardestino = listalugardestino;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listalugardestino=" + listalugardestino;
    }

    //extra mutador
    public void setPersona(lugardestino p) {
        this.listalugardestino.add(p);
    }

    public void cargarArchivo() {
        try {            
            listalugardestino = new ArrayList();
            lugardestino temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (lugardestino) objeto.readObject()) != null) {
                        listalugardestino.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (lugardestino t : listalugardestino) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
