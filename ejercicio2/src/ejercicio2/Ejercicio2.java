/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author PC 24
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        byte edad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba su edad: ");
        edad = sc.nextByte();
        edad++;
        System.out.println("El proximo año su edad sera: "+edad+" años");
    }
    
}
