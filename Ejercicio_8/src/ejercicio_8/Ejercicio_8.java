/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_8;
import java.util.Scanner;
/**
 *
 * @author PC 24
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidadM;
        int cantidadP;
        int vManzana1t;
        int vManzana2t;
        int vManzana3t;
        int vManzana4t;
        int vPeras1t;
        int vPeras2t;
        int vPeras3t;
        int vPeras4t;
        double total;
        double importeTotal;
        double totalM;
        double totalP;
        System.out.println("Cantidad de Kilos de Manzanas: ");
        Scanner sc = new Scanner(System.in);
        cantidadM = sc.nextInt();
        total=(cantidadM * 2.35); 
        System.out.println(cantidadM + " Kilos de Manzanas " + total + " Euros");
        System.out.println("Cantidad de Kilos de Peras: ");
        cantidadP = sc.nextInt();
        total = (cantidadP * 1.95);
        System.out.println(cantidadP + " Kilos de Peras " + total + " Euros");
        //Pedimos los Datos
        System.out.println("Para las manzanas: ");
        System.out.println("Ventas (en Kilos) del primer trimestre: ");
        vManzana1t = sc.nextInt();
        
        System.out.println("Ventas (en Kilos) del segundo trimestre: ");
        vManzana2t = sc.nextInt();
        
        System.out.print("Ventas (en Kilos) del tercero trimestre: ");
        vManzana3t = sc.nextInt();
        
        System.out.print("Ventas (en Kilos) del cuarto trimestre: ");
        vManzana4t = sc.nextInt();
        
        totalM = (vManzana1t + vManzana2t + vManzana3t + vManzana4t)*2.35;
        System.out.println(" en el año gastaste " + totalM + "Euros en peras");
        
        System.out.println("Para las Peras: ");
        System.out.print("Ventas (en Kilos) del primer trimestre: ");
        vPeras1t = sc.nextInt();
        System.out.print("Ventas (en Kilos) del segundo trimestre: ");
        vPeras2t = sc.nextInt();
        System.out.print("Ventas (en Kilos) del tercero trimestre: ");
        vPeras3t = sc.nextInt();
        System.out.print("Ventas (en Kilos) del cuarto trimestre: ");
        vPeras4t = sc.nextInt();
        
        totalP = (vPeras1t + vPeras2t + vPeras3t + vPeras4t)*1.95;
        System.out.println(" en el año gastaste " + totalP + "Euros en peras");
        
        total = totalM + totalP;
        System.out.println(" en el año gastaste " + total + "Euros en Frutas");
        
        
        importeTotal = totalM + totalP;
        System.out.println("El importe total es " + importeTotal + " Euros");
    }
    
}
