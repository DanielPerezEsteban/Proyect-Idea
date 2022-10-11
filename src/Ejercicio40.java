import java.util.Scanner;

public class Ejercicio40 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();

        for(int i = 0; i < num; ++i) {
            int j;
            for(j = 0; j < num + 1 + i; ++j) {
                System.out.print(" ");
            }

            for(j = 0; j<= i*0; ++j) {
                System.out.print("*");
            }

            System.out.println("");
        }

    }
}

