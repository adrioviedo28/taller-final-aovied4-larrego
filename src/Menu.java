import java.util.Scanner;
public class Menu {
/*
    1 = IngreseOpcion.nextInt();
    2 = IngreseOpcion.nextInt();
    3 = IngreseOpcion.nextInt();
    4 = IngreseOpcion.nextInt();
    5 = IngreseOpcion.nextInt();
    6 = IngreseOpcion.nextInt();
    7 = IngreseOpcion.nextInt();
    8 = IngreseOpcion.nextInt();
    9 = IngreseOpcion.nextInt();
    10 = IngreseOpcion.nextInt();
    0 = IngreseOpcion.nextInt();
*/


    public static void main(String[] args) {
        Scanner ingreseOpcion = new Scanner(System.in);

        do {
            System.out.println("-----------------------------------------------------");
            System.out.println("      Bienvenido al menú de Aleja y Adri jeje        ");
            System.out.println("              LARREGO - AOVIED4                      ");
            System.out.println("-----------------------------------------------------");
            System.out.println("|      1. Datos Primitivos.                         |");
            System.out.println("|      2. String.                                   |");
            System.out.println("|      3. Constantes.                               |");
            System.out.println("|      4. Tipo de Operadores.                       |");
            System.out.println("|      5. Condicional IF, ELSE IF, ELSE.            |");
            System.out.println("|      6. Condicional Switch.                       |");
            System.out.println("|      7. Condicional Ternaria.                     |");
            System.out.println("|      8. Bucle DO WHILE.                           |");
            System.out.println("|      9. Bucle WHILE.                              |");
            System.out.println("|     10. Bucle FOR.                                |");
            System.out.println("|      0. Salir                                     |");
            System.out.println("-----------------------------------------------------");

            System.out.println("Selecciona una opción para explicarte uwu");
            int opciones = ingreseOpcion.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("              DATOS PRIMITIVOS                       ");
                    System.out.println("-----------------------------------------------------");
                    System.out.println("|      1. ¿Que es un Byte?                           |");
                    System.out.println("|      2. ¿Que es Short?                             |");
                    System.out.println("|      3. ¿Que es int?                               |");
                    System.out.println("|      4. ¿Que es long?                              |");
                    System.out.println("|      5. ¿Que es Float?                             |");
                    System.out.println("|      6. ¿Que es Double                             |");
                    System.out.println("|      7. ¿Que es Char?                              |");
                    System.out.println("|      8. ¿Que es Boolean?                           |");
                    System.out.println("|      0. Salir                                      |");
                    System.out.println("-----------------------------------------------------");

                    System.out.println("Selecciona una opcion");
                    Scanner OpcionPrimitivos = new Scanner(System.in);
                    int primitivos = OpcionPrimitivos.nextInt();

                    if (primitivos == 1) {
                        System.out.println("-----------------------------------------------------");
                        System.out.println("                 ¿Que es un Byte?                    ");
                        System.out.println("-----------------------------------------------------");
                        System.out.println("|      Explicacion                                   |");
                        System.out.println("|                                                    |");
                        System.out.println("|                                                    |");
                        System.out.println("|                                                    |");
                        System.out.println("|                                                    |");
                        System.out.println("|      Ejemplo:                                      |");
                        System.out.println("|      Cual es el rango?:                            |");
                        System.out.println("|      el rango es -128 a 127                        |");
                        System.out.println("-----------------------------------------------------");
                        System.out.println("Presiona Enter para continuar...");
                        break;


                    }

                case 2:
                    System.out.println("Imprime el menu String");
                    break;

                case 3:
                    System.out.println("Imprime el menu Constantes");
                    break;

                case 4:
                    System.out.println("Imprime el menu Tipo de operadores");
                    break;

                case 5:
                    System.out.println("Imprime el menu Condicional IF, ELSE IF, ELSE");
                    break;

                case 6:
                    System.out.println("Imprime el menu Condicional Switch");
                    break;

                case 7:
                    System.out.println("Imprime el menu Condicional ternaria");
                    break;

                case 8:
                    System.out.println("Imprime el menu Bucle DO WHILE");
                    break;

                case 9:
                    System.out.println("Imprime el menu Bucle WHILE");
                    break;

                case 10:
                    System.out.println("Imprime el menu Bucle FOR");
                    break;





            }
        }while (ingreseOpcion.nextInt()== 0);
        System.out.println("Saliendo del sistema...");

    }
}