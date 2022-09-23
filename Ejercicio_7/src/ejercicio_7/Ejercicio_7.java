/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_7;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author PC 24
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num;
        int redondeo;
        System.out.println("Escriba un numero dicimal (Con Punto): ");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        num = sc.nextDouble();
        redondeo = (int)(num + 0.5);
        System.out.println(num + " Redondeado es: " + redondeo);
              
    }
    
}
