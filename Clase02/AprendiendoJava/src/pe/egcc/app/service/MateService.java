package pe.egcc.app.service;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class MateService {

  public int sumar(int n1, int n2) {
    System.out.println("a");
    return (n1 + n2);
  }
  
  public double sumar(int n1, double n2) {
    System.out.println("b");
    return (n1 + n2);
  }
  
  public double sumar(double n1, int n2) {
    System.out.println("c");
    return (n1 + n2);
  }

  public int sumar(int n1, int n2, int n3) {
    System.out.println("d");
    return (n1 + n2 + n3);
  }

}
