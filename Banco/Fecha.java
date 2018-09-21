/*
Daniel Roa
A01021960
21 de Sept. del 2018
Ejemplo, Agregación y Composición
*/
public class Fecha{
  private int dia;
  private int mes;
  private int anio;

  public Fecha(int dia, int mes, int anio){
    this.dia = dia;
    this.mes = mes;
    this.anio = anio;
  }

  public void printFecha(){
    System.out.println(dia + "/"+mes+"/"+anio);
  }


}
