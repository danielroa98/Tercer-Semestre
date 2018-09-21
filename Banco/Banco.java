public class Banco{
  public static void main(String[] args){
    String nombre = "Daniel";
    String apellido = "Roa";
    int dia = 2;
    int mes = 3;
    int anio = 1998;

    int contador = 0;

    Persona p1 = new Persona(contador++, nombre, apellido, dia, mes, anio);
    Direccion d1 = new Direccion("Avenidad de los Poetas", 12, 12, "Santa Fe", "México D.F.");

    p1.setDireccion(d1);
    p1.printPersona();

    contador = contador+1;
    //Persona p2 = new Persona();
  }
}
