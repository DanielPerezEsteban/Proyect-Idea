import javax.swing.*;
public class Contraseña {
    public static void main(String[] args) {
        int cont;
        do {
            String text = JOptionPane.showInputDialog("Introduzca contraseña");
            String password = "DanielPerez";
            cont = 0;
            if (password=="DanielPerez"){
            System.out.println("Correcto");
                cont = 3;
            } else {
                if (password != "DanielPerez")
                    System.out.println("Incorrecto");
                cont++;
                if (cont == 3) {
                    System.out.println("Incorrecto");
                    System.out.println("Comuniquese con el administrador del sistema.");
                    System.out.println("Bloqueando el sistema...");
                }
            }
        } while (cont != 3);
    }
}
