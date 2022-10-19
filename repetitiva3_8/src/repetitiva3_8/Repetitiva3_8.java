/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva3_8;
import java.util.Scanner;
/**
 *
 * @author PC 24
 */
public class Repetitiva3_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        long factorial;
        int num;
        System.out.println("Introducir un numero: ");
        num = sc.nextInt();
        factorial = 1; //es importante inicializarlo en 1, ya que multiplicará
        
        for (int i = num; i > 0; i--){
            factorial = factorial * 1;
        }
        
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
    
}
