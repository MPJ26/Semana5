package Practica1;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main (String[] args){
        double venta1,venta2,venta3,venta4,venta5,venta6,total,promedio;
        Scanner lectura= new Scanner(System.in);
        //entrada de datos    
        System.out.print("Ingrese el monto de la primera venta: ");
        venta1=lectura.nextDouble();
       
        System.out.print("Ingrese el monto de la segunda venta: ");
        venta2=lectura.nextDouble();
        
        System.out.print("Ingrese el monto de la tercera venta: ");
        venta3=lectura.nextDouble();
        
        System.out.print("Ingrese el monto de la cuarta venta: ");
        venta4=lectura.nextDouble();
       
        System.out.print("Ingrese el monto de la quinta venta: ");
        venta5=lectura.nextDouble();
        
        System.out.print("Ingrese el monto de la sexta venta: ");
        venta6=lectura.nextDouble();
        // proceso de datos    
        total=venta1+venta2+venta3+venta4+venta5+venta6;
        promedio=total/6;
        // salida de datos    
        System.out.println("El total de ventas del primer semestre es: " +total);
        System.out.println("El promedio de las ventas del primer semestre es: " +promedio);
    }
}
