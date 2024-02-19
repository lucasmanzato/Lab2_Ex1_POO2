/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4_ave;

/**
 *
 * @author lucas
 */
public class PatoAveAdapter implements Ave {
    
    Pato pato;
    
    public PatoAveAdapter(Pato pato){
        this.pato = pato;
    }
    
    
    @Override
    public void voar() {
        pato.voar();
    }

    @Override
    public void emitirSom() {
        pato.grasnar();
    }
    
    
    
}
