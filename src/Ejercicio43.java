import java.util.Scanner;

public class Ejercicio43 {
    public Ejercicio43() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        System.out.println("Introduzca el numero:");
        int num = 2;
        int contador = 0;
        int x=1;

        for(x = 1; contador < 5; ++num) {
            boolean primo = true;
            System.out.println("el numero es correcto");

            for(int i = 2; i < num; ++i) {
                if (num % i == 0) {
                    primo = false;
                    System.out.println("el numero es falso");
                }
            }

            if (primo) {
                x *= num;
                ++contador;
            }
        }

        System.out.println("El acumulador vale: ");
    }
}

