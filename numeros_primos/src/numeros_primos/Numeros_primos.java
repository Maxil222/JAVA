/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros_primos;
import java.util.Scanner;
/**
 *
 * @author PC 24
 */
public class Numeros_primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int j, contadorPrimos = 0;
        boolean primo;
        System.out.println("Escribe un Número primo: ");
        int  n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            primo = true;
            j = 2;
            
            while (j <= i - 1 && primo == true){
              if (i % j == 0){
              primo = false;
              }
            j++;
            }
            if (primo){
            contadorPrimos++;
            System.out.println(i + (" es primo"));
            }
        
        
        }
        System.out.println("de 1 a " + n + ", hay " + contadorPrimos + " números primos");
        
    }
    
}
