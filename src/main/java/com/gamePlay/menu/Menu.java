package com.gamePlay.menu;

import com.gamePlay.Main;
import com.gamePlay.util.Util;

public class Menu {

    public static void menuPrincipal(){
        Util.colorBlanco(" 1) Iniciar Partida");
        Util.colorBlanco(" 2) Tienda");
        Util.colorBlanco(" 3) Generacion Mapa");
        Util.colorBlanco(" 4) Inventario");
        Util.colorBlanco(" 5) Salir");

        opcionMenuPrincipal(Util.solicitarNumero("Selecciona una opcion", 1, 5)); 

    } 

    public static void opcionMenuPrincipal(int opcion){

        switch (opcion) {
            case 1:
            opcion1MenuPrincipal();
                           
                break;

            case 2: 

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:         
            default:
                break;
        }
        

    }

    public static void opcion1MenuPrincipal(){

        if(Main.nuevaPartida()){

            Util.colorPurpura(" Tiene su inventario Vacio, primero compra 2 personajes y algunos objetos.");
            Main.oro =500;
            menuTienda();            
            

        }else{

        }



    }
    
    public static void menuTienda(){

        System.out.println("\n");
        Util.colorAzul("****************************************");
        Util.colorAzul("****************TIENDA******************");
        Util.colorAzul("****************************************");
        Util.colorAmarrillo(" Oro: "+ Main.oro);
        Util.colorBlanco(" 1) Comprar Personajes");
        Util.colorBlanco(" 2) Comprar Objetos");
        Util.colorBlanco(" 3) Comprar Mejoras");
        Util.colorRojo(" 5) Regresar");

        Util.solicitarNumero("Selecciona una opcion", 1, 5);

    }

    public static void menuInventario(){
        Util.colorBlanco(" 1) Personajes");
        Util.colorBlanco(" 2) Objetos");
        Util.colorBlanco(" 3) Mejoras");
        Util.colorRojo(" 4) Salir");

        Util.solicitarNumero("Selecciona una opcion", 1, 4);

    }

    public static void menuTablas(){


    }
}
