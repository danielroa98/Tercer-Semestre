public class Banco{
  public static void main(String[] args){
    String nombre = "Daniel";
    String apellido = "Roa";
    int dia = 2;
    int mes = 3;
    int anio = 1998;

    int contador = 0;

    Direccion d1 = new Direccion("Avenidad de los Poetas", 12, 12, "Santa Fe", "México D.F.");

    Persona p1 = new Persona(nombre, apellido, dia, mes, anio, d1);

    Persona p2 = new Persona("María", apellido, 22, 10, 1995, d1);

    p1.setDireccion(d1);
    p1.printPersona();
    //p2.printPersona();

    p1.modificacontador();
    p2.printPersona();

    Persona p3 = new Persona("Otro", apellido, 22, 10, 1995, d1);

    p3.printPersona();

    contador = contador+1;
    //Persona p2 = new Persona();
  }
}
