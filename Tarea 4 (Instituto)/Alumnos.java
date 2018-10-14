/*
* Tarea 4, Instituto Educativo con ArrayList
* Daniel Roa
* A01021960
* 13 de octubre del 2018
*/

public class Alumnos{

  private String nombres;
  private String apellidop;
  private String apellidom;

  public Alumnos(String nombres, String apellidop, String apellidom){
    this.nombres = nombres;
    this.apellidop = apellidop;
    this.apellidom = apellidom;
  }

  public String getNombres(){
    return nombres;
  }

  public String getApellidoP(){
    return apellidop;
  }
  public String getApellidoM(){
    return apellidom;
  }
}
