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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese radio");
        int radio = entrada.nextInt();
        System.out.println("Longitud de la circunferencia: "+2*3.1416*radio);
        System.out.println("Area de la circunferencia: "+(3.1416*(radio*radio)));
    }
    
}
