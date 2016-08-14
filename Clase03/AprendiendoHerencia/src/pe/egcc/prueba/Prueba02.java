package pe.egcc.prueba;

import pe.egcc.model.Clase1;
import pe.egcc.model.Clase2;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    Clase1 bean = new Clase1();
    System.out.println("Suma: " + bean.sumar(2, 1));
    
    bean = new Clase2();
    System.out.println("Suma: " + bean.sumar(2, 1));
    
    Clase2 bean2 = new Clase2();
    System.out.println("Producto: " + bean2.multiplicar(2, 1));
    
    
  }
}
