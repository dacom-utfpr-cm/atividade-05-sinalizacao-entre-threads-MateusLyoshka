/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.atividade06;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a2515695
 */
public class ThreadProdutora implements Runnable {
    
    private final Monitora monitora;
    
    public ThreadProdutora(Monitora monitora) {
        this.monitora = monitora;
    }
    
    @Override
    public void run() {
        while(monitora.count > 0){
            try {
                int randomNumber = (int) (Math.random() * 100);
                System.out.println("Número gerado: " + randomNumber);
                monitora.SetNumber(randomNumber);
                monitora.Notify();
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadProdutora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
