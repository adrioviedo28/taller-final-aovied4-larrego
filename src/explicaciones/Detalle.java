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

    public static void switchExplicacion(){
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
    }
    public static void ternariaExplicacion(){
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
        System.out.println("| String resultado = (numero % 2 == 0) ? \"El número es par\" : \"El número      |");
        System.out.println("|  es impar\";                                                                   |");
        System.out.println("|  // Mostrar el resultado                                                       |");
        System.out.println("|   System.out.println(resultado);                                               |");
        System.out.println("|     }                                                                          |");
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
    }
    public static void doWhileExplicacion(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("                             Explicación DO WHILE                                 ");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("| Un bucle do-while es una estructura de control que te permite repetir un       |");
        System.out.println("| bloque de código varias veces.La principal diferencia con otros bucles,        |");
        System.out.println("| como el while, es que el bloque de código dentro del do-while siempre se       |");
        System.out.println("| ejecutará al menos una vez incluso si la condición que controla el bucle es    |");
        System.out.println("| falsa desde el principio.                                                      |");
        System.out.println("|                                                                                |");
        System.out.println("|                                                                                |");
        System.out.println("| estructura básica del bucle do-while:                                          |");
        System.out.println("| do {                                                                           |");
        System.out.println("|   // Código que se ejecuta en cada iteración                                   |");
        System.out.println("| } while (condición);                                                           |");
        System.out.println("|                                                                                |");
        System.out.println("| do: Esta palabra clave inicia el bucle.                                        |");
        System.out.println("|  El bloque de código dentro de las llaves {} se ejecutará al menos una vez     |");
        System.out.println("|                                                                                |");
        System.out.println("| Código dentro del do: Aquí pones las instrucciones que quieres repetir.        |");
        System.out.println("|                                                                                |");
        System.out.println("| while (condición);Después de ejecutar el bloque de código, se evalúa           |");
        System.out.println("| la condición.Si la condición es verdadera (true),el bucle se repite            |");
        System.out.println("| Si es falsa (false), el bucle termina.                                         |");
        System.out.println("|                                                                                |");
        System.out.println("| Ejemplo:                                                                       |");
        System.out.println("| int contador = 0;                                                              |");
        System.out.println("|                                                                                |");
        System.out.println("| do {                                                                           |");
        System.out.println("|     System.out.println( El contador es:  + contador);                          |");
        System.out.println("|     contador++;                                                                |");
        System.out.println("|     }                                                                          |");
        System.out.println("|  } while (contador < 5);                                                       |");
        System.out.println("|  numero % 2 == 0 :Esta es la condición que verificamos. El operador % calcula  |");
        System.out.println("|  el residuo de la división del numero entre 2. Si el residuo es 0, entonces    |");
        System.out.println("|  el número es par.                                                             |");
        System.out.println("|                                                                                |");
        System.out.println("|  El número es par: Este es el valor asignado a resultado si la condición es    |");
        System.out.println("| verdadera (es decir, si el número es par).                                     |");
        System.out.println("|                                                                                |");
        System.out.println("|  El número es impar: Este es el valor asignado a resultado si la condición     |");
        System.out.println("|  es falsa (es decir, si el número es impar).                                   |");
        System.out.println("|                                                                                |");
        System.out.println("| En el ejemplo, el número 7 es impar, por lo que el resultado será              |");
        System.out.println("| El número es impar.                                                            |");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Presiona Enter para continuar...");
    }
    public static void whileExplicacion(){
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
        System.out.println("|        System.out.println(El contador es:  + contador);                   |");
        System.out.println("|         contador++; // Incrementa el contador                             |");
        System.out.println("|      }                                                                    |");
        System.out.println("|        System.out.println(El bucle ha terminado.);                        |");
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
    }
    public static void forExplicacion(){
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                             Explicación FOR                                 ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("| un for es una estructura de control que se utiliza para repetir un bloque |");
        System.out.println("| de código un número determinado de veces. Es muy útil cuando sabes cuántas|");
        System.out.println("| veces quieres que se ejecute el código.                                   |");
        System.out.println("|                                                                           |");
        System.out.println("| La sintaxis básica de un bucle for es la siguiente:                       |");
        System.out.println("| for (inicialización; condición; actualización) {                          |");
        System.out.println("|       // Código a ejecutar en cada iteración                              |");
        System.out.println("|  }                                                                        |");
        System.out.println("|                                                                           |");
        System.out.println("| a.Inicialización: Aquí defines una variable que generalmente sirve como   |");
        System.out.println("| contador. Por ejemplo, int i = 0;.                                        |");
        System.out.println("| b.Condición: Es una expresión que se evalúa antes de cada iteración.      |");
        System.out.println("| Si es true, el código dentro del bucle se ejecuta; si es false, el bucle  |");
        System.out.println("| termina. Por ejemplo, i < 10.                                             |");
        System.out.println("| c.Actualización: Es la operación que se realiza al final de cada          |");
        System.out.println("| iteración, normalmente para cambiar el contador. Por ejemplo,             |");
        System.out.println("| i++ (incrementa i en 1).                                                  |");
        System.out.println("|                                                                           |");
        System.out.println("| Ejemplo:                                                                  |");
        System.out.println("| for (int i = 0; i < 5; i++) {                                             |");
        System.out.println("|     System.out.println(El valor de i es:  + i);                           |");
        System.out.println("|  }                                                                        |");
        System.out.println("|                                                                           |");
        System.out.println("| Este bucle imprimirá:                                                     |");
        System.out.println("|                       El valor de i es: 0                                 |");
        System.out.println("|                       El valor de i es: 1                                 |");
        System.out.println("|                       El valor de i es: 2                                 |");
        System.out.println("|                       El valor de i es: 3                                 |");
        System.out.println("|                       El valor de i es: 4                                 |");
        System.out.println("|                                                                           |");
        System.out.println("| El bucle for es una forma efectiva de repetir acciones en tu código,      |");
        System.out.println("| especialmente cuando conoces el número de repeticiones.                   |");
        System.out.println("|                                                                           |");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Presiona Enter para continuar...");
    }





}
