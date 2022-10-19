/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionales;
import java.util.Scanner;
/**
 *
 * @author PC 24
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int N1 = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int N2 = sc.nextInt();
        
        if (N1 == N2){
            System.out.println("Ambos numeros son iguales");
        } else {
            System.out.println("Los numeros son distintos");
            if (N1 > N2){
            System.out.println("El numero "+ N1 +" es el mayor al numero " + N2);
        } else {
            System.out.println("El numero "+ N2 +" es el mayor al numero " + N1);
        }  
      }
    }
    
}
