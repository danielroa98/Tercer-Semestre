/*
Tarea 3, enum
Daniel Roa
A01021960
7 de octubre del 2018
*/

public enum TiposTarjeta{
  CLASICA(7500, 699, 29, 47),
  ORO(15000, 959, 25, 45),
  PLATINUM(45000, 1999, 16, 33),
  BLACK(100000, 4599, 9.9, 26);

  private double ingreso;
  private double anualidad;
  private double max;
  private double min;

  private static final int corte = 28;

  private TiposTarjeta(double ingreso, double anualidad, double max, double min){
    this.ingreso = ingreso;
    this.anualidad = anualidad;
    this.max = max;
    this.min = min;
  }

  private double TasaInteresAnual(){
    double tiie = (corte * 100) / 360;
    double ptos = max - min;
    return tiie + ptos;
  }

  public double InteresMensual(){
    return (TasaInteresAnual()/360)-30;
  }
}
