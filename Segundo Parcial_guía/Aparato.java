public class Aparato{

  private String modelo;
  private double precio;

  public Aparato(){

  }

  public Aparato(String modelo, double precio){
    this.modelo = modelo;
    this.precio = precio;
  }

  public String getModelo(){
    return modelo;
  }

  public double getPrecio(){
    return precio;
  }

  public String setModelo(String modelo){
    this.modelo = modelo;
  }


  public double setPrecio(double precio){
    this.precio = precio;
  }
}
