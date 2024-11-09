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
    
    Object myMonitorObject = new Object();
    boolean wasSignalled = false;
    int random;
    int count;
    
    public synchronized int GetNumber(){
        return random;
    }
    
    public synchronized void SetNumber(int random){
        this.random = random;
    }
    
    public void NumbersToProcess(int count){
        this.count = count;
    }
    
    public synchronized void setCount(int count) {
        this.count = count;
    }
    
    public boolean hasNumbersToProcess() {
        return count > 0;
    }
    
    public void Wait() {
        synchronized (myMonitorObject) {
            while (!wasSignalled) {
                try {
                    myMonitorObject.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        wasSignalled = false;
        }
    }
    
    public void Notify() {
        synchronized (myMonitorObject) {
            wasSignalled = true;
            count--;
            myMonitorObject.notify();
        }
    }
}
