
package Practica1;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio2 {
    //metodo de clase para acciones 
    public static void main(String[]args){
    //declarar variables
    double capital,tasa,tiempo,interescompuesto,valorfuturo;
    Scanner lectura= new Scanner(System.in);
    //entrada de datos
    System.out.println("Ingresa el capital inicial: ");
    capital=lectura.nextDouble();
    
    System.out.println("Ingresa la tasa de interes: ");
    tasa=lectura.nextDouble();  
    
    System.out.println("Ingresa el periodo (tiempo): ");
    tiempo=lectura.nextDouble(); 
    //proceso de datos
    tasa = tasa/100;
    valorfuturo=capital * Math.pow((1 + tasa), tiempo);
    interescompuesto=valorfuturo-capital;
    //salida de datos
    System.out.println("El valor futuro es: " + valorfuturo);
    System.out.println("El valor compuesto es: " + interescompuesto);
    
    }
}
