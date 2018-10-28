public class EqSonido extends MainAparato{

  private String modelo;
  private double precio;
  private double descuento;

  private double precioF;

  public EqSonido(String modelo, double precio){
    super(modelo, precio);
    this.modelo = modelo;
    this.precio = precio;
    System.out.println("PruebaSonido");
  }

  public EqSonido(String modelo, double precio, double descuento){
    super(modelo, precio);
    this.modelo = modelo;
    this.precio = precio;
    this.descuento = descuento;
    System.out.println("Pruebasonido Descuento");
  }

  public String getModelo(){
    return modelo;
  }

  public double getPrecio(){
    return precio;
  }

  public double getDescuento(){
    return descuento;
  }

  public String setModelo(String modelo){
    this.modelo = modelo;
  }

  public double setPrecio(double precio){
    this.precio = precio;
  }

  public double setDescuento(double descuento){
    this.descuento = descuento;
  }

}
