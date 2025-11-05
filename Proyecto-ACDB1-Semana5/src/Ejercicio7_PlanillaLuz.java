import java.util.Scanner;
public class Ejercicio7_PlanillaLuz {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoKw, cantidadKw, costoPlan, descuento;
        int edadUser;
        System.out.print("Deme el Costo Kw, Cantidad Kw y edad del usuario: ");
        costoKw = tcl.nextDouble();
        cantidadKw = tcl.nextDouble();
        edadUser = tcl.nextInt();
        costoPlan = (costoKw * cantidadKw);
        //FORMATO/SINTAXIS DEL OPERADOR IF TERNARIO
        //variable_a_Asignar = (condicion) ? sentenciaPorSI : sentenciaPorNO;
        descuento = (edadUser > 65 ) ? (costoPlan * 0.1)  : 0 ;
        costoPlan -= descuento;
        System.out.println("Su planilla es: $"+costoPlan+" con descuento: $"+descuento);
    }
}
