package Libreria;

import java.util.Scanner;

public class pide {
    public static String texto(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(args);
        while(!entrada.hasNextLine()) {
            entrada.nextLine();
            System.out.println("Escribe una cadena de texto");
        }
        return entrada.nextLine();
    }
    public static int numero(String args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(args);
        while(!entrada.hasNextInt()) {
            entrada.nextLine();
            System.out.println("Escribe un numero");
        }
        return entrada.nextInt();
    }
    public static float decimal(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(args);
        while(!entrada.hasNextFloat()) {
            entrada.nextLine();
            System.out.println("Escribe una cadena de texto");
        }
        return entrada.nextFloat();
    }
}
