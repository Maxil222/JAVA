/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package par_impar;
import java.util.Scanner;
/**
 *
 * @author PC 24
 */
public class Par_Impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        System.out.println("Ingrese un numero :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        if (num % 2 == 0){
            System.out.println("El numero" + num + "Es Par");
        } else {
            System.out.println("El numero" + num + "Es impar");
        }
    }
    
}
