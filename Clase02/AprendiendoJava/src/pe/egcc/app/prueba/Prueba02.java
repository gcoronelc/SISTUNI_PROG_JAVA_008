package pe.egcc.app.prueba;

import pe.egcc.app.domain.Producto;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba02 {

  public static void main(String[] args) {
            
    Producto prod = new Producto();

    System.out.println("Código: " + prod.getCodigo());
    System.out.println("Nombre: " + prod.getNombre());
    System.out.println("Descripción: " + prod.getDescripcion());
    System.out.println("Precio: " + prod.getPrecio());
    System.out.println("Stock: " + prod.getStock());
    
    System.out.println("----------------------");
    
    prod.setCodigo(222);
    prod.setNombre("Coca Cola");
    prod.setDescripcion("Excelente bebida para diabeticos. Los mata rápido. También se utiliza en las dietas para bajar de peso.");
    prod.setPrecio(3.5);
    prod.setStock(100);
    
    
    System.out.println("Código: " + prod.getCodigo());
    System.out.println("Nombre: " + prod.getNombre());
    System.out.println("Descripción: " + prod.getDescripcion());
    System.out.println("Precio: " + prod.getPrecio());
    System.out.println("Stock: " + prod.getStock());
    
  }
}
