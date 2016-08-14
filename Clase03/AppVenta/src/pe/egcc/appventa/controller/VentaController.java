package pe.egcc.appventa.controller;

import pe.egcc.appventa.domain.Item;
import pe.egcc.appventa.service.CompAbstract;
import pe.egcc.appventa.service.CompFactory;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class VentaController {
  
  public String[] getTipos(){
    String[] tipos = {CompFactory.COMP_FACTURA, CompFactory.COMP_BOLETA};
    return tipos;
  }
  
  public Item[] procesar(String tipo, double total){
    return CompFactory.getComp(tipo).procesar(total);
  }
  
}
