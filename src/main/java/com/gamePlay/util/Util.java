package com.gamePlay.util;
import java.util.Random;
import java.util.Scanner;

public class Util {

    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String PURPLE = "\u001B[35m";
    private static final String CYAN = "\u001B[36m";
    private static final String RESET = "\u001B[0m";
    private static final String WHITE = "\u001B[37m";


    public static Scanner ingresar =  new Scanner(System.in);

    public static Random random = new Random();

    public static String solicitarString(String mensaje) {
        String respuesta = "";
        boolean hayErrorStringIngresado = false;

        do {
            System.out.println("\n" + mensaje);
            respuesta = ingresar.nextLine();
            // scanner.nextLine();//probar
            respuesta = respuesta.trim();
            if (respuesta.length() > 0) {
                hayErrorStringIngresado = false;
            } else {
                hayErrorStringIngresado = true;
                colorRojo("Ingrese un caracter como minimo");
            }

        } while (hayErrorStringIngresado);

        return respuesta;
    }



    public static boolean analizarCaracter()
    {
        boolean esCorrecto=true;


        return esCorrecto;
    }


    public static int solicitarNumero(String mensaje, int limiteInferior, int limiteSuperior) {
        int numeroIngresado = 0;
        boolean hayErrorNumeroIngresado = false;
        do {
            try {

                System.out.println("\n" + mensaje);
                numeroIngresado = ingresar.nextInt();
                if ((numeroIngresado >= limiteInferior) && (numeroIngresado <= limiteSuperior)) {
                    hayErrorNumeroIngresado = false;
                } else {
                    hayErrorNumeroIngresado = true;
                    Util.colorRojo("Debe ingresar un número entre [" + limiteInferior + " . . " + limiteSuperior + "]");
                    System.out.println("Ingrese de nuevo.");
                }
            } catch (Exception e) {
                hayErrorNumeroIngresado = true;
                Util.colorRojo("Debe ingresar un número entre [" + limiteInferior + " . . " + limiteSuperior + "]");
                System.out.println("Ingrese un numero entero.");

            }
            ingresar.nextLine();
        } while (hayErrorNumeroIngresado);
        return numeroIngresado;
    }







    /*******   Generar numeros Random  */
    public static int numeroAlatorio (int min, int max)
    {
        return random.nextInt(max - min) + min;
    }








    ///// colorear Salidas *****

    public static void colorRojo(String textoPintar) {
        System.out.println(RED+textoPintar+RESET);
    }
    public static void colorVerde(String textoPintar) {
        System.out.println(GREEN+textoPintar+RESET);
    }
    public static void colorAmarrillo(String textoPintar) {
        System.out.println(YELLOW+textoPintar+RESET);
    }
    public static void colorAzul(String textoPintar) {
        System.out.println(BLUE+textoPintar+RESET);
    }
    public static void colorPurpura(String textoPintar) {
        System.out.println(PURPLE+textoPintar+RESET);
    }
    public static void colorCyan(String textoPintar) {
        System.out.println(CYAN+textoPintar+RESET);
    }
    public static void colorBlanco(String textoPintar){
        System.out.println(WHITE + textoPintar + RESET);
    }
}
