package pe.egcc.prueba;

import pe.egcc.model.Clase1;
import pe.egcc.model.Clase2;
import pe.egcc.model.Clase3;
import pe.egcc.model.Clase4;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba03 {
  
  public static void main(String[] args) {
    Object bean = new Clase2();
    
    System.out.println("Compatible con Object: " + ((bean instanceof Object)?"SI":"NO"));
    System.out.println("Compatible con Clase1: " + ((bean instanceof Clase1)?"SI":"NO"));
    System.out.println("Compatible con Clase2: " + ((bean instanceof Clase2)?"SI":"NO"));
    System.out.println("Compatible con Clase3: " + ((bean instanceof Clase3)?"SI":"NO"));
    System.out.println("Compatible con Clase4: " + ((bean instanceof Clase4)?"SI":"NO"));

  }
  
}
