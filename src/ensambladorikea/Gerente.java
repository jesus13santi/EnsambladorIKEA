package ensambladorikea;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Gerente extends Thread {
    
    Semaphore semContador;
    String estado;
    float dia;
    
    public Gerente(float dia, Semaphore semContador){
    
        this.estado = "Durmiendo";
        this.dia = dia;
        this.semContador = semContador;
        Interfaz.l_estado_gerente.setText(estado);
        
    }
    
    @Override
    public void run(){
    
        while (!EnsambladorIKEA.exit){
            
            try {
                
                semContador.acquire();
                estado = "Revisando";
                Interfaz.l_estado_gerente.setText(estado);
                Thread.sleep((long) (1000*dia/6));
                if(Jefe.contador == 0){
                    
                    Jefe.contador = EnsambladorIKEA.despacho;
                    estado = "Desplegando";
                    Interfaz.l_estado_gerente.setText(estado);
                    EnsambladorIKEA.desplegar();
                    Interfaz.l_disp_escritorios.setText( ""+EnsambladorIKEA.num_escritorios );
                }
                semContador.release();
                
                estado = "Durmiendo";
                Interfaz.l_estado_gerente.setText(estado);
                Thread.sleep((long) (1000*dia/3));
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
    }
    
}
