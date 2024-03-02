/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5_proxyinternet;

// Cliente
public class Lab5_ProxyInternet {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connect();
    }
}
