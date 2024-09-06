
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
        int menu;
        int opciones;
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
                    Scanner scannerMenuPrimitivos = new Scanner(System.in);
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
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("                 ¿Que es un Byte?                             ");
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("| Es uno de los tipos de datos numéricos más básicos         |");
                        System.out.println("| y se utiliza para almacenar valores enteros pequeños.      |");
                        System.out.println("| Se utiliza generalmente cuando se necesita ahorrar memoria |");
                        System.out.println("| en aplicaciones que manejan grandes cantidades de datos    |");
                        System.out.println("| numéricos pequeños. Va del 0 al 127                        |");
                        System.out.println("| Sintaxis:                                                  |");
                        System.out.println("|   byte valorPositivo = 127; // Valor máximo positivo       |");
                        System.out.println("|   byte valorNegativo = -128; // Valor mínimo negativo      |");
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    } else if (primitivos == 2) {
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("                 ¿Que es un Short?                                ");
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("| Se utiliza para representar números enteros. Es uno de los     |");
                        System.out.println("| tipos de datos más compactos en términos de almacenamiento,    |");
                        System.out.println("| y se usa cuando se necesita una mayor eficiencia en la memoria |");
                        System.out.println("| para representar números enteros. Puede almacenar valores      |");
                        System.out.println("| enteros en el rango de -32,768 a 32,767.                       |");
                        System.out.println("| Sintaxis:                                                      |");
                        System.out.println("|   short numero = 15000; // Valor dentro del rango permitido    |");
                        System.out.println("|   short otroNumero = 40000; // Valor fuera del rango que       |");
                        System.out.println("|   generara error de compilacion                                |");
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    } else if (primitivos == 3) {
                        System.out.println("-------------------------------------------------------------");
                        System.out.println("                 ¿Que es un Int?                             ");
                        System.out.println("-------------------------------------------------------------");
                        System.out.println("| Es un tipo de dato primitivo que almacena números enteros |");
                        System.out.println("| y es el mas usado comunmente.                             |");
                        System.out.println("| Su rango es de: -2,147,483,648 a 2,147,483,647.           |");
                        System.out.println("| Sintaxis:                                                 |");
                        System.out.println("| int edad = 25;                                            |");
                        System.out.println("-------------------------------------------------------------");
                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (primitivos == 4) {
                        System.out.println("-------------------------------------------------------------");
                        System.out.println("                 ¿Que es un Long?                            ");
                        System.out.println("-------------------------------------------------------------");
                        System.out.println("| Es un tipo de dato primitivo que almacena números enteros |");
                        System.out.println("|  de mayor tamaño. Se usa para almacenar numeros enteros   |");
                        System.out.println("| grandes que exceden el rango de tipo INT                  |");
                        System.out.println("| Su rango de valores es de:                                |");
                        System.out.println("| -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.   |");
                        System.out.println("| Sintaxis:                                                 |");
                        System.out.println("| long distanciaALaLuna = 384400000L;                       |");
                        System.out.println("| // Especificar 'L' al final para denotar un valor long    |");
                        System.out.println("-------------------------------------------------------------");
                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (primitivos == 5) {
                        System.out.println("-------------------------------------------------------------------");
                        System.out.println("                 ¿Que es un Float?                                 ");
                        System.out.println("------------------------------------------------------------------ ");
                        System.out.println("| se utiliza para almacenar números decimales (en punto flotante) |");
                        System.out.println("| de precisión simple.                                            |");
                        System.out.println("| Es adecuado  para cálculos que no requieren alta precisión      |");
                        System.out.println("| decimal, como en gráficos y cálculos científicos.               |");
                        System.out.println("| Sintaxis:                                                       |");
                        System.out.println("| float temperatura = 36.6f;                                      |");
                        System.out.println("| float pi = 3.14159f;                                            |");
                        System.out.println("| // Especificar 'f' al final para denotar un valor float         |");
                        System.out.println("-------------------------------------------------------------------");
                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (primitivos == 6) {
                        System.out.println("-------------------------------------------------------------------");
                        System.out.println("                 ¿Que es un Double?                                ");
                        System.out.println("------------------------------------------------------------------ ");
                        System.out.println("| se utiliza para almacenar números decimales (en punto flotante) |");
                        System.out.println("| de precisión doble.                                             |");
                        System.out.println("| Es adecuado  para cálculos que requieren de mayor precisión     |");
                        System.out.println("| decimal, como en cálculos científicos, financieros, etc.        |");
                        System.out.println("| Sintaxis:                                                       |");
                        System.out.println("| double areaDeLaTierra = 510.1E6;                                |");
                        System.out.println("| double velocidadDeLuz = 299792458.0;                            |");
                        System.out.println("| // Especificar 'd' es opcional, ya que 'double'                 |");
                        System.out.println("| es el tipo por defecto                                          |");
                        System.out.println("-------------------------------------------------------------------");
                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (primitivos == 7) {
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("                 ¿Que es un Char?                                     ");
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("| Es un tipo de dato primitivo que almacena un solo carácter Unicode.|");
                        System.out.println("| Se suele usar para almacenar y manipular caracteres individuales,  |");
                        System.out.println("| como letras, números, o símbolos.                                  |");
                        System.out.println("| Sintaxis:                                                          |");
                        System.out.println("| char letra = 'A';                                                  |");
                        System.out.println("| char simbolo = '#';                                                |");
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (primitivos == 8) {
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("                 ¿Que es un Boolean?                                  ");
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("| Es un tipo de dato primitivo que almacena un valor booleano.       |");
                        System.out.println("| Puede tener solo dos valores: true o false.                        |");
                        System.out.println("| Se usa comunmente para representar estados lógicos o de control,   |");
                        System.out.println("| como en condicionales y bucles.                                    |");
                        System.out.println("| Sintaxis:                                                          |");
                        System.out.println("| boolean esMayorDeEdad = true;                                      |");
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (primitivos == 0){
                    System.out.println("Saliendo del sistema...");
                    System.out.println(" ");
                    }
                    break;
                case 2:
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("                 ¿Que es un String?                                            ");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("| Es una clase que representa una secuencia de caracteres(texto)              |");
                    System.out.println("| A diferencia de los tipos de datos primitivos como int o double             |");
                    System.out.println("| que almacenan valores numéricos, String se utiliza para trabajar con texto. |");
                    System.out.println("| Sintaxis:                                                                   |");
                    System.out.println("| // Declaración e inicialización de un String                                |");
                    System.out.println("| String saludo = Hola, mundo!; el Hola Mundo va dentro de comillas           |");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("Presiona Enter para continuar...");
                    scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                    scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
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
        }while (opciones != 0);
        System.out.println("Saliendo del sistema...");

    }
}

