package pe.egcc.app.service;

/**
 * Todos sus miembros tienen alcance de clase.
 * 
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public final class PruebaService {
  
  public static final String NOMBRE;
  public static final double IGV;
  
  static {
    NOMBRE = "Gustavo Coronel";
    double igv;
    try {
      //DataDao dao = new DataDao();
      //igv = dao.getIgv();
      igv = 0.19; // como si fuese de la BD.
    } catch (Exception e) {
      igv = 0.18;
    }
    IGV = igv;
  }

  private PruebaService() {
  }
  
  public static int mayor(int n1, int n2){
    int m;
    m = (n1 > n2)?n1:n2;
    return m;
  }
  
  
  
}
