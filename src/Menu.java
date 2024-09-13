
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
        int opciones = -1;
        Scanner ingreseOpcion = new Scanner(System.in);
        Scanner scannerMenuPrincipal = new Scanner(System.in);

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
             opciones = ingreseOpcion.nextInt();

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
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
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
                    System.out.println("-----------------------------------------------------");
                    System.out.println("                       SWITCH                        ");
                    System.out.println("-----------------------------------------------------");
                    System.out.println("|      Elige la opcion que deseas ver               |");
                    System.out.println("|      1. Explicación de Switch                     |");
                    System.out.println("|      2.Programa de Switch -valide su calificación |");
                    System.out.println("-----------------------------------------------------");

                    System.out.println("Selecciona una opcion");
                    Scanner Sswitch = new Scanner(System.in);
                    int opcionSwitch = Sswitch.nextInt();

                    if (opcionSwitch == 1) {
                        System.out.println("-----------------------------------------------------");
                        System.out.println("                 Explicación de Switch               ");
                        System.out.println("-----------------------------------------------------");
                        System.out.println("| Es una estructura de control que te permite       |");
                        System.out.println("| ejecutar diferentes bloques de código basados     |");
                        System.out.println("| en el valor de una expresión. Es útil cuando      |");
                        System.out.println("| tienes varias opciones posibles para una variable |");
                        System.out.println("|y quieres decidir qué hacer en función de ese valor|");
                        System.out.println("|      Ejemplo:                                     |");
                        System.out.println("|      int dia = 3;                                 |");
                        System.out.println("|       switch (dia) {                              |");
                        System.out.println("|          case 1:                                  |");
                        System.out.println("|            System.out.println(\"Lunes\");           |");
                        System.out.println("|            break;                                 |");
                        System.out.println("|          case 2:                                  |");
                        System.out.println("|            System.out.println(\"Martes\");          |");
                        System.out.println("|            break;                                 |");
                        System.out.println("|          case 3:                                  |");
                        System.out.println("|            System.out.println(\"Miércoles\");       |");
                        System.out.println("|            break;                                 |");
                        System.out.println("|          case 4:                                  |");
                        System.out.println("|            System.out.println(\"Jueves\");          |");
                        System.out.println("|            break;                                 |");
                        System.out.println("|          case 5:                                  |");
                        System.out.println("|            System.out.println(\"Viernes\");         |");
                        System.out.println("|            break;                                 |");
                        System.out.println("|          case 6:                                  |");
                        System.out.println("|            System.out.println( \"Sábado\");          |");
                        System.out.println("|            break;                                 |");
                        System.out.println("|          case 7:                                  |");
                        System.out.println("|            System.out.println(\"Domingo\");         |");
                        System.out.println("|            break;                                 |");
                        System.out.println("|          default:                                 |");
                        System.out.println("|            System.out.println(\"Día inválido\");    |");
                        System.out.println("|            break;                                 |");
                        System.out.println("|          }                                        |");
                        System.out.println("-----------------------------------------------------");
                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter

                        break;
                    } else if (opcionSwitch == 2) {
                        Scanner IngreseCalificacion = new Scanner(System.in);
                        System.out.println("Digite su Calificacion");
                        int calificacion = IngreseCalificacion.nextInt();

                        switch (calificacion){
                            case 1, 2:{
                                System.out.println("Su calificación es: F");
                                break;
                            }
                            case 3, 4:{
                                System.out.println("Su calificación es: D");
                                break;
                            }
                            case 6, 5:{
                                System.out.println("Su calificación es: C");
                                break;
                            }
                            case 8, 7:{
                                System.out.println("Su calificación es: B");
                                break;
                            }
                            case 10, 9:{
                                System.out.println("Su calificación es: A");
                                break;
                            }
                            default:{
                                System.out.println("Número no válido, por favor verifique");
                            }
                        }

                    }
                    System.out.println("Presiona Enter para continuar...");
                    scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                    scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                    break;

                case 7:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("                       TERNARIA                        ");
                    System.out.println("-----------------------------------------------------");
                    System.out.println("|     Elige la opcion que deseas ver                |");
                    System.out.println("|     1. Explicación de Ternaria                    |");
                    System.out.println("|     2.Programa de Ternaria -Determina si un número|");
                    System.out.println("|     es Par o Impar -Digite una opción             |");
                    System.out.println("-----------------------------------------------------");

                    System.out.println("Selecciona una opcion");
                    Scanner Tternaria = new Scanner(System.in);
                    int opcionTernaria = Tternaria.nextInt();

                    if (opcionTernaria == 1) {
                        System.out.println("----------------------------------------------------------------------------------");
                        System.out.println("                             Explicación de Ternaria                              ");
                        System.out.println("----------------------------------------------------------------------------------");
                        System.out.println("| la condicional ternaria en Java es una forma compacta de escribir              |");
                        System.out.println("| una instrucción if-else. Te permite decidir entre dos valores basados          |");
                        System.out.println("| en una condición, todo en una sola línea.                                      |");
                        System.out.println("|                                                                                |");
                        System.out.println("| La sintaxis básica es:                                                         |");
                        System.out.println("| resultado = (condición) ? valor_si_verdadero : valor_si_falso;                 |");
                        System.out.println("|                                                                                |");
                        System.out.println("| condición:                                                                     |");
                        System.out.println("| Es una expresión que se evalúa como true o false.                              |");
                        System.out.println("|                                                                                |");
                        System.out.println("| valor_si_verdadero:                                                            |");
                        System.out.println("| Es el valor que se asigna a la variable resultado si la condición es true.     |");
                        System.out.println("|                                                                                |");
                        System.out.println("| valor_si_falso:                                                                |");
                        System.out.println("| Es el valor que se asigna a la variable resultado si la condición es false.    |");
                        System.out.println("|                                                                                |");
                        System.out.println("|  Ejemplo:                                                                      |");
                        System.out.println("| verificar si un número entero es par o impar y mostrar un mensaje              |");
                        System.out.println("| en función de eso                                                              |");
                        System.out.println("| public class ParImpar {                                                        |");
                        System.out.println("| public static void main(String[] args) {                                       |");
                        System.out.println("| int numero = 7; // Puedes cambiar este número para probar con diferentes       |");
                        System.out.println("| valores                                                                        |");
                        System.out.println("| // Usando condicional ternaria para determinar si el número es par o impar     |");
                        System.out.println("| String resultado = (numero % 2 == 0) ? \"El número es par\" : \"El número es impar\";|");
                        System.out.println("| // Mostrar el resultado                                                        |");
                        System.out.println("| System.out.println(resultado);                                                 |");
                        System.out.println("|     }                                                                          |");
                        System.out.println("|                                                                                |");
                        System.out.println("|  numero % 2 == 0 :Esta es la condición que verificamos. El operador % calcula  |");
                        System.out.println("|  el residuo de la división del numero entre 2. Si el residuo es 0, entonces    |");
                        System.out.println("|  el número es par.                                                             |");
                        System.out.println("|                                                                                |");
                        System.out.println("| \"El número es par\": Este es el valor asignado a resultado si la condición es |");
                        System.out.println("| verdadera (es decir, si el número es par).                                     |");
                        System.out.println("|                                                                                |");
                        System.out.println("| \"El número es impar\": Este es el valor asignado a resultado si la condición  |");
                        System.out.println("|  es falsa (es decir, si el número es impar).                                   |");
                        System.out.println("|                                                                                |");
                        System.out.println("| En el ejemplo, el número 7 es impar, por lo que el resultado será              |");
                        System.out.println("| \"El número es impar\".                                                        |");
                        System.out.println("----------------------------------------------------------------------------------");
                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (opcionTernaria == 2) {
                        Scanner numeroIngresado = new Scanner(System.in);
                        System.out.println("Digite un número Entero");
                        int numero = numeroIngresado.nextInt();

                        String resultado = (numero % 2 == 0) ? "El número es par" : "El número es impar";
                        // Mostrar el resultado
                        System.out.println(resultado);
                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    }

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


        }while (opciones != 0);
        System.out.println("Saliendo del sistema...");

    }
}





