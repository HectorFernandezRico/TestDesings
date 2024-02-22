
package com.mycompany.testdesings;

import java.text.Normalizer;

/*
 * @author Enrique, Saúl y Héctor <3.
 */

public class GestorPalabras {

    public boolean esPalindromo(String palabra) {
        String palabraFormateada = palabra.replaceAll("\\s+", "").toLowerCase(); //Pasa todo a minusculas (No tiene tilde por si acaso).
        String palabraSinAcento;
        palabraSinAcento = skipearAcentos(palabraFormateada); //Añadimos un método para poder hacer palíndromos con palabas con acento.
        palabraSinAcento = palabraSinAcento.replaceAll(",", ""); //Quita las comas.
        for (int i = 0; i < palabraSinAcento.length() / 2; i++) {
            if (palabraSinAcento.charAt(i) != palabraSinAcento.charAt(palabraSinAcento.length() - i - 1)) { //Se comprueba si es palíndromo o no.
                return false;
            }
        }
        return true;
    }

    public int contarVocales(String palabra) {
        int contador = 0;
        String tomie = skipearAcentos(palabra); //Inicializamos este método para contar vocales con acentos a vocales normales?.
        for (int i = 0; i < tomie.length(); i++) { //Cambiamos palabra.length por tomie.length ya que lo metimos ahí.

            char caracter = Character.toLowerCase(tomie.charAt(i));
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {  //Cambiamos el != por == parea que cuente solo las vocales, a parte tambien cambiamos los && por || para que sean solo las vocales.
                contador++;
            }
        }
        return contador;
    }

    public String invertirPalabra(String palabra) {
        StringBuilder resultado = new StringBuilder();
        palabra = palabra.toLowerCase(); //Cambiamos las mayúsculas a minúsculas.
        for (int i = palabra.length() - 1; i >= 0; i--) { //Cambiamos el -2 que le restaba al palabra.length() por un -1, ya que te quitaba una letra en el reversible.
            resultado.append(palabra.charAt(i));
        }
        return resultado.toString().toLowerCase();
    }

    public static String skipearAcentos(String uwu) {
        uwu = Normalizer.normalize(uwu, Normalizer.Form.NFD);
        uwu = uwu.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return uwu;
    }
    
}