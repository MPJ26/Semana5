package Practica1;
import java.util.Scanner;
public class Ejercicio3 {
     public static void main (String[] args){
        //declarar variables 
        double sueldo1,sueldo2,sueldo3,sueldo4,sueldo5, total, promedio,menor;
        Scanner lectura= new Scanner (System.in);
       //entrada de datos
        System.out.print("Ingresa el primer sueldo: ");
        sueldo1=lectura.nextInt();
        System.out.print("Ingresa el segundo sueldo: ");
        sueldo2=lectura.nextInt();
        System.out.print("Ingresa el tercer sueldo: ");
        sueldo3=lectura.nextInt();        
        System.out.print("Ingresa el cuarto sueldo: ");
        sueldo4=lectura.nextInt();
        System.out.print("Ingresa el quinto sueldo: ");
        sueldo5=lectura.nextInt();
        //proceso de datos
        total=sueldo1+sueldo2+sueldo3+sueldo4+sueldo5;
        promedio=total/5;
        menor=sueldo1;
        if(sueldo2<menor){
            menor=sueldo2;
        }
        if (sueldo3<menor){
            menor=sueldo3;
        }
        if (sueldo4<menor){
            menor=sueldo4;
        }
        if (sueldo5<menor){
            menor=sueldo5;            
        }
        //salida de datos
        System.out.println("El total del sueldo es: "+ total);
        System.out.println("El promedio de los sueldos es: "+ promedio);
        System.out.println("El sueldo menor es: "+menor);
     }             
}
