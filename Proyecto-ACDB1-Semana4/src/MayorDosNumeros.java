import java.util.Scanner;
public class MayorDosNumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num1, num2;
        System.out.print("Deme dos numero: ");
        num1 = tcl.nextInt();
        num2 = tcl.nextInt();
        if (num1 > num2){
            System.out.println("Daniel");
            System.out.println(num1+" es mayor a "+num2);
        }
        else{
            System.out.println("Estebas");
            System.out.println(num2+" es mayor a "+num1);
        }
    }
}
