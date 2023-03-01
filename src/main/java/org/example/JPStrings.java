package org.example;

import java.util.Random;

public class JPStrings {
    /**
     * Pone la primera letra en mayuscula y el resto en minuscula
     * @param text
     * @return
     */
    public static String capitalitzar(String text){

       return text.substring(0,1).toUpperCase() + text.substring(1).toLowerCase();
    }

    /**
     * pinta cada letra de un color...
     *
     * @param text
     * @return
     */

    public static String colorear(String text){
        Random random = new Random();
        String resultat = "";
        for (int i = 0; i < text.length(); i++) {
            resultat += "\033[3" + (random.nextInt(8)) + "m" + text.charAt(i);
        }
        return resultat +"\033[0m";
    }/**
     * Pone espacios a la izquierda de las palabras...
     *
     * @param text
     * @return
     */

    public static String leftPad(String str, int width) {

        // si vull tindre 6 espais

        return " ".repeat(width-str.length()) + str;
    }
}
