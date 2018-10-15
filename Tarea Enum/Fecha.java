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

  private int diaC;
  private String mesC;
  private int yr;

  public Fecha(int dia, String mes, int anio, int diaC, String mesC, int yr){
    this.dia = dia;
    this.mes = mes;
    this.anio = anio;

    this.dia = diaC;
    this.mes = mesC;
    this.yr = yr;
  }

  /*public Fecha(int diaC, String mesC, int yr){
    this.dia = diaC;
    this.mes = mesC;
    this.yr = yr;
  }*/

  public void printFechaExp(){
    System.out.println(dia + "/"+mes+"/"+ anio);
  }

  public void printFechaCad(){
    System.out.println(diaC + "/" +mesC+ "/" + yr);
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

  public int getDiaC(){
    return diaC;
  }

  public String getMesC(){
    return mesC;
  }

  public int getYr(){
    return yr;
  }
}
