/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectounogs;

/**
 *
 * @author Gustavo
 */
public class Gasto {
     public String nombreGasto;
     public int valor;
     public boolean pagado;

    public Gasto(String nombreGasto, int valor, boolean pagado) {
        this.nombreGasto = nombreGasto;
        this.valor = valor;
        this.pagado = pagado;
    }
    public int getValor() {
        return valor;
    }
    
}


