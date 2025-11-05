
import java.util.Scanner;

public class OperacionesAlgebraicas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double num1, respt;
        int num2;
        System.out.print("Deme el numero para la raiz cuadrada: ");
        num1 = tcl.nextDouble(); //INGRESO DE DATOS DE ENTRADA
        respt = Math.sqrt(num1);
        System.out.println("La raiz cuadrada de "+num1+" es: "+respt);
        System.out.print("Deme un numero para calcular su potencia: ");
        num2 = tcl.nextInt();
        respt = Math.pow(num1, num2);
        //1ra.OPCION DE PRESENTACION DE RESULTADOS
        System.out.println(num1+" elevado a "+num2+" es: "+respt);
        //2da.OPCION DE PRESENTACION DE RESULTADOS
        System.out.print(num1+" elevado a "+num2+" es: ");
        System.out.println(respt);
        //3ra.OPCION DE PRESENCION DE RESULTADOS
        //System.out.printf("FORMATO-DE-SALIDA-DATOS", [dato1], {dato2}, ...{datoN});
        //FORMATOS: 
        //%s para texto
        //%f para datos numericos reales
        //%d para datos numericos enteros
        System.out.printf("%.2f %s %d %s %.2f \n" , 
                                                    num1, 
                                                    "elevado a", 
                                                    num2, 
                                                    "es:", 
                                                    respt);
    }
}
