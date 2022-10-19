/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicional2;
import java.util.Scanner;
/**
 *
 * @author PC 24
 */
public class Condicional2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N1, N2;
        int mayor, menor;
        
        System.out.println("Introdusca un numero: ");
        N1 = sc.nextInt();
        System.out.println("Introduzca otro numero: ");
        N2 = sc.nextInt();
        
        mayor = N1 > N2 ? N1 : N2; //si N1 es mayor que N2, entonces mayor = N1, si no = N2
        menor = N1 < N2 ? N1 : N2; //si N1 es menor que N2, entonces menor = N1, si no = N2
        
        System.out.println(mayor + " es mayor y " + menor + " es menor");
    }
    
}
