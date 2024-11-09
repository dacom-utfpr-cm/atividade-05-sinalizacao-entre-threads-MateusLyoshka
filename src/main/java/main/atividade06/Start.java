/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.atividade06;

/**
 *
 * @author mateus-lyoshka
 */
public class Start {
    public static void main(String[] args) {
        Monitora monitora1 = new Monitora();
        monitora1.setCount(3);
        ThreadProdutora prod1 = new ThreadProdutora(monitora1);
        ThreadConsumidora cons1 = new ThreadConsumidora(monitora1);
        new Thread(prod1).start();
        new Thread(cons1).start();
    }
}
