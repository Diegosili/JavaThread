/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author siliprandi.diego
 */
public class JavaThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Processo T1 = new Processo("T1");
//        Processo T2 = new Processo("T2");
//        T1.start();
//        T2.start();
        
//        ProcessoRunnable p1 = new ProcessoRunnable("p1");
//        Thread t1 = new Thread(p1);
//        t1.start();
//
//        try {
//            Thread.sleep(5000);
//            p1.stoppa();
//            
//        } catch (InterruptedException ex) {
//            Logger.getLogger(JavaThread.class.getName()).log(Level.SEVERE, null, ex);
//        }

        Conto c = new Conto(2000);
        Sportello sport1 = new Sportello(c);
        Sportello sport2 = new Sportello(c);
        Thread genitore1 = new Thread(sport1);
        Thread genitore2 = new Thread(sport2);
        
        genitore1.start();
        genitore2.start();
        
        sport1.versa(500);
        sport2.versa(800);
        
         
    }
    
}
