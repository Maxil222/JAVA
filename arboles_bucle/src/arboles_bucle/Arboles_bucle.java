/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arboles_bucle;
import java.util.Scanner;
/**
 *
 * @author PC 24
 */
public class Arboles_bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int etiquetaArbolMasAlto, AlturaArbolMasAlto;
        int etiqueta = 0;
        int altura;
        System.out.println("Altura del Arbol (" + etiqueta + "): ");
        altura = sc.nextInt();
        AlturaArbolMasAlto = altura;
        etiquetaArbolMasAlto = 0;
        while (altura != -1){
            if (altura > AlturaArbolMasAlto){
                AlturaArbolMasAlto = altura;
                etiquetaArbolMasAlto = etiqueta;
            }
            etiqueta++;
            
            System.out.println("Altura del Arbol (" + etiqueta + "): ");
            altura = sc.nextInt();
            
            
        }
        if (AlturaArbolMasAlto == -1){
            System.out.println("No hay ningun Arbol");
        } else {
            System.out.println("El Arbol mas alto mide: " + AlturaArbolMasAlto);
            System.out.println("Corresponde al arbol número: " + etiquetaArbolMasAlto);
        }
    }
    
}
