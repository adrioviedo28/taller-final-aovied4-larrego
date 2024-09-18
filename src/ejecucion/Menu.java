package ejecucion;

import java.util.Random;
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

                    } else if (primitivos == 0) {
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
                    System.out.println("---------------------------------------------------------------------------------");
                    System.out.println("                 ¿Que es una Constante?                                          ");
                    System.out.println("---------------------------------------------------------------------------------");
                    System.out.println("| Son valores que no cambian durante la ejecución del programa. Se definen      |");
                    System.out.println("| usando la palabra clave final, lo que significa que una vez que se les asigna |");
                    System.out.println("| un valor, no se puede modificar.                                              |");
                    System.out.println("| Sintaxis:                                                                     |");
                    System.out.println("| public static final int MAX_USUARIOS = 100;                                   |");
                    System.out.println("| Se suelen escribir en Mayusculas y se separan las palaras con un guion bajo _ |");
                    System.out.println("---------------------------------------------------------------------------------");
                    System.out.println("Presiona Enter para continuar...");
                    scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                    scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                    break;

                case 4:
                    System.out.println("-----------------------------------------------------------------------------------");
                    System.out.println("               ¿Que son los Operadores y cuales son sus tipos?                     ");
                    System.out.println("-----------------------------------------------------------------------------------");
                    System.out.println("| los operadores son símbolos que realizan operaciones sobre valores y variables. |");
                    System.out.println("| los tipos de operadores mas comunes son:                                        |");
                    System.out.println("| 1. Operadores Aritmeticos                                                       |");
                    System.out.println("| 2. Operadores Relacionales                                                      |");
                    System.out.println("| 3. Operadores Logicos                                                           |");
                    System.out.println("| 4. Operadores Unarios                                                           |");
                    System.out.println("| 5. Operadores De Asignacion                                                     |");
                    System.out.println("| 6. Operadores Ternarios                                                         |");
                    System.out.println("-----------------------------------------------------------------------------------");
                    System.out.println("Selecciona una opcion para obtener una descripcion detallada:)");

                    Scanner OpcionOperadores = new Scanner(System.in);
                    int tipoOperadores = OpcionOperadores.nextInt();

                    if (tipoOperadores == 1) {
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("                 ¿Que son los Oeradores Aritmeticos?                            ");
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("| Estos operadores se usan para realizar cálculos matemáticos.                   |");
                        System.out.println("| Suma (+): int a = 5 + 3; // a es 8                                             |");
                        System.out.println("| Resta (-): int b = 10 - 4; // b es 6                                           |");
                        System.out.println("| Multiplicacion (*): int c = 7 * 2; // c es 14                                  |");
                        System.out.println("| Division (/): int d = 20 / 4; // d es 5                                        |");
                        System.out.println("| Modulo int e = 10 % 3; // e es 1                                               |");
                        System.out.println("| el modulo devuelve el residuo de la division                                   |");
                        System.out.println("----------------------------------------------------------------------------------");
                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (tipoOperadores == 2) {
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("                      ¿Que son los Operadores Relacionales?                          ");
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("| Estos operadores comparan dos valores y devuelven un valor booleano (true o false)|");
                        System.out.println("| Igual a (==): boolean resultado = (5 == 5); // resultado es true                  |");
                        System.out.println("| Diferente de (!=): boolean resultado = (5 != 3); // resultado es true             |");
                        System.out.println("| Mayor que (>): boolean resultado = (7 > 4); // resultado es true                  |");
                        System.out.println("| Menor que (<): boolean resultado = (3 < 6); // resultado es true                  |");
                        System.out.println("| Mayor o igual que (>=): boolean resultado = (5 >= 5); // resultado es true        |");
                        System.out.println("| Menor o igual que (<=): boolean resultado = (4 <= 7); // resultado es true        |");
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (tipoOperadores == 3) {
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("                      ¿Que son los Operadores Logicos?                               ");
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("| Estos operadores se usan para combinar condiciones booleanas.                     |");
                        System.out.println("| Y logico (&&): Devuelve true si ambas condiciones son verdaderas.                 |");
                        System.out.println("| » boolean resultado = (5 > 3 && 8 > 6); // resultado es true                      |");
                        System.out.println("| O logico (||): Devuelve true si al menos una de las condiciones es verdadera      |");
                        System.out.println("| » boolean resultado = (5 > 3 || 8 < 6); // resultado es true                      |");
                        System.out.println("| No logico (!): Devuelve el valor opuesto de la condicion                          |");
                        System.out.println("| » boolean resultado = !(5 > 3); // resultado es false                             |");
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (tipoOperadores == 4) {
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("                      ¿Que son los Operadores Unarios?                               ");
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("| Estos operadores actúan sobre un solo valor.                                      |");
                        System.out.println("| Incremento (++): Aumenta el valor de uno en uno                                   |");
                        System.out.println("| » int a = 5; a++; // a es 6                                                       |");
                        System.out.println("| Decremento(--): Disminuye el valor de uno en uno                                  |");
                        System.out.println("| » int b = 5; b--; // b es 4                                                       |");
                        System.out.println("| Negacion (-): Cambia el signo de un valor                                         |");
                        System.out.println("| » int c = 5; int d = -c; // d es -5                                               |");
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (tipoOperadores == 5) {
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("                      ¿Que son los Operadores de Asignacion?                          ");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("| Estos operadores asignan valores a variables.                                      |");
                        System.out.println("| Asignacion Simple (=): Asigna valor a una variable                                 |");
                        System.out.println("| » int x = 10; // x es 10                                                           |");
                        System.out.println("| Asignacion suma (+=): Suma y asigna el resultado                                   |");
                        System.out.println("| » int y = 5; y += 3; // y es 8                                                     |");
                        System.out.println("| Asignacion Resta (-=): Resta y asigna el resultado                                 |");
                        System.out.println("| » int z = 10; z -= 4; // z es 6                                                    |");
                        System.out.println("| y asi con todas las operaciones matematicas basicas                                |");
                        System.out.println("---------------------------------- ---------------------------------------------------");
                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (tipoOperadores == 6) {
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("                      ¿Que son los Operadores de Ternarios?                           ");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("| Es una forma compacta de realizar una operación condicional.                       |");
                        System.out.println("| Operador Ternario (?): Elige una opcion basado en una condicion                    |");
                        System.out.println("| » int edad = 18;                                                                   |");
                        System.out.println("| String resultado = (edad >= 18) ? Adulto : Menor                                   |");
                        System.out.println("| // resultado es Adulto                                                             |");
                        System.out.println("---------------------------------- ---------------------------------------------------");
                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    }

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

                        switch (calificacion) {
                            case 1, 2: {
                                System.out.println("Su calificación es: F");
                                break;
                            }
                            case 3, 4: {
                                System.out.println("Su calificación es: D");
                                break;
                            }
                            case 6, 5: {
                                System.out.println("Su calificación es: C");
                                break;
                            }
                            case 8, 7: {
                                System.out.println("Su calificación es: B");
                                break;
                            }
                            case 10, 9: {
                                System.out.println("Su calificación es: A");
                                break;
                            }
                            default: {
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
                    System.out.println("                       TERNARIA                      ");
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
                    System.out.println("-----------------------------------------------------");
                    System.out.println("                     Bucle DO WHILE                  ");
                    System.out.println("-----------------------------------------------------");
                    System.out.println("|     Elige la opcion que deseas ver                |");
                    System.out.println("|     1.Explicación DO WHILE                        |");
                    System.out.println("|     2.Programa de Do WHILE -Adivina el numero     |");
                    System.out.println("|                Digite una opción                  |");
                    System.out.println("-----------------------------------------------------");

                    System.out.println("Selecciona una opcion");
                    Scanner DoWhile = new Scanner(System.in);
                    int opcionDoWhile = DoWhile.nextInt();

                    if (opcionDoWhile == 1) {
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                             Explicación DO WHILE                            ");
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("| Un bucle do-while es una estructura de control que te permite             |");
                        System.out.println("| repetir un bloque de código varias veces.La principal diferencia          |");
                        System.out.println("| con otros bucles,como el while, es que el bloque de código dentro         |");
                        System.out.println("| del do-while siempre se ejecutará al menos una vez incluso si la condición|");
                        System.out.println("| que controla el bucle es falsa desde el principio.                        |");
                        System.out.println("|                                                                           |");
                        System.out.println("|                                                                           |");
                        System.out.println("| estructura básica del bucle do-while:                                     |");
                        System.out.println("| do {                                                                      |");
                        System.out.println("|   // Código que se ejecuta en cada iteración                              |");
                        System.out.println("| } while (condición);                                                      |");
                        System.out.println("|                                                                           |");
                        System.out.println("| do: Esta palabra clave inicia el bucle.                                   |");
                        System.out.println("|  El bloque de código dentro de las llaves {} se ejecutará al menos una vez|");
                        System.out.println("|                                                                           |");
                        System.out.println("| Código dentro del do: Aquí pones las instrucciones que quieres repetir.   |");
                        System.out.println("|                                                                           |");
                        System.out.println("| while (condición);Después de ejecutar el bloque de código, se evalúa      |");
                        System.out.println("| la condición.Si la condición es verdadera (true),el bucle se repite       |");
                        System.out.println("| Si es falsa (false), el bucle termina.                                    |");
                        System.out.println("|                                                                           |");
                        System.out.println("| Ejemplo:                                                                  |");
                        System.out.println("| int contador = 0;                                                         |");
                        System.out.println("|                                                                           |");
                        System.out.println("| do {                                                                      |");
                        System.out.println("|     System.out.println(\"El contador es: \" + contador);                  |");
                        System.out.println("|     contador++;                                                           |");
                        System.out.println("|     }                                                                     |");
                        System.out.println("|  } while (contador < 5);                                                  |");
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
                    } else if (opcionDoWhile == 2) {
                        Scanner numeroIngresado = new Scanner(System.in);
                        System.out.println("Digite un número Entero");


                        Scanner scanner = new Scanner(System.in);
                        Random random = new Random();

                        // Generar un número aleatorio entre 1 y 10
                        int numeroSecreto = random.nextInt(10) + 1;
                        int numeroUsuario;
                        boolean adivinado = false;

                        // Bucle do-while para permitir que el usuario ingrse un numero e intente adivinar
                        // hasta encontrar el correcto
                        do {
                            // Solicitar al usuario que ingrese un número
                            System.out.print("Adivina el número (del 1 al 10): ");
                            numeroUsuario = scanner.nextInt();

                            // Verificar si el número ingresado es correcto
                            if (numeroUsuario < numeroSecreto) {
                                System.out.println("Demasiado bajo. Inténtalo de nuevo.");
                            } else if (numeroUsuario > numeroSecreto) {
                                System.out.println("Demasiado alto. Inténtalo de nuevo.");
                            } else {
                                System.out.println("¡Felicidades! Has adivinado el número.");
                                adivinado = true; // Salir del bucle
                            }
                        } while (!adivinado); // Continuar hasta que el número sea adivinado

                        //Se cierra el Scanner después de que se termina el bucle
                        scanner.close();

                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    }


                case 9:
                    System.out.println("Imprime el menu Bucle WHILE");
                    break;

                case 10:
                    System.out.println("Imprime el menu Bucle FOR");
                    break;


            }

        }while (opciones != 0) ;
        System.out.println("Saliendo del sistema...");
    }

}




