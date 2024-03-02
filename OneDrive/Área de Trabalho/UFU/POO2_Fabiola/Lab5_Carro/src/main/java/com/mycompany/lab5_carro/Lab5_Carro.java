/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5_carro;

/**
 *
 * @author lucas
 */
public class Lab5_Carro {

    public static void main(String[] args) {
        
        Motor motor = new Motor();
        CintoDeSeguranca cinto = new CintoDeSeguranca();
        Farol farol = new Farol();
        Radio radio = new Radio();
        Porta porta = new Porta();
        
        CarroFachada carro = new CarroFachada(motor, cinto, farol, radio, porta);
        
        carro.ligarCarro(94.7);
        carro.desligarCarro();
    }
}
