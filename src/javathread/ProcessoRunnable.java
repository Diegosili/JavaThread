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
public class ProcessoRunnable implements Runnable {
    
    private String s;
    private boolean stop;
    
    public ProcessoRunnable(String s) {
        stop = false;
        this.s = s;
    }
    
    public void run() {
        while(!stop) System.out.println(s);
        
    }
    
    public void stoppa() {
        stop = true;
    }
}
