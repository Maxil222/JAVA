/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg14asterisco;
import java.util.Scanner;
/**
 *
 * @author PC 24
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribir N: ");
        int n = sc.nextInt();
        
        for (int fila = 1; fila <= n; fila++){
            for (int col = fila; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println("");    
        }
            
        
        
    }
    
}
