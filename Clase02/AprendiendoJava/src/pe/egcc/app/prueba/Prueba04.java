package pe.egcc.app.prueba;

import pe.egcc.app.service.MateService;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba04 {
  
  public static void main(String[] args) {
    MateService service = new MateService();
    System.out.println(service.sumar(5, 6.0));
  }
}
