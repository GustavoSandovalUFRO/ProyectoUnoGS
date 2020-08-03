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
public class Main {
    
    public static void main(String[] args) {
        ArrayList<Gasto> lista= new ArrayList<Gasto>();
 
lista.add(new Gasto("Luz",12000));
lista.add(new Gasto("Agua",7000));
lista.add(new Gasto("Internet",30000));
lista.add(new Gasto("Gas",20000));
 
double resultado=lista.stream().mapToDouble(gasto->gasto.getValor()*1.19)
.filter(gasto->gasto<20000)
.sum();

System.out.println(resultado);

    }
}



