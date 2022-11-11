/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java_learning_final;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese grados centigrados");
        int c = entrada.nextInt();
        int grados;
        grados=32+(9*c/5);
        System.out.println("CONVERTIDOR DE GRADOS CENTIGRADOS A FARENHEIT");
        System.out.println("Grados Centigrados: "+c);
        System.out.println("Grados Farenheit:   "+grados);
    }
    
}
