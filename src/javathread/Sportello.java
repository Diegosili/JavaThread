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
    
    private Conto conto;
    private String utente;
    
    public Sportello(Conto conto, String utente) {
        this.conto = conto;
        this.utente = utente;
    }
    
    public void run() {
        System.out.println(utente+" partito con: "+conto.getSaldo());
    }
    
    public void versa(int somma) {
        conto.versa(somma);
    }
    
    public void preleva(int somma) {
        conto.preleva(somma);
    }
    
    public void stampaSaldo() {
        System.out.println("saldo: "+conto.getSaldo());
    }
}
