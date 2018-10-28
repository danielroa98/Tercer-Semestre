public class TV extends Aparato{

  private String modelo;
  private double precio;
  private double descuento;
  private Pulgadas pulg;

  private double precioF;

  public TV(){

  }

  public TV(String modelo, double precio, Pulgadas pulg){
    super(modelo, precio);
    this.pulg = pulg;
    System.out.println("PruebaTV");
  }

  public TV(String modelo, double precio, double descuento, Pulgadas pulg){
    super(modelo, precio);
    this.pulg = pulg;
    this.descuento = descuento;
  }

  public TV(String modelo, double precio, double descuento){
    super(modelo, precio);
    this.descuento = descuento;
  }

  public TV(String modelo, double precio){
    super(modelo, precio);
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

  public Pulgadas getPulg(){
    return pulg;
  }

/*
  public void setModelo(String modelo){
    this.modelo = modelo;
  }*/

/*
  public void setPrecio(double precio){
    this.precio = precio;
  }*/

  public void setDescuento(double descuento){
    this.descuento = descuento;
  }

  public void setPulgadas(Pulgadas pulg){
    this.pulg = pulg;
  }

/*
  @Override
  public String toString(){
    return "TV "+modelo+" Precio $"+precio+" Descuento "+(descuento == null? "NO":"SI")+ TV.getDescuento() + "% Pulgadas "+pulgadas;
  }
*/
}
