package pe.egcc.app001.prueba;

import pe.egcc.app001.service.MateService;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    int n1 = 5;
    int n2 = 7;
    // Proceso
    MateService service = new MateService();
    int suma = service.sumar(n1, n2);
    int prod = service.multiplicar(n1, n2);
    // Reporte
    System.out.println("Suma: " + suma);
    System.out.println("Producto: " + prod);
  }
  
}
