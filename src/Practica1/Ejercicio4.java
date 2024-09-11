package Practica1;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main (String[] args){
        //declarar variables
        int numero, idioma;
        String traducido = "";
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar un numero entre 1 al 6: ");
        numero = lectura.nextInt();
        System.out.print("Indica el idioma [1(Español), 2(Inglés), 3(Portugués), 4(Francés)]: ");
        idioma = lectura.nextInt();
       
        //procesar datos
        switch (idioma) {
            case 1: // Español
                switch (numero) {
                    case 1:
                        traducido = "uno";
                        break;
                    case 2:
                        traducido = "dos";
                        break;
                    case 3:
                        traducido = "tres";
                        break;
                    case 4:
                        traducido = "cuatro";
                        break;
                    case 5:
                        traducido = "cinco";
                        break;
                    case 6:
                        traducido = "seis";
                        break;
                    default:
                        traducido = "Número fuera de rango";
                }
                break;
            case 2: // Inglés
                switch (numero) {
                    case 1:
                        traducido = "one";
                        break;
                    case 2:
                        traducido = "two";
                        break;
                    case 3:
                        traducido = "three";
                        break;
                    case 4:
                        traducido = "four";
                        break;
                    case 5:
                        traducido = "five";
                        break;
                    case 6:
                        traducido = "six";
                        break;
                    default:
                        traducido = "Number out of range";
                }
                break;
            case 3: // Portugués
                switch (numero) {
                    case 1:
                        traducido = "um";
                        break;
                    case 2:
                        traducido = "dois";
                        break;
                    case 3:
                        traducido = "três";
                        break;
                    case 4:
                        traducido = "quatro";
                        break;
                    case 5:
                        traducido = "cinco";
                        break;
                    case 6:
                        traducido = "seis";
                        break;
                    default:
                        traducido = "Número fora do intervalo";
                }
                break;
            case 4: // Francés
                switch (numero) {
                    case 1:
                        traducido = "un";
                        break;
                    case 2:
                        traducido = "deux";
                        break;
                    case 3:
                        traducido = "trois";
                        break;
                    case 4:
                        traducido = "quatre";
                        break;
                    case 5:
                        traducido = "cinq";
                        break;
                    case 6:
                        traducido = "six";
                        break;
                    default:
                        traducido = "Nombre hors de portée";
                }
                break;
            default:
                traducido = "Idioma no soportado";
        }
        //salida de datos
        System.out.println("La traducción es: " + traducido);
   }
}
