/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ensambladorikea;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProductorTablas extends Thread {
    
    Semaphore semTablas;
    float dia;
    boolean ready;
    boolean contratado;
    
    public ProductorTablas(Semaphore semTablas, float dia){
        this.semTablas = semTablas;
        this.dia = dia;
        ready = false;
        contratado = true;
    }
    
    @Override
    public void run(){
        
        while( contratado && !EnsambladorIKEA.exit ){
            
            try {
                
                //boton
                if(!ready)    
                    Thread.sleep((long) (dia*1000*3));

                semTablas.acquire();
                if( EnsambladorIKEA.num_tablas<EnsambladorIKEA.max_tablas){
                    EnsambladorIKEA.num_tablas+=1;
                    Interfaz.l_disp_tablas.setText( ""+EnsambladorIKEA.num_tablas );
                    ready = false;
                }else{
                    ready = true;
                }
                semTablas.release();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorTablas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    public void despedir(){
        contratado = false;
    }
    
}