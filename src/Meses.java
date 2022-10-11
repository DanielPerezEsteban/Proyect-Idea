import java.util.Scanner;

public class Meses {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String mes;
        String anio;
        Integer n;
        Integer a = null;
        System.out.println("escribe un mes");
        mes =sc.nextLine();
        n =Integer.parseInt(mes);

        switch (n) {


            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;

            case 2:
                System.out.println("28");

                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;

            default:
                System.out.println("?");
        }
        System.out.println("escribe un año");
        if (a%4==0) {
            System.out.println("el año es bisiesto");
        }else if (a%4!=0) {
            System.out.println("el año no es bisiesto");}

    }
}


