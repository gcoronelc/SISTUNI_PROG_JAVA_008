package pe.egcc.prueba;

import pe.egcc.model.Clase4;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    Clase4 bean = new Clase4();
    System.out.println("Suma: " + bean.sumar(0, 1));
    System.out.println("Suma: " + bean.sumar(1, 1));
    System.out.println("Suma: " + bean.sumar(2, 1));
  }
}
