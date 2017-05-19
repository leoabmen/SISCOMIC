/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package siscomic;

import java.awt.Color;
import javax.swing.JProgressBar;

/**
 *
 * @author IsraelCM
 */
public class Cargar_splash extends Thread{
    JProgressBar progreso;
    public Cargar_splash(JProgressBar progreso){
        super();
        this.progreso=progreso;
    }
    @Override
    public void run(){
        for(int i=1;i<=100;i++){
            progreso.setValue(i);
            progreso.setForeground(Color.GREEN);
            pausa(80);
        }
    }
    public void pausa(int mlSeg){
        try{
            Thread.sleep(mlSeg);
        }
        catch(Exception e){
            
        }
    }
}
