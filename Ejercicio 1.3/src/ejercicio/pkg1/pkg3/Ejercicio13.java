/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1.pkg3;

import java.util.Scanner;

/**
 *
 * @author PC 24
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aActual;
        int aNacimiento;
        int edad;
        System.out.println("Año de nacimiento: ");
        Scanner sc = new Scanner(System.in);
        aNacimiento = sc.nextInt();
        System.out.println("Año actual: ");
        aActual = sc.nextInt();
        edad = aActual-aNacimiento;
        System.out.println("Su edad es: " + edad + " años.");
        
        
    }
    
}
