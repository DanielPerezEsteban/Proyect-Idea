import javax.swing.*;
public class NOTAS {
    public static void main(String[] args) {
        String nota = JOptionPane.showInputDialog("Escribe tu nota");
        int n = Integer.parseInt(nota);
        if (n <= 3) {
            System.out.println("Muy deficiente");
        } else if (n > 3 && n < 5) {
            System.out.println("Suspenso");
        }
        else if (n>5 && n<7){
            System.out.println("Aprobado");
        }
        else if (n>7 && n<9){
            System.out.println("Notable");
        }
        else if (n>9 && n<10){
            System.out.println("Sobresaliente");
        }
        else if (n>=10){
            System.out.println("Matricula");
        }
    }
}
