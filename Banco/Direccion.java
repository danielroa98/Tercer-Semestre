/*
Daniel Roa
A01021960
21 de Sept. del 2018
Ejemplo, Agregación y Composición
*/
public class Direccion{
  private String calle;
  private int nint;
  private int next;
  private String colonia;
  private String ciudad;

  public Direccion(String calle, int nint, int next, String colonia, String ciudad){
    this.calle = calle;
    this.nint = nint;
    this.next = next;
    this.colonia = colonia;
    this.ciudad = ciudad;
  }

  public void printDireccion(){
    System.out.println("Calle: "+calle+" No. Interior: "+nint+" No. Exterior: "+next+" Colonia: "+colonia+" Ciudad: "+ciudad);
  }
}
