/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ensambladorikea;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ensamblador extends Thread {
    
    Semaphore semTablas;
    Semaphore semTornillos;
    Semaphore semPatas;
//    Semaphore semCuerpoCentral;
    Semaphore semEscritorio;
    float dia;
    boolean contratado;
    
    public Ensamblador(Semaphore semTablas, Semaphore semTornillos, Semaphore semPata,  Semaphore semEscritorio, float dia){
        this.semTablas = semTablas;
        this.semTornillos = semTornillos;
        this.semPatas = semPata;
//        this.semCuerpoCentral = semCuerpoCentral;
        this.semEscritorio = semEscritorio;
        this.dia = dia;
        this.contratado = true;
    }
    
    @Override
    public void run(){

        while( contratado && !EnsambladorIKEA.exit ){
            
            try {

                semTablas.acquire();
                semTornillos.acquire();
                semPatas.acquire();
//                semCuerpoCentral.acquire();
                if( EnsambladorIKEA.num_tablas >= 12 && EnsambladorIKEA.num_tornillos >= 300 && EnsambladorIKEA.num_patas >= 34 ){

                    EnsambladorIKEA.num_tablas -= 12;
                    Interfaz.l_disp_tablas.setText( ""+EnsambladorIKEA.num_tablas );
                    semTablas.release();

                    EnsambladorIKEA.num_tornillos -= 300;
                    Interfaz.l_disp_tornillos.setText( ""+EnsambladorIKEA.num_tornillos );
                    semTornillos.release();

                    EnsambladorIKEA.num_patas -= 34;
                    Interfaz.l_disp_patas.setText( ""+EnsambladorIKEA.num_patas );
                    semPatas.release();

//                    EnsambladorIKEA.num_cuerpo_central -=1;
////                    Interfaz.l_disp_cuerpos_centrales.setText( ""+EnsambladorIKEA.num_cuerpo_central );
//                    semCuerpoCentral.release();

                    Thread.sleep((long) (dia*1000*2));

                    semEscritorio.acquire();
                    EnsambladorIKEA.num_escritorios++;
                    EnsambladorIKEA.num_escritorios_total++;
                    Interfaz.l_disp_escritorios.setText( ""+EnsambladorIKEA.num_escritorios );
                    Interfaz.l_total_escritorios.setText(""+EnsambladorIKEA.num_escritorios_total);
                    semEscritorio.release();

                }else{
                    semTablas.release();
                    semTornillos.release();
                    semPatas.release();
//                    semCuerpoCentral.release();
                }

                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    public void despedir(){
        contratado = false;
    }
    
}
