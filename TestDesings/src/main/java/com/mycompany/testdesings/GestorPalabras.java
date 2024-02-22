
package com.mycompany.testdesings;

import java.text.Normalizer;
import java.util.*;

/*
 * @author Enrique, Saúl y Héctor <3.
 */

public class GestorPalabras {

    public boolean esPalindromo(String palabra) {
        String palabraFormateada = palabra.replaceAll("\s+", "").toLowerCase(); //Pasa todo a minusculas (No tiene tilde por si acaso).
        String palabraSinAcento;
        palabraSinAcento = skipearAcentos(palabraFormateada); //Añadimos un método para poder hacer palíndromos con palabas con acento.
        for (int i = 0; i < palabraSinAcento.length() / 2; i++) {
            if (palabraSinAcento.charAt(i) != palabraSinAcento.charAt(palabraSinAcento.length() - i - 1)) { //Se comprueba si es palíndromo o no.
                return false;
            }
        }
        return true;
    }

    public int contarVocales(String palabra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = Character.toLowerCase(palabra.charAt(i)); //Aqui necesitamos poner nuestro metrodo para los acentos
            if (caracter == 'a' || caracter == 'e' || caracter == 'i'  || caracter == 'o' || caracter == 'u') {
                //Cambiamos el != por == parea que cuente solo las vocales, a parte tambien cambiamos los && por || para que sean solo las vocales.
                contador++;
            }
        }
        return contador;
    }

    public String invertirPalabra(String palabra) {
        StringBuilder resultado = new StringBuilder();
        for (int i = palabra.length() - 2; i >= 0; i--) {
            resultado.append(palabra.charAt(i));
        }
        return resultado.toString();
    }
    public static String skipearAcentos(String uwu) {
        uwu = Normalizer.normalize(uwu, Normalizer.Form.NFD);
        uwu = uwu.replaceAll("[\p{InCombiningDiacriticalMarks}]", "");
        return uwu;
    }
}
