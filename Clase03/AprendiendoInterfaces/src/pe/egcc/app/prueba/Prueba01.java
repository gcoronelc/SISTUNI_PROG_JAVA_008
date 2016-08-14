package pe.egcc.app.prueba;

import pe.egcc.app.service.espec.MateServiceEspec;
import pe.egcc.app.service.impl.MateServiceImpl;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    MateServiceEspec service;
    service = new MateServiceImpl();
    System.out.println("8 + 9 = " + service.sumar(8, 9));
    System.out.println("Factorial de 6 es " + service.factorial(6));
  }
}
