import javax.swing.*;
import java.util.Scanner;

public class vdeasteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero:");
        int altura = sc.nextInt();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("");
            }
            for (int j = 0; j < altura; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (altura * 2 - (i + 1) * 2); j++) {
                System.out.print("");
            }
            for (int j = 0; j < altura; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
