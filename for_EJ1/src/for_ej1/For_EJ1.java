/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package for_ej1;
import java.util.Scanner;
/**
 *
 * @author PC 24
 */
public class For_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean esPar, esPositivo;
        System.out.println("ingrese un numero: ");
        int num = sc.nextInt();
        
        while (num != 0){
            esPar = num % 2 == 0 ? true : false;
            esPositivo = num >= 0 ? true : false;
            System.out.println("Es par: " + esPar + " Es positivo: " + esPositivo);
            System.out.println("Cuadro: " + num * num);
            System.out.println("Introduzca otro numero: ");
            
            num = sc.nextInt();
        }
        
      
        
    }
    
}
