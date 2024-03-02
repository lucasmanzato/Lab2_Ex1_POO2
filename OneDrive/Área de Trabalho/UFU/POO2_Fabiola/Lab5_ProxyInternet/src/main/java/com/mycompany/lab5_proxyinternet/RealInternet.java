/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5_proxyinternet;

//Classe real para conexão da internet

class RealInternet implements Internet {
    public void connect() {
        System.out.println("Conexão estabelecida com a internet.");
    }
}
