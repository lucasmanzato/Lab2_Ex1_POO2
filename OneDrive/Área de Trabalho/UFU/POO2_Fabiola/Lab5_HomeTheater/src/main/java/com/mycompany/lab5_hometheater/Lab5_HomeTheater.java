/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5_hometheater;

/**
 *
 * @author lucas
 */
public class Lab5_HomeTheater {

    public static void main(String ... args){
        
        Amplificador amp = new Amplificador();
        Luzes luzes = new Luzes();
        MaquinaPipoca pipoqueira = new MaquinaPipoca();
        Projetor projetor = new Projetor();
        StreamingPlayer player = new StreamingPlayer();
        Telao telao = new Telao();
        
        
        HomeTheaterFachada homeTheater = 
				new HomeTheaterFachada(amp, player, projetor, luzes, telao, pipoqueira);
 
		homeTheater.assistirFilme("Harry Potter");
                homeTheater.fimDoFilme();
    }
}