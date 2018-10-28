/*
 *Examen Parcial 2
 *Daniel Roa
 *A01021960
 *23 de octubre del 2018
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

  public String toString(){
    return String.format("2%d/%2d/%d", dia, mes, anio);
  }
}
