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

  private static int count = 0;

  public Persona(String nombre, String apellido, int dia, int mes, int anio, Direccion direccion){
    count++;
    this.id = count;
    this.nombre = nombre;
    this.apellido = apellido;
    this.fnacimiento = new Fecha(dia, mes, anio); //Composición
    this.direccion = direccion; //este metodo de agregacion puede ser usado tambien
  }

  public Persona(String nombre, String apellido, int dia, int mes, int anio, Direccion direccion){
    count++;
    this.id = count;
    this.nombre = nombre;
    this.apellido = apellido;
    this.fnacimiento = new Fecha(dia, mes, anio); //Composición
    //this.direccion = direccion; //este metodo de agregacion puede ser usado tambien
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

  public void modificacontador(){
    count = 9;
  }
}
