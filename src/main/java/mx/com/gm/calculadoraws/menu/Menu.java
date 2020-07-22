/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.calculadoraws.menu;

import java.util.Scanner;
import static mx.com.gm.calculadoraws.operaciones.Operaciones.*;



/**
 *
 * @author Usuario
 */
public class Menu {
     public static void menu(){
        int opcion=-1;//Inicializamos
        do{    
            System.out.println("-------------");
            System.out.println("-CALCULADORA-");
            System.out.println("-------------");
            System.out.println("1-SUMA");
            System.out.println("2-RESTA");
            System.out.println("3-DIVISION");
            System.out.println("4-MULTIPLICACION");

            System.out.println("Elige una opción a realizar o 0 para salir: ");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
                case 1:
                    System.out.println("Elige primer operando: ");
                    int x = sc.nextInt();
                    System.out.println("Elige segundo operando: ");
                    int y = sc.nextInt();
                    System.out.println(x + "+" + y + "=" + suma(x, y));
                    break;

                case 2:
                    System.out.println("Elige primer operando: ");
                    x = sc.nextInt();
                    System.out.println("Elige segundo operando: ");
                    y = sc.nextInt();
                    System.out.println(x + "-" + y + "=" + resta(x, y));
                    break;

                case 3:
                    System.out.println("Elige primer operando: ");
                    x = sc.nextInt();
                    System.out.println("Elige segundo operando: ");
                    y = sc.nextInt();
                    System.out.println(x + "/" + y + "=" + division(x, y));
                    break;

                case 4:
                    System.out.println("Elige primer operando: ");
                    x = sc.nextInt();
                    System.out.println("Elige segundo operando: ");
                    y = sc.nextInt();
                    System.out.println(x + "*" + y + "=" + multiplicacion(x, y));
                    break;

            }
                      }
        while (opcion!=0);

      
    }
}
