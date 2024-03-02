/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5_proxyinternet;

// proxy para verificar o acesso e o cliente(main) não conversar diretamente com a classe real
class ProxyInternet implements Internet {
    private RealInternet realInternet;

    public ProxyInternet() {
        this.realInternet = new RealInternet();
    }
    
    public void connect() {
        System.out.println("Verificando acesso...");
        realInternet.connect();
    }
}

