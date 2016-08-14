package pe.egcc.appventa.prueba;

import pe.egcc.appventa.domain.Item;
import pe.egcc.appventa.service.CompAbstract;
import pe.egcc.appventa.service.CompFactory;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    CompAbstract comp;
    comp = CompFactory.getComp(CompFactory.COMP_FACTURA);
    double total = 1560.0;
    Item[] repo = comp.procesar(total);
    for (Item r : repo) {
      System.out.println(r);
    }
  }
}
