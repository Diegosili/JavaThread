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
//        try {
//            Thread.sleep(5000);
//            p1.stoppa();
//            
//        } catch (InterruptedException ex) {
//            Logger.getLogger(JavaThread.class.getName()).log(Level.SEVERE, null, ex);
//        }

//        Conto c = new Conto(2000);
//        Sportello sport1 = new Sportello(c);
//        Sportello sport2 = new Sportello(c);
//        Thread genitore1 = new Thread(sport1);
//        Thread genitore2 = new Thread(sport2);
//        
//        genitore1.start();
//        genitore2.start();
//        sport1.versa(500);
//        sport2.versa(800);
        
        
        Conto conto = new Conto(1000);
        Sportello ATM1 = new Sportello(conto, "mamma");
        Sportello ATM2 = new Sportello(conto, "papa");
        Thread mamma = new Thread(ATM1);
        Thread papa = new Thread(ATM2);
        
        mamma.start();
        papa.start();
        
        int qualeThread; //0 = mamma; 1 = papà
        int cheOperazione; //0 = versa; 1 = preleva
        int quanto;
        
        while(true) {
            qualeThread = (int) (Math.random()*2);
            cheOperazione = (int) (Math.random()*2);
            quanto = (int) (Math.random()*501);
            
            if(qualeThread == 0){
                if(cheOperazione == 0) {
                    ATM1.versa(quanto);
                    System.out.println("mamma versa "+quanto+"€");
                } else {
                    ATM1.preleva(quanto);
                    System.out.println("mamma preleva "+quanto+"€");
                }
            }else{
                if(cheOperazione == 0) {
                    ATM2.versa(quanto);
                    System.out.println("papa versa "+quanto+"€");
                } else {
                    ATM2.preleva(quanto);
                    System.out.println("papa preleva "+quanto+"€");
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.err.println("Eccezione \"InterruptedException\" nel main");
            }
            
            if(qualeThread == 0) {
                ATM1.stampaSaldo();
            }else{
                ATM2.stampaSaldo();
            }
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.err.println("Eccezione \"InterruptedException\" nel main");
            }
        }
    }
    
}
