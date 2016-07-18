package pe.egcc.app.prueba;

import pe.egcc.app.service.PruebaService;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba05 {

  public static void main(String[] args) {
    
    System.out.println("Nombre: " + PruebaService.NOMBRE);
    
    System.out.println("Mayor de 78 y 45: " 
            + PruebaService.mayor(78, 45));
  }
}
