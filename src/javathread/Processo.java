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
public class Processo extends Thread {
    
    private String a;
    
    public Processo(String a) {
        this.a = a;
    }
    
    public void run() {
        int i = 0;
        for(;;i++) System.out.println(a+" "+i);
    }
    
}
