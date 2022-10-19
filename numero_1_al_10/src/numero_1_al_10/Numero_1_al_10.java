/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero_1_al_10;
import java.util.Scanner;
/**
 *
 * @author PC 24
 */
public class Numero_1_al_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un número del 1 al 10: ");
        num = sc.nextInt();
        }while (!(1 <= num && num <=10));
        System.out.println("Tabla del " + num);
        for (int i = 1;i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
        
        
    
            
        
        