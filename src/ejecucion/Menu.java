package ejecucion;

import explicaciones.Detalle;
import menus.MenuPrincipal;
import menus.SubMenus;

//import utilidades.Validaciones;

import programas.Ejemplos;




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
        //int menu;
        int opciones;
        Scanner scannerMenuPrincipal = new Scanner(System.in);
        //Scanner scannerMenuPrimitivos = new Scanner(System.in);
        Scanner opcionPrimitivos = new Scanner(System.in);
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
            MenuPrincipal.menuPrincipal();
            opciones = ingreseOpcion.nextInt();

            switch (opciones) {
                case 1:
                    SubMenus.datosPrimitivos();
                    int primitivos = opcionPrimitivos.nextInt();

                    if (primitivos == 1) {
                        Detalle.byteexplicacion();
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    } else if (primitivos == 2) {
                       Detalle.shortExplicacion();
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    } else if (primitivos == 3) {
                       Detalle.intExplicacion();
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (primitivos == 4) {
                       Detalle.longExplicacion();
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (primitivos == 5) {
                        Detalle.floatExplicacion();
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (primitivos == 6) {
                        Detalle.doubleExplicacion();
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (primitivos == 7) {
                        Detalle.charExplicacion();
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (primitivos == 8) {
                       Detalle.booleanExplicacion();
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (primitivos == 0) {
                        System.out.println("Saliendo del sistema...");
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    SubMenus.stringSubMenu();
                    scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                    scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                    break;

                case 3:
                    SubMenus.constanteSubMenu();
                    scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                    scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                    break;

                case 4:
                    SubMenus.operadoresSubMenu();
                    Scanner OpcionOperadores = new Scanner(System.in);
                    int tipoOperadores = OpcionOperadores.nextInt();

                    if (tipoOperadores == 1) {
                        Detalle.operadoresAritmeticos();
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (tipoOperadores == 2) {
                        Detalle.operadoresRelacionales();
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (tipoOperadores == 3) {
                       Detalle.operadoresLogicos();
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (tipoOperadores == 4) {
                        Detalle.operadoresUnarios();
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (tipoOperadores == 5) {
                        Detalle.operadoresAsignacion();
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (tipoOperadores == 6) {
                        Detalle.operadoresTernarios();
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    }

                case 5:
                    SubMenus.condicionalesMenu();
                    Scanner juego = new Scanner(System.in);
                    int condicionalesopc = juego.nextInt();

                    if (condicionalesopc == 1) {
                        Ejemplos.variableABC();
                            }
                            System.out.println("Presiona enter para continuar");

                            scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                            scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
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
                                System.out.println("Demasiado bajo. Inténtalo nuevamente.");
                            } else if (numeroUsuario > numeroSecreto) {
                                System.out.println("Demasiado alto. Inténtalo nuevamente.");
                            } else {
                                System.out.println("¡Felicidades! Has adivinado el número.");
                                adivinado = true; // Salir del bucle
                            }
                        } while (!adivinado); // Continuar hasta que el número sea adivinado

                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    }


                case 9:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("                     Bucle WHILE                     ");
                    System.out.println("-----------------------------------------------------");
                    System.out.println("|     Elige la opcion que deseas ver                |");
                    System.out.println("|     1.Explicación  WHILE                          |");
                    System.out.println("|     2.Programa de  WHILE                          |");
                    System.out.println("|                Digite una opción                  |");
                    System.out.println("-----------------------------------------------------");

                    System.out.println("Selecciona una opcion");
                    Scanner While = new Scanner(System.in);
                    int opcionWhile = While.nextInt();

                    if (opcionWhile == 1) {
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("                             Explicación WHILE                               ");
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("| un while es una estructura de control de flujo que te permite             |");
                        System.out.println("| ejecutar un bloque de código repetidamente mientras se cumpla una         |");
                        System.out.println("| condición específica.                                                     |");
                        System.out.println("|                                                                           |");
                        System.out.println("| a.Condición: Antes de ejecutar el código dentro del bucle, se evalúa      |");
                        System.out.println("| una condición. Esta condición debe ser una expresión que resulte en true  |");
                        System.out.println("| o false.                                                                  |");
                        System.out.println("|                                                                           |");
                        System.out.println("| b.Ejecución del Código: Si la condición es true, el código dentro del     |");
                        System.out.println("| bucle while se ejecuta.                                                   |");
                        System.out.println("|                                                                           |");
                        System.out.println("| c.Reevaluación: Después de ejecutar el código, la condición se evalúa     |");
                        System.out.println("| de nuevo. Si sigue siendo true, el código se ejecuta nuevamente.          |");
                        System.out.println("| Este proceso se repite hasta que la condición sea false.                  |");
                        System.out.println("|                                                                           |");
                        System.out.println("| d.Terminación: Cuando la condición se vuelve false, el bucle termina y el |");
                        System.out.println("| programa continúa con el código que sigue después del bucle.              |");
                        System.out.println("|                                                                           |");
                        System.out.println("| la condición.Si la condición es verdadera (true),el bucle se repite       |");
                        System.out.println("| Si es falsa (false), el bucle termina.                                    |");
                        System.out.println("|                                                                           |");
                        System.out.println("| Ejemplo:                                                                  |");
                        System.out.println("|                                                                           |");
                        System.out.println("| public class EjemploWhile {                                               |");
                        System.out.println("|     public static void main(String[] args) {                              |");
                        System.out.println("|          int contador = 0;                                                |");
                        System.out.println("| // Bucle while que se ejecuta mientras contador sea menor que 5           |");
                        System.out.println("|    while (contador < 5) {                                                 |");
                        System.out.println("|        System.out.println(El contador es:  + contador);                 |");
                        System.out.println("|         contador++; // Incrementa el contador                             |");
                        System.out.println("|      }                                                                    |");
                        System.out.println("|        System.out.println(El bucle ha terminado.);                      |");
                        System.out.println("|     }                                                                     |");
                        System.out.println("|   }                                                                       |");
                        System.out.println("|                                                                           |");
                        System.out.println("|  a.Inicialización: Se define una variable contador y se inicializa en 0.  |");
                        System.out.println("|  b.Condición del Bucle: while (contador < 5) verifica si el valor de      |");
                        System.out.println("|    contador es menor que 5.                                               |");
                        System.out.println("|  c.Ejecución del Código: Si la condición es true, se imprime el valor     |");
                        System.out.println("|    del contador y luego se incrementa en 1.                               |");
                        System.out.println("|  d.Reevaluación: Después de incrementar el contador, el bucle verifica    |");
                        System.out.println("|    nuevamente la condición.Si el contador sigue siendo menor que 5,       |");
                        System.out.println("|    el bucle se ejecuta otra vez.                                          |");
                        System.out.println("|  e.Terminación: Cuando contador llega a 5, la condición contador < 5      |");
                        System.out.println("|    se vuelve false, y el bucle termina. El programa continúa con la       |");
                        System.out.println("|    línea que sigue después del bucle, que en este caso                    |");
                        System.out.println("|    imprime El bucle ha terminado.                                         |");
                        System.out.println("|                                                                           |");
                        System.out.println("| El bucle while es útil cuando no sabes cuántas veces necesitarás ejecutar |");
                        System.out.println("| el código, pero tienes una condición clara para determinar cuándo debe    |");
                        System.out.println("| detenerse.                                                                |");
                        System.out.println("|                                                                           |");
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    }

                    else if (opcionWhile == 2) {
                        Scanner numeroIngresado = new Scanner(System.in);
                        System.out.println("Digite un número Entero");


                        Scanner scanner = new Scanner(System.in);

                        // Solicitar al usuario que ingrese un número
                        System.out.print("Digite un numero para realizar la sumatoria ");
                        int x = scanner.nextInt();

                        // Verificar que el número ingresado sea positivo
                        if (x < 1) {
                            System.out.println("Por favor, ingresa un número entero positivo mayor o igual a 1.");
                        } else {
                            int suma = 0;
                            int i = 1;

                            // Bucle while para sumar los números del 1 al x
                            while (i <= x) {
                                suma += i; // Agregar el valor de i a la suma
                                i++; // Incrementar i
                            }

                            // Mostrar el resultado
                            System.out.println("La sumatoria de los números del 1 al " + x + " es: " + suma);
                        }

                    }


            System.out.println("Presiona Enter para continuar...");
            scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
            scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
            break;


                case 10:
                    System.out.println("Imprime el menu Bucle FOR");
                    break;
            }



        }while (opciones != 0) ;
        System.out.println("Saliendo del sistema...");
    }
}






