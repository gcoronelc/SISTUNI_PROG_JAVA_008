package pe.egcc.appventa.service;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.appventa.model.Venta;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
final class Data {

  private Data() {
  }

  static List<Venta> data;
  
  static {
    data = new ArrayList<>();
  }
  
}
