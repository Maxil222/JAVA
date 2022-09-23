/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1.pkg4;
import java.util.Scanner;

/**
 *
 * @author PC 24
 */
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota1, nota2;     
        double media;
        System.out.println("Nota 1: ");
        Scanner sc = new Scanner(System.in);
        nota1 = sc.nextInt();
        System.out.println("Nota 2: ");
        nota2 = sc.nextInt();
        
        media = (nota1+nota2) / 2.0;
        
        System.out.println("La media es: " + media);
    }
    
}
