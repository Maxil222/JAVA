/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicional4;
import  java.util.Scanner;
/**
 *
 * @author PC 24
 */
public class Condicional4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int diasDelMes = 0;
        System.out.println("Introcuzca dia: ");
        int dia = sc.nextInt();
        System.out.println("Introduzca mes: ");
        int mes = sc.nextInt();
        System.out.println("Introduzca el Año: ");
        int año = sc.nextInt();
        
        if (mes == 2){
            diasDelMes = 28;
            
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            diasDelMes = 30;
        }
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            diasDelMes = 31;
        }
        
        dia++; //incrementamos el dia
        
        if (dia > diasDelMes){ //si dia supera el número de dias del mes
            dia = 1; // lo reiniciamos a 1
            mes++; //le incrementamos el mes
            if (mes > 12){ // si mes supera a 12
            mes = 1; // lo reiniciamos a 1
            año++; // incrementamos el año
            }
        }
        
        if (año == 0){
            año = 1;
        }
        System.out.println(dia + "/" + mes + "/" + año);
    }
    
}
