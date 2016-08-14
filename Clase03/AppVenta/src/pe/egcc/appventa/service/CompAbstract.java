package pe.egcc.appventa.service;

import pe.egcc.appventa.domain.Item;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public abstract class CompAbstract {
  
  public static final double IGV = 0.18;
  public static final double SERVICIO = 0.10;
  
  public abstract Item[] procesar(double total);
  
}
