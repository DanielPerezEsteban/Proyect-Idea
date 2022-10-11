import java.util.Scanner;
public class EjerDIV {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        System.out.println("Dame el primer numero");
        int numero1 = reader.nextInt();
        System.out.println("Dame el segundo numero");
        int numero2 = reader.nextInt();
        System.out.println("Dame el tercer numero");
        int numero3 = reader.nextInt();
        int resultado= numero1+numero2+numero3;
        System.out.println("La suma es " + numero1 + " + " + numero2 + " + " + numero3 + " = " + resultado);


    }
}
