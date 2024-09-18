package menus;

import java.util.Scanner;

public class SubMenus {

    public static void datosPrimitivos(){

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
    }
    public static void stringSubMenu(){
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
    }
    public static void constanteSubMenu(){
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
    }
    public static void operadoresSubMenu(){
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
    }
    public static void condicionalesMenu(){
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("               ¿En que consisten los Condicionales IF, ELSE IF, ELSE?                ");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("| Permiten ejecutar diferentes bloques de código si ciertas condiciones son         |");
        System.out.println("| verdaderas o falsas. Aqui te explicamos en que consiste cada uno y su sintaxis    |");
        System.out.println("| If: Esta declaración evalúa una condición. Si la condición es verdadera, se       |");
        System.out.println("| ejecuta el bloque de codigo asociado. Sintaxis: if (condicion)                    |");
        System.out.println("| » int x = 10; if (x > 5) { System.out.println( x es mayor que 5 ); }              |");
        System.out.println("| Else if: Se usa después de una declaración if para evaluar una condicion          |");
        System.out.println("| alternativa si la condicion de IF no es verdadera. Pueden haber multiples else if |");
        System.out.println("| Sintaxis: if (condicion1){ se ejecuta si la condicion es verdadera}               |");
        System.out.println("| else if(condicion2){ se ejecuta si la condicion es verdadera}                     |");
        System.out.println("| » int x = 10; if (x > 15) { System.out.println( x es mayor que 15 ); }            |");
        System.out.println("| else if (x > 5) {System.out.println( x es mayor que 5 pero menor o igual a 15 );} |");
        System.out.println("| Else:  Se utiliza al final de una serie de condicionales para manejar el caso en  |");
        System.out.println("| que ninguna de las condiciones anteriores (if o else if) sea verdadera.           |");
        System.out.println("| Es opcional y captura todos los casos restantes. Sintaxis: if (condición1) {}     |");
        System.out.println("| else if (condición2){} else {se ejecuta si ninguna de las anteriores es verdadera}|");
        System.out.println("| »int x = 3; if (x > 5) {System.out.println( x es mayor que 5 );}                  |");
        System.out.println("| else if (x == 5) {System.out.println( x es igual a 5 );}                          |");
        System.out.println("| else {System.out.println( x es menor que 5 );}                                    |");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Escribe 1 para mostrarte un ejemplo que aplica los condicionales IF, ELSE IF y ELSE");

    }




}
