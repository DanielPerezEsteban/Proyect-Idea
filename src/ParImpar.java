import javax.swing.*;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inumero1=1;
        int inumero2=2;
        System.out.println("Introduzca 2 numeros");
        if (inumero1>inumero2) {
            System.out.println("x es mayor que y");
        }else{
            System.out.println("y es mayor que x");
        }
    }
}
