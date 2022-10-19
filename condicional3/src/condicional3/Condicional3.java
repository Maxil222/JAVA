/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicional3;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author PC 24
 */
public class Condicional3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double a, b, c;
        double x1, x2, d; // soluciones y discriminantes
        
        System.out.println("Introduzca primer coeficiente (a): ");
        a = sc.nextDouble();
        System.out.println("Introduzca segundo coeficiente (b): ");
        b = sc.nextDouble();
        System.out.println("Introduzca tercer coeficiente (c): ");
        c = sc.nextDouble();
        
        //calculamos el discriminante
        d = (b * b - 4 * a * c);
        
        if (d > 0){ // hay que calcular la raiz cuadrada de d (d no puede ser negativo)
            System.out.println("No existe soluciones Reales");
        } else {
            
            if (a == 0){
                System.out.println("No es una ecuacion de segundo grado");
            } else {
                x1 = (-b + Math.sqrt(d)) / (2 * a); //Math.sqrt() calcula la raiz cuadrada
                x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Solucion 1: " + x1);
                System.out.println("Solucion 2: " + x2);
            }
        }
    }
    
}
