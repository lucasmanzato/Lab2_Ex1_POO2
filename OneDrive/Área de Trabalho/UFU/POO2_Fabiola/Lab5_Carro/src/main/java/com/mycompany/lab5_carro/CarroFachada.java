/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5_carro;

/**
 *
 * @author lucas
 */
public class CarroFachada {

    Motor motor;
    CintoDeSeguranca cinto;
    Farol farol;
    Radio radio;
    Porta porta;

    public CarroFachada(Motor motor,
            CintoDeSeguranca cinto,
            Farol farol,
            Radio radio,
            Porta porta) {

        this.cinto = cinto;
        this.farol = farol;
        this.motor = motor;
        this.porta = porta;
        this.radio = radio;
    }
    
    public void ligarCarro(double fm){
    
        System.out.println("Ligando Carro...");
        motor.liga();
        porta.trancar();
        cinto.Colocar();
        farol.liga();
        radio.liga();
        radio.play(fm);
        System.out.println("...Vrum Vrum");
    }
    
    public void desligarCarro(){
        
        System.out.println("Deligando Carro...");
        motor.desliga();
        porta.destrancar();
        cinto.Retirar();
        farol.desliga();
        radio.desliga();
        System.out.println("...Desligado.");
    }
}
