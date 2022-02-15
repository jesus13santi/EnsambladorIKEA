/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ensambladorikea;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javie
 */
public class ProductorCuerpoCentral extends Thread {
    
//    Semaphore semCuerpoCentral;
//    float dia;
//    boolean ready;
//    boolean contratado;
//    
//    public ProductorCuerpoCentral(Semaphore semCuerpoCentral, float dia){
//        this.semCuerpoCentral = semCuerpoCentral;
//        this.dia = dia;
//        this.ready = false;
//        this.contratado = true;
//    }
//    
//    @Override
//    public void run(){
//        
//        while( contratado && !EnsambladorIKEA.exit ){
//            try {
//                //boton
//                if(!ready)    
//                    Thread.sleep((long) (dia*1000*3));
//
//                semCuerpoCentral.acquire();
//                if( EnsambladorIKEA.num_cuerpo_central<EnsambladorIKEA.max_cuerpo_central ){
//                    EnsambladorIKEA.num_cuerpo_central+=1;
////                    Interfaz.l_disp_cuerpos_centrales.setText( ""+EnsambladorIKEA.num_cuerpo_central );
//                    ready = false;
//                }else{
//                    ready = true;
//                }
//                semCuerpoCentral.release();
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ProductorCuerpoCentral.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//        }
//        
//    }
//    
//    public void despedir(){
//        contratado = false;
//    }
    
}