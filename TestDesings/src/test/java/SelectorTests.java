
import com.mycompany.testdesings.GestorPalabras;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * @author Enrique, Saúl y Héctor <3.
 */

public class SelectorTests {

    @Test
    public void esPalindromo() {
        GestorPalabras palabra = new GestorPalabras();
        assertEquals(true, palabra.esPalindromo("allí ves sevilla"));
    }

    @Test
    public void contarVocales() {
        GestorPalabras palabra = new GestorPalabras();
        assertEquals(6, palabra.contarVocales("allí ves sevilla"));
    }
    
    @Test
    public void invertirPalabra() {
        GestorPalabras palabra = new GestorPalabras();
        assertEquals("amabo", palabra.invertirPalabra("obama"));
    }
   
}