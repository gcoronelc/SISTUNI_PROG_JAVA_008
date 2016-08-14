package pe.egcc.app.domain;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Producto {

  private int codigo;
  private String nombre;
  private String descripcion;
  private double precio;
  private int stock;

  /**
   * Constructor por defecto.
   */
  public Producto() {
    /*
    this.codigo = 3333;
    this.nombre = "Ensalada de Fruta Fresca";
    this.descripcion="Rica ensala de la fruta mas deliciosa del perú";
    this.precio = 15.0;
    this.stock = 1000;
    */
    this(3333, "Ensalada de Fruta Fresca", 
            "Rica ensala de la fruta mas deliciosa del perú", 15.0, 100);
    System.out.println("Objeto creado.");
  }

  /**
   * Constructor adicional con parámetros.
   * 
   * @param codigo Código del producto.
   * @param nombre Nombre del producto.
   * @param descripcion Descripción del producto.
   * @param precio Precio de venta del producto.
   * @param stock  Stock en almacén.
   */
  public Producto(int codigo, String nombre, String descripcion, double precio, int stock) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
    this.stock = stock;
  }
  
  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  @Override
  protected void finalize() throws Throwable {
    System.err.println("Chau objeto.");
  }
  
}
