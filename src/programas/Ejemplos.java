package programas;

import java.util.Random;
import java.util.Scanner;

public class Ejemplos {

    public static void variableABC() {

        System.out.println("Bienvenido/a al programa donde validaremos cual de los numeros ingresados es menor o mayor \nA continuacion ingrese 3 valores DISTINTOS");

        Scanner valores = new Scanner(System.in);
        int A, B, C;

        System.out.println("Ingrese el valor Numero 1");
        A = valores.nextInt();

        System.out.println("Ingrese el valor Numero 2");
        B = valores.nextInt();

        System.out.println("Ingrese el valor Numero 3");
        C = valores.nextInt();

        int comparar;

        if (A == B && B == C) {
            comparar = 1; // Todos los valores ingresados son iguales
        } else if (A == B || A == C || B == C) {
            comparar = 2; // Alguno de los valores ingresados son iguales
        } else {
            comparar = 3; // Los valores son distintos
        }

        switch (comparar) {
            case 1: {
                System.out.println("Todos los valores ingresados son iguales, por favor ingreselos nuevamente. Recuerde que todos deben ser ditintos");
            }
            case 2: {
                System.out.println("Algunos valores ingresados son iguales, por favor ingreselos nuevamente. Recuerde que todos deben ser ditintos");
                break;
            }
            case 3: {
                int menor, mayor;

                if (A > B && A > C) {
                    mayor = A;
                } else if (B > A && B > C) {
                    mayor = B;
                } else {
                    mayor = C;
                }
                if (A < B && A < C) {
                    menor = A;
                } else if (B < A && B < C) {
                    menor = B;
                } else {
                    menor = C;
                }

                System.out.println("De los datos ingresados anteriormente, el mayor es " + mayor);
                System.out.println("De los datos ingresados anteriormente, el menor es " + menor);
            }
        }
    }
    public static void calificacionSwitch(){
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
    public static void numeroParImparTernaria(){
        Scanner numeroIngresado = new Scanner(System.in);
        System.out.println("Digite un número Entero");
        int numero = numeroIngresado.nextInt();

        String resultado = (numero % 2 == 0) ? "El número es par" : "El número es impar";
        // Mostrar el resultado
        System.out.println(resultado);
    }
    public static void adrivinaElNumeroDoWhile(){
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
    }
    public static void sumatoriaDeNumerosWile(){
        Scanner numeroIngresado = new Scanner(System.in);
        System.out.println("Ejercicio de la sumatoria de numeros");

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
    public static void sumatoriaDeNumerosFor(){
        Scanner numeroIngresado = new Scanner(System.in);
        System.out.println("Ejercicio de sumatoria de numeros");
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Digite un numero para realizar la sumatoria ");
        int numero = scanner.nextInt();

        int sumatoria = 0;

        for (int i = 1; i <= numero; i++) {
            sumatoria += i; // Suma el valor de i a sumatoria
        }

        System.out.println("La sumatoria de los números desde 1 hasta " + numero + " es: " + sumatoria);

    }

}
