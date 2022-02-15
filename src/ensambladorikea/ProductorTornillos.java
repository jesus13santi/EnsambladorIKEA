/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ensambladorikea;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProductorTornillos extends Thread {
    
    Semaphore semTornillos;
    float dia;
    boolean ready;
    boolean contratado;
    
    public ProductorTornillos(Semaphore semTornillos, float dia){
        this.semTornillos = semTornillos;
        this.dia = dia;
        this.ready = false;
        this.contratado = true;
    }
    
    @Override
    public void run(){
        
        while( contratado && !EnsambladorIKEA.exit ){
            try {
                //boton
                if(!ready)    
                    Thread.sleep((long) (dia*1000/30));

                semTornillos.acquire();
                if( EnsambladorIKEA.num_tornillos<EnsambladorIKEA.max_tornillos){
                    EnsambladorIKEA.num_tornillos+=1;
                    Interfaz.l_disp_tornillos.setText( ""+EnsambladorIKEA.num_tornillos );
                    ready = false;
                }else{
                    ready = true;
                }
                semTornillos.release();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorTornillos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    public void despedir(){
        contratado = false;
    }
    
}