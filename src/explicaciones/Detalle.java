package explicaciones;

public class Detalle {

    public static void byteexplicacion(){
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
    }
    public static void shortExplicacion(){
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
    }
    public static void intExplicacion(){
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

    }
    public static void longExplicacion(){
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
    }
    public static void floatExplicacion(){
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
    }
    public static void doubleExplicacion(){
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
    }
    public static void charExplicacion(){
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
    }
    public static void booleanExplicacion(){
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
    }
    public static void operadoresAritmeticos(){
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                 ¿Que son los Operadores Aritmeticos?                            ");
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
    }
    public static void operadoresRelacionales(){
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
    }
    public static void operadoresLogicos(){
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
    }
    public static void operadoresUnarios(){
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
    }
    public static void operadoresAsignacion(){
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
    }
    public static void operadoresTernarios(){
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
    }





}
