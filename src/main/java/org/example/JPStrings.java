package org.example;

import java.util.Random;

public class JPStrings {
    /**
     * Pone la primera letra en mayuscula y el resto en minuscula
     * @param text el texto
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
    }

    /**
     * Pone espacios a la izquierda de las palabras...
     *
     * @param text
     * @return
     */

    public static String leftPad(String str, int width) {

        // si vull tindre 6 espais

        return " ".repeat(width-str.length()) + str;
    }

    /**
     * Conviwerte un numero de dias en un texto indicando
     * cuan
     * @param days
     * @return
     */
    public static String toWeekdays(int days) {

        if (days == 7) {
            return "1 setmana";
        } else if (days % 7 == 0) {
            int resultat = days / 7;
            return resultat + " semanes";
        } else if (days < 14 && days > 7) {
            int resultat1 = days / 7;
            int resultat = days % 7;
            return resultat1 + " setmanes " + resultat + " dies";
        }else if (days<7){

            return days +" dies";

        } else {
            int resultat1 = days / 7;
            int resultat = days % 7;
            return resultat1 + " setmanes " + resultat + " dies";
        }

    }

    /**
     * Une un texto con un nuymero
     * @param text El texto
     * @param num El numero
     * @param orden Si es true texto+numero si el false al reves
     * @return el texto unido en el orden indicado
     */
    public static String uneTextoYNumero(String text, int num, boolean orden) {
        if (orden) return text + num;
        return num + text;
    }

    /**
     * Afegix un @ davant i darrere
     * @param text El text
     * @param num El num
     * @param siOno Si el numero es major de 7 I A MES HA DE SER TRUE tmb , Afegix un @ davant i darrere
     * @return el text afegint el @ o no
     *
     */

    public static String afegixArroba(String text , int num , boolean siOno){

        if (num>7 && siOno==true){
            return "@"+ text + "@";
        }else {
            return text;
        }

    }
}
