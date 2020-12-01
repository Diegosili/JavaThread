/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

/**
 *
 * @author siliprandi.diego
 */
public class Sportello implements Runnable{
    
    Conto conto;
    
    public Sportello(Conto conto) {
        this.conto = conto;
    }
    
    public void run() {
        
    }
    
    public void versa(int somma) {
        conto.versa(somma);
        System.out.println("conto: "+conto.saldo());
    }
}
