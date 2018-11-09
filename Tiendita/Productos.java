public class Productos{

  private String nombre;
  private double precio;
  private String id;
  private int cantidad;

  public Productos(String name, double precio, String id, int cantidad){
    this.nombre = nombre;
    this.precio = precio;
    this.id = id;
    this.cantidad = cantidad;
  }

  public String getNombre(){
    return nombre;
  }

  public double getPrecio(){
    return precio;
  }

  public String getID(){
    return id;
  }

  public int getCantidad(){
    return cantidad;
  }


}
