
import com.mycompany.testdesings.*;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/*
 * @author Enrique, Saúl y Héctor <3.
 */

public class GestorPalabrasTest {
    
    private GestorPalabras palabra;

    @Before //Inicializa esto en todos los @Test: GestorPalabras palabra = new GestorPalabras();
    public void setUp() {
        palabra = new GestorPalabras(); 
    }
    
    @After
    public void tearDown() { // Aquí puedes realizar tareas de limpieza, liberación de recursos, etc.
        palabra = null; // Establece la referencia del objeto a null para liberar la memoria.
    }
    
    @Test //Funciona correctamente.
    public void esPalindromo() {      
        assertEquals(true, palabra.esPalindromo("allí ves sevilla"));
	assertEquals(false, palabra.esPalindromo("jesús todo poderoso"));	
	assertEquals(true, palabra.esPalindromo("amo la paloma"));
	assertEquals(false, palabra.esPalindromo("Dios es misericordioso"));	 
	assertEquals(true, palabra.esPalindromo("A luna ese anula"));
	assertEquals(false, palabra.esPalindromo("Todo el mundo merece una segunda oportunidad")); 
	assertEquals(true, palabra.esPalindromo("A mi loca Colima"));
	assertEquals(false, palabra.esPalindromo("La fé es lo último que se pierde")); 
	assertEquals(true, palabra.esPalindromo("A ti no, bonita"));	     
    }

    @Test
    public void contarVocales() { //Funciona correctamente.
        assertEquals(16, palabra.contarVocales("Toji Fushiguro Mejor qúe tu novió GEGE"));
        assertEquals(6, palabra.contarVocales("Algó ándaba mal"));
        assertEquals(14, palabra.contarVocales("Péro mí egó me condeno a la derrota"));
        assertEquals(9, palabra.contarVocales("Expasión de dominio"));
        assertEquals(12, palabra.contarVocales("Yutaaaá Ganá a Sùkúná yá"));
        assertEquals(4, palabra.contarVocales("fucking panza"));
        assertEquals(3, palabra.contarVocales("añañin"));
        assertEquals(29, palabra.contarVocales("Pènse que había elegido una vida en la que no me comparía còn lós demás"));
        assertEquals(12, palabra.contarVocales("HenriGánòLáPèlèáContráDIO"));
        assertEquals(12, palabra.contarVocales("No copie yá qué lá notá será"));
        assertEquals(7, palabra.contarVocales("Cuèstiónable nó"));
    }
    
    @Test
    public void invertirPalabra() { //Funciona correctamente.
        assertEquals("amabo", palabra.invertirPalabra("obama"));
        assertEquals("ordep", palabra.invertirPalabra("Pedro"));
        assertEquals("saiasi", palabra.invertirPalabra("Isaias"));
        assertEquals("sesiom", palabra.invertirPalabra("Moises"));
        assertEquals("obocaj", palabra.invertirPalabra("Jacobo"));
        assertEquals("amasimak", palabra.invertirPalabra("Kamisama"));
        assertEquals("leba", palabra.invertirPalabra("Abel"));
        assertEquals("talcobmob", palabra.invertirPalabra("Bomboclat"));
        assertEquals("niac", palabra.invertirPalabra("Cain"));
        assertEquals("saduj", palabra.invertirPalabra("Judas"));
    }
   
}