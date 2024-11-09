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
public class ThreadConsumidora implements Runnable{
    
    private final Monitora monitora;
    
    public ThreadConsumidora(Monitora monitora) {
        this.monitora = monitora;
    }
    
    @Override
    public void run() {
        while(monitora.hasNumbersToProcess()){     
            try {
                monitora.Wait();
                int numeroRecebido = monitora.GetNumber();
                System.out.println("Consumidora recebeu o número: " + numeroRecebido);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadProdutora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Consumidora finalizou o processamento de todos os números.");
    }
}
