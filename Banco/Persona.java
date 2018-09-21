/*
Daniel Roa
A01021960
21 de Sept. del 2018
Ejemplo, Agregación y Composición
*/
public class Persona{

  private int id;
  private String nombre;
  private String apellido;
  private int edad;
  //private Tarjeta tc;           //Estos son objetos
  private Direccion direccion;  //de otras
  private Fecha fnacimiento;    //clases.


  public Persona(int id, String nombre, String apellido, int dia, int mes, int anio){
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.fnacimiento = new Fecha(dia, mes, anio); //Composición
    //this.direccion = direccion; este metodo de agregacion puede ser usado tambien
  }

  public void setDireccion(Direccion direccion){
    this.direccion = direccion;
  }

  public void printPersona(){
    System.out.printf("Id: %d\nNombre: %s %s\n", id, nombre, apellido);

    fnacimiento.printFecha();

    System.out.println();

    //System.out.printf("Id: %d\nNombre: %s %s\nFecha Nacimiento: %d %d %d", id, nombre, apellido, fnacimiento.getDia(), fnacimiento.getMes(), fnacimiento.getAnio());

    direccion.printDireccion();
  }
}
