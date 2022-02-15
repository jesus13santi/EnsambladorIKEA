/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ensambladorikea;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProductorPatas extends Thread {
    
    Semaphore semPatas;
    float dia;
    boolean ready;
    boolean contratado;
    
    public ProductorPatas(Semaphore semPatas, float dia){
        this.semPatas = semPatas;
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
                    Thread.sleep((long) (dia*1000/2));

                semPatas.acquire();
                if( EnsambladorIKEA.num_patas<EnsambladorIKEA.max_patas ){
                    EnsambladorIKEA.num_patas+=1;
                    Interfaz.l_disp_patas.setText( ""+EnsambladorIKEA.num_patas );
                    ready = false;
                }else{
                    ready = true;
                }
                semPatas.release();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorPatas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    public void despedir(){
        contratado = false;
    }
    
}