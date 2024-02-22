
import com.mycompany.testdesings.GestorPalabras;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * @author Enrique, Saúl y Héctor <3.
 */

public class SelectorTests {

    @Test //Funciona correctamente.
    public void esPalindromo() {      
        GestorPalabras palabra = new GestorPalabras();
        assertEquals(true, palabra.esPalindromo("allí ves sevilla"));	     
    }

    @Test //Funciona correctamente.
    public void contarVocales() { 
        GestorPalabras palabra = new GestorPalabras();
        assertEquals(true, palabra.esPalindromo("allí ves sevilla"));
    }
    
    @Test //Funciona correctamente.
    public void invertirPalabra() {
        GestorPalabras palabra = new GestorPalabras();
        assertEquals("amabo", palabra.invertirPalabra("obama"));
    }
   
}