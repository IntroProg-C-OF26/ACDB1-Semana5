/**
 * Ejercicio01: Dados dos numero enteros de entrada, procesarlos en una suma y 
 * presentar los resultados
 * @author Daniel Irene
 * @version 1.0
 */
import java.util.Scanner;
public class SumaDosNumeros {
    public static void main(String[] args) {
        //ENTRADA DE DATOS
        //[Clase-Api-JDK-para-ingreso-datos: Scanner -> java.util] 
        //[nombre-variable/obj-para-ingredo-datos: nombreVariable] 
        //[=] inicializar el objeto/variable
        //[Clase-Api-JDK-para-ingreso-datos: Scanner ] 
        //[Fuento-del-ingreso-datos: System.in => las entradas del sistema]
        Scanner teclado = new Scanner(System.in);
        int num1, num2, respuesta;
        System.out.println("Deme el PRIMERO numero: "); //Carpintaria => tunear
        num1 = teclado.nextInt();
        System.out.println("Deme el SEGUNDO numero: "); //Carpintaria => tunear
        num2 = teclado.nextInt();
        respuesta = num1 + num2;
        System.out.print("La respuesta de la suma de los numeros [" 
                                    + num1 + "] y [" + num2 + "] es: ");
        System.out.println(respuesta);
    }
}

/**
 * run:
Deme dos numeros: 
3
-7
La respuestas es: 
-4
BUILD SUCCESSFUL (total time: 3 seconds)
 */
