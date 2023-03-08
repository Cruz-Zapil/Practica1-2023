package com.gamePlay;


import com.gamePlay.menu.Menu;

/**
 * Hello world!
 *
 */

public class Main
{

    private static boolean nuevaPartida;
    public static int oro=0;

    public static void main( String[] args ){
        
        nuevaPartida = true;     
        Menu.menuPrincipal();
        

    }

    public static void nuevaPartida(boolean nueva){
        nuevaPartida=nueva;
    }

    public static boolean nuevaPartida(){

        return nuevaPartida;
    }


}
