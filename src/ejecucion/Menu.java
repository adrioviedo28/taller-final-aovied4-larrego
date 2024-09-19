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
                    SubMenus.switchSubMenu();
                    Scanner Sswitch = new Scanner(System.in);
                    int opcionSwitch = Sswitch.nextInt();

                    if (opcionSwitch == 1) {
                        Detalle.switchExplicacion();
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter

                        break;
                    } else if (opcionSwitch == 2) {
                        Ejemplos.calificacionSwitch();

                    }
                    System.out.println("Presiona Enter para continuar...");
                    scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                    scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                    break;

                case 7:
                    SubMenus.ternariaSubMenu();
                    System.out.println("Selecciona una opcion");
                    Scanner Tternaria = new Scanner(System.in);
                    int opcionTernaria = Tternaria.nextInt();

                    if (opcionTernaria == 1) {
                        Detalle.ternariaExplicacion();
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    } else if (opcionTernaria == 2) {
                    Ejemplos.numeroParImparTernaria();
                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    }

                case 8:
                    SubMenus.doWhileSubMenu();
                    System.out.println("Selecciona una opcion");
                    Scanner DoWhile = new Scanner(System.in);
                    int opcionDoWhile = DoWhile.nextInt();

                    if (opcionDoWhile == 1) {
                        Detalle.doWhileExplicacion();
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    } else if (opcionDoWhile == 2) {
                        Ejemplos.adrivinaElNumeroDoWhile();
                        System.out.println("Presiona Enter para continuar...");
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    }

                case 9:
                    SubMenus.whileSubMenu();
                    System.out.println("Selecciona una opcion");
                    Scanner While = new Scanner(System.in);
                    int opcionWhile = While.nextInt();

                    if (opcionWhile == 1) {
                        Detalle.whileExplicacion();
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    }

                    else if (opcionWhile == 2) {
                        Ejemplos.sumatoriaDeNumerosWile();

            System.out.println("Presiona Enter para continuar...");
            scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
            scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
            break;
                    }


                case 10:

                    SubMenus.forSubMenu();
                    System.out.println("Selecciona una opcion");
                    Scanner For = new Scanner(System.in);
                    int opcionFor = For.nextInt();

                    if (opcionFor == 1) {
                        Detalle.forExplicacion();
                        scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                        scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    }

                    else if (opcionFor == 2) {
                    Ejemplos.sumatoriaDeNumerosFor();
                    System.out.println("Presiona Enter para continuar...");
                    scannerMenuPrincipal.nextLine(); // Captura el salto de línea restante
                    scannerMenuPrincipal.nextLine(); // Espera a que el usuario presione Enter
                    break;
                    }
            }


        }while (opciones != 0) ;
        System.out.println("Saliendo del sistema...");
    }
}