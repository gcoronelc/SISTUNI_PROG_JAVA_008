package pe.egcc.appventa.service;

import java.util.List;
import pe.egcc.appventa.model.Venta;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class VentaService {
  
  public void guardarVenta(Venta venta){
    venta.setImporte(venta.getPrecio() * venta.getCant());
    Data.data.add(venta);
  }
  
  public List<Venta> getVentas(){
    return Data.data;
  }
}
