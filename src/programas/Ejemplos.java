package programas;

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
}