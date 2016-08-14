package pe.egcc.appventa.domain;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Item {

  private String concepto;
  private double valor;

  /**
   * Constructor por defecto.
   */
  public Item() {
  }

  /**
   * Constructor adicional.
   * 
   * @param concepto Concepto del comprobante.
   * @param valor Valor del concepto.
   */
  public Item(String concepto, double valor) {
    this.concepto = concepto;
    this.valor = valor;
  }

  public String getConcepto() {
    return concepto;
  }

  public void setConcepto(String concepto) {
    this.concepto = concepto;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  @Override
  public String toString() {
    String texto = concepto + "                  ";
    texto = texto.substring(0,18) + "\t" + valor;
    return texto;
  }

  
}
