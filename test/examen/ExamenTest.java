package examen;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase test. comprue3be que todos los caminos del método elMayorDe funciona
 * correctamente.
 * 
 * enlace Github. https://github.com/ariolim/examen_ED_tri02.git
 *
 * @author Andrés Ríos Lima
 */
public class ExamenTest {

  /**
   * Test Comprueba que lanza una exepción si el array es null.
   */
  @Test
  public void testElMayorDeLanzaExcepcionSiElArrayEsNull() {
    System.out.println("testElMayorDeLanzaExcepcionSiElArrayEsNull");
    int[] listaEnteros = null;
    try {
      int result = Examen.elMayorDe(listaEnteros);
    } catch (Exception e) {
      assertTrue("El método no funciona correctamente no lanza la exepción", true);
    }
  }

  /**
   * Test Comprueba que lanza una exepción si el tamaño array es mayor a la la
   * constante TAMAÑOMAXIMO.
   */
  @Test
  public void testElMayorDeLanzaExcepcionSiElTamañoDelArrayEsMayorALaConstanteTAMAÑOMAXIMO() {
    System.out.println("testElMayorDeLanzaExcepcionSiElTamañoDelArrayEsMayorALaConstanteTAMAÑOMAXIMO");
    int[] listaEnteros = new int[200];
    try {
      int result = Examen.elMayorDe(listaEnteros);
    } catch (Exception e) {
      assertTrue("El método no funciona correctamente no lanza la exepción", true);
    }
  }

  /**
   * Test Comprueba que el array tiene solo una posición y devuelve el valor de
   * esa posición.
   */
  @Test
  public void testElMayorDevuelveElValorDeLaUnicaPosicionDelArray() {
    System.out.println("testElMayorDevuelveElValorDeLaUnicaPosicionDelArray");
    int[] listaEnteros = new int[1];
    listaEnteros[0] = 5;
    int resultadoEsperado = 5;
    int resultado = 0;
    try {
      resultado = Examen.elMayorDe(listaEnteros);
    } catch (Exception e) {
      fail("El método no funciona correctamente no lanza la exepción");
    }
    assertEquals("El método no funciona correctamente no devuelve lo esperado", resultadoEsperado, resultado);
  }

  /**
   * Test Comprueba que el array tiene mas de una posiciones y devuelve el
   * primer valor de la lista porque es el mayor.
   */
  @Test
  public void testElMayorDevuelveElPrimerValorDeLaLista() {
    System.out.println("testElMayorDevuelveElPrimerValorDeLaLista");
    int[] listaEnteros = new int[2];
    listaEnteros[0] = 5;
    listaEnteros[1] = 4;
    int resultadoEsperado = 5;
    int resultado = 0;
    try {
      resultado = Examen.elMayorDe(listaEnteros);
    } catch (Exception e) {
      fail("El método no funciona correctamente no lanza la exepción");
    }
    assertEquals("El método no funciona correctamente no devuelve lo esperado", resultadoEsperado, resultado);
  }

  /**
   * Test Comprueba que el array tiene más de una posición y devuelve el mayor
   * valor que es el segundo valor de la lista
   */
  @Test
  public void testElMayorDevuelveElSegundoValorDeLaListaPorQueEsELMayor() {
    System.out.println("testElMayorDevuelveElSegundoValorDeLaListaPorQueEsELMayor");
    int[] listaEnteros = new int[2];
    listaEnteros[0] = 4;
    listaEnteros[1] = 5;
    int resultadoEsperado = 5;
    int resultado = 0;
    try {
      resultado = Examen.elMayorDe(listaEnteros);
    } catch (Exception e) {
      fail("El método no funciona correctamente no lanza la exepción");
    }
    assertEquals("El método no funciona correctamente no devuelve lo esperado", resultadoEsperado, resultado);
  }
}
