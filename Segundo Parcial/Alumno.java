/*
 *Examen Parcial 2
 *Daniel Roa
 *A01021960
 *23 de octubre del 2018
 */

class AlumnoRegular extends Alumno{
  super(tipo, nombre, apellidoP, apellidoM, diaN, mesN, anioN);
  System.out.println();
}


public class Alumno{

  private String tipo;
  private String nombre;
  private String apellidoP;
  private String apellidoM;
  private int diaN;
  private int mesN;
  private int anioN;
  private Fecha f1;

  public Alumno(String tipo, String nombre, String apellidoP, String apellidoM, int diaN, int mesN, int anioN, int dia, int mes, int anio){
    this.tipo = tipo;
    this.nombre = nombre;
    this.apellidoP = apellidoP;
    this.apellidoM = apellidoM;
    this.diaN = diaN;
    this.mesN = mesN;
    this.anioN = anioN;
    this.f1 = new Fecha(dia, mes, anio);
  }

  public String getTipo(){
    return tipo;
  }

  public String getNombre(){
    return nombre;
  }

  public String getApellidoP(){
    return apellidoP;
  }

  public String getApellidoM(){
    return apellidoM;
  }

  public int getDiaN(){
    return diaN;
  }

  public int getMesN(){
    return mesN;
  }

  public int getAnioN(){
    return anioN;
  }

  public String imprimeDatos(){
    return String.format(tipo+", "+nombre+", "+apellidoP+", "+apellidoM+", "+diaN+", "+mesN+", "+", "+anioN);
  }

  public
}
