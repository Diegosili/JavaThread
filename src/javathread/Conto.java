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
public class Conto {
    
    private int tot;
    private int tasse = 100;
    
    public Conto(int tot) {
        this.tot = tot;
    }
    
    public synchronized void versa(int somma) {
        tot = tot + somma - tasse;
    }
    
    public synchronized int getSaldo() {
        return tot;
    }
    
    public synchronized void preleva(int somma) {
        tot = tot - somma;
    }
}
