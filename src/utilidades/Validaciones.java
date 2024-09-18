package utilidades;

import java.util.Scanner;

public class Validaciones {




    //metodo
    public static void opcionvalida(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Ingresa un numero valido");
            scanner.next();
            System.out.println("Digite una opcion");
        }
    }

}