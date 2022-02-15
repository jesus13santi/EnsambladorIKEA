package ensambladorikea;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnsambladorIKEA {
  
    public static float dia;
    public static int despacho;
    public static boolean exit = false;
    
    // Maximo de piezas en almacen
    public static int max_tablas;
    public static int max_tornillos;
    public static int max_patas;
//    public static int max_cuerpo_central;
    
    // Numero de Productores por Pieza Iniciales
    public static volatile int numProd_tablas;
    public static volatile int numProd_tornillos;
    public static volatile int numProd_patas;
//    public static volatile int numProd_cuerpo_central;
    
    // Maximo de Productores por pieza
    public static int max_prod_tablas;
    public static int max_prod_tornillos;
    public static int max_prod_patas;
//    public static int max_prod_cuerpo_central;
    
    // Maximo de Ensambladores
    public static volatile int max_ensambladores;
    
    // Numero de Ensambladores Iniciales
    public static volatile int num_ensambladores;
    
    // Numero de Piezas Iniciales
    public static volatile int num_tablas;
    public static volatile int num_tornillos;
    public static volatile int num_patas;
//    public static volatile int num_cuerpo_central;
    public static volatile int num_escritorios;
    public static volatile int num_escritorios_total;
    
    // Arrays de Productores y Ensambladores
    public static volatile ProductorTablas[] prod_tablas;
    public static volatile ProductorTornillos[] prod_tornillos;
//    public static volatile ProductorCuerpoCentral[] prod_cuerpo_central;
    public static volatile ProductorPatas[] prod_patas;
    public static volatile Ensamblador[] ensambladores;
    
    // Jefe y Gerente
    public static volatile Jefe jefe;
    public static volatile Gerente gerente;
    
    // Semaforos
    public static Semaphore semContador;
    public static Semaphore semEscritorio;
    public static Semaphore semTablas;
    public static Semaphore semTornillos;
//    public static Semaphore semCuerpoCentral;
    public static Semaphore semPatas;
    
    public static void main(String[] args) {
        
        Interfaz.main(args);
        
    }
    
    public static void desplegar(){
        
        try {
            
            semEscritorio.acquire();
            num_escritorios = 0;
            semEscritorio.release();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(EnsambladorIKEA.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void ensamblar(){
        
        num_tablas = 0;
        num_tornillos = 0;
        num_patas = 0;
//        num_cuerpo_central = 0;
        num_escritorios = 0;
        num_escritorios_total = 0;
        
        semEscritorio = new Semaphore(1, true);
        semTablas = new Semaphore(1, true);
        semTornillos = new Semaphore(1, true);
        semPatas = new Semaphore(1, true);
//        semCuerpoCentral = new Semaphore(1, true);
        semContador = new Semaphore(1, true);
        
        jefe = new Jefe(dia, despacho, semContador);
        gerente = new Gerente(dia, semContador);
        
        prod_tablas = new ProductorTablas[max_prod_tablas];
        prod_tornillos = new ProductorTornillos[max_prod_tornillos];
        prod_patas = new ProductorPatas[max_prod_patas];
//        prod_cuerpo_central = new ProductorCuerpoCentral[max_prod_cuerpo_central];
        ensambladores = new Ensamblador[max_ensambladores];
        
        jefe.start();
        gerente.start();
        
        for( int i = 0; i<numProd_tablas; i++) {
            prod_tablas[i] = new ProductorTablas(semTablas, dia);
            prod_tablas[i].start();
        }
        
        for( int i = 0; i<numProd_tornillos; i++) {
            prod_tornillos[i] = new ProductorTornillos(semTornillos, dia);
            prod_tornillos[i].start();
        }
        
        for( int i = 0; i<numProd_patas; i++) {
            prod_patas[i] = new ProductorPatas(semPatas, dia);
            prod_patas[i].start();
        }
        
//        for( int i = 0; i<numProd_cuerpo_central; i++) {
//            prod_cuerpo_central[i] = new ProductorCuerpoCentral(semCuerpoCentral, dia);
//            prod_cuerpo_central[i].start();
//        }
        
        for(int i = 0; i<num_ensambladores; i++){
            ensambladores[i] = new Ensamblador(semTablas, semTornillos, semPatas, semEscritorio, dia);
            ensambladores[i].start();
        }
        
        Interfaz.l_prod_tornillos.setText(""+numProd_tornillos);
        Interfaz.l_prod_patas.setText(""+numProd_patas);
//        Interfaz.l_prod_cuerpo_central.setText(""+numProd_cuerpo_central);
        Interfaz.l_prod_tablas.setText(""+numProd_tablas);
        Interfaz.l_ensambladores.setText(""+num_ensambladores);
        
        
        Interfaz.l_disp_tornillos.setText(""+num_tornillos);
        Interfaz.l_disp_patas.setText(""+num_patas);
        Interfaz.l_disp_escritorios.setText(""+num_escritorios);
//        Interfaz.l_disp_cuerpos_centrales.setText(""+num_cuerpo_central);
        Interfaz.l_disp_tablas.setText(""+num_tablas);
        Interfaz.l_total_escritorios.setText(""+num_escritorios_total);
        
    }
    
    public static boolean readCSV(File file){
        
        try {
            
            String tmp;
            
            Scanner load = new Scanner( file );
            load.useDelimiter(",|\n|\r");
            
            load.nextLine();
            
            tmp = load.next();
            dia =  Float.parseFloat(tmp);
            tmp = load.next();
            despacho = Integer.parseInt(tmp);
            
            tmp = load.next();
            max_tablas = Integer.parseInt(tmp);
            tmp = load.next();
            max_tornillos = Integer.parseInt(tmp);
            tmp = load.next();
            max_patas = Integer.parseInt(tmp);
//            tmp = load.next();
//            max_cuerpo_central = Integer.parseInt(tmp);
            
            tmp = load.next();
            numProd_tablas = Integer.parseInt(tmp);
            tmp = load.next();
            numProd_tornillos = Integer.parseInt(tmp);
            tmp = load.next();
            numProd_patas = Integer.parseInt(tmp);
//            tmp = load.next();
//            numProd_cuerpo_central = Integer.parseInt(tmp);
            
            tmp = load.next();
            max_prod_tablas = Integer.parseInt(tmp);
            tmp = load.next();
            max_prod_tornillos = Integer.parseInt(tmp);
            tmp = load.next();
            max_prod_patas = Integer.parseInt(tmp);
//            tmp = load.next();
//            max_prod_cuerpo_central = Integer.parseInt(tmp);
            
            tmp = load.next();
            num_ensambladores = Integer.parseInt(tmp);
            tmp = load.next();
            max_ensambladores = Integer.parseInt(tmp);
            
            //MODIFICAR AQUI OJOOOOOO
            
            return !(numProd_tablas > max_prod_tablas || numProd_tornillos > max_prod_tornillos || numProd_patas > max_prod_patas ||  num_ensambladores > max_ensambladores || max_prod_tablas < 1 || max_prod_tornillos < 1 || max_prod_patas < 1 ||  max_ensambladores < 1 || numProd_tablas < 1 || numProd_tornillos < 1 || numProd_patas < 1 || num_ensambladores < 1 || dia < 1 || despacho < 1 || max_tornillos < 40 || max_patas < 4 || max_tablas < 1 );
            
        } catch (Exception e) {
            return false;
        }
        
    }
    
}
