package pe.egcc.model;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Clase2 extends Clase1 {

  public Clase2() {
    super("Gustavo");
  }
  
  @Override
  public int sumar(int n1, int n2) {
    int suma = super.sumar(n1, n2) * n1 / n2;
    return suma;
  }

  public int multiplicar(int n1, int n2) {
    return (n1 * n2);
  }

}
