/*
Creacion de la Fecha
Tarea 3
Daniel Roa
A01021960
*/

public class Fecha{
  private int dia;
  private String mes;

  private int anio;

  private int yr;

  public Fecha(int dia, String mes, int anio, int yr){
    this.dia = dia;
    this.mes = mes;
    this.anio = anio;
    this.yr = yr;
  }

  public void printFechaExp(){
    System.out.println(dia + "/"+mes+"/"+ anio);
  }

  public void printFechaCad(){
    System.out.println(dia + "/" +mes+ "/" + yr);
  }

  public int getDia(){
    return dia;
  }

  public String getMes(){
    return mes;
  }

  public int getAnio(){
    return anio;
  }

  public int getYr(){
    return yr;
  }
}
