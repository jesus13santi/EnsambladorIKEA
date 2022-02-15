package ensambladorikea;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jefe extends Thread {
    
    public static int contador;
    Semaphore semContador;
    String estado;
    float dia;
    int despliegue;
    public static int dias_trans;
    
    public Jefe(float dia, int despliegue, Semaphore semContador){
        estado = "Durmiendo";
        Interfaz.l_estado_jefe.setText(estado);
        this.semContador = semContador;
        dias_trans = 0;
        this.despliegue = despliegue;
        contador = despliegue;
        this.dia = dia;
        String tmp;
        tmp = ""+contador;
        Interfaz.l_dias_left.setText(tmp);
        
    }
    
    @Override
    public void run(){
        
        while(!EnsambladorIKEA.exit){
            
            try {
                semContador.acquire();
                estado = "Actualizando";
                Interfaz.l_estado_jefe.setText(estado);
                Thread.sleep((long) (1000*dia/3));
                dias_trans++;
                contador--;
                semContador.release();
                Interfaz.l_dias_trans.setText(""+dias_trans);
                Interfaz.l_dias_left.setText(""+contador);
                estado = "Durmiendo";
                Interfaz.l_estado_jefe.setText(estado);
                Thread.sleep((long) (1000*dia*2/3));
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Jefe.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
}
