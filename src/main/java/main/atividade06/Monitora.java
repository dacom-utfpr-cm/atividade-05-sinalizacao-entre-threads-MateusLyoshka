/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.atividade06;

/**
 *
 * @author a2515695
 */
public class Monitora {
    Monitora MonitorObject = new Monitora();
    
    boolean wasSignalled = false;
    
    public void Wait(){
        synchronized(MonitorObject){
            while(!wasSignalled){
                try{
                    MonitorObject.Wait();
                }catch(InterruptedException e){
                    System.out.println("Interrupção! "+e.getMessage());
                }
                
            }
    }
    
    public void Notify(){
    
    }
}
