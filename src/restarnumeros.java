import java.util.Scanner;
public class restarnumeros {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int numero1 = reader.nextInt();

        System.out.println("Introduce el segundo número:");
        int numero2 = reader.nextInt();
        int resultado = numero1 - numero2;
        System.out.println("La resta es " + numero1 + " - " + numero2 + " = " + resultado);
    }
}
