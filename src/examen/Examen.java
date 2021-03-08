package examen;

/**
 * Clase examen. contiene un método que comprueba una lista de enteros y
 * devuelve el mayor valor de la lista.
 *
 * @author Andres Ríos Lima
 */
public class Examen {

  /**
   * Constante con el tamaño máximo que puede tener el array de enteros.
   */
  public static final int TAMAÑOMAXIMO = 100;

  /**
   * Método se le pasa un array de enteros y devuelve el valor máximo de la
   * lista pasada por parámetros
   *
   * @param listaEnteros array de tipo entero con los valores aaverigurar el
   * mayor.
   * @return tipo entero con el mayor valor de la lista.
   * @throws Exception Lanza exepciones si el array es null o si el tamaño del
   * array sobrepasa a le tamaño de la constante TAMAÑOMAXIMO.
   */
  public static int elMayorDe(int[] listaEnteros) throws Exception {
    if (listaEnteros == null) {
      throw new Exception("Lista de números vacía, no se puede calcular el máximo");

    }
    if (listaEnteros.length > TAMAÑOMAXIMO) {
      throw new Exception(
              "Lista de números demasido grande, no se puede calcular el máximo");
    }
    int mayor = listaEnteros[0];
    for (int i = 1; i < listaEnteros.length; i++) {
      if (mayor < listaEnteros[i]) {
        mayor = listaEnteros[i];
      }
    }
    return mayor;
  }
}
