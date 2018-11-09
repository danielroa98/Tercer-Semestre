public class Empleados{

  private String nombres;
  private String apellidop;
  private String apellidom;
  private int salario;
  private int idEmpleado;
  private String puesto;

  public Empleados(String nombres, String apellidop, String apellidom, int salario, int idEmpleado, String puesto){
    this.nombres = nombres;
    this.apellidop = apellidop;
    this.apellidom = apellidom;
    this.salario = salario;
    this.idEmpleado = idEmpleado;
    this.puesto = puesto;
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

  public int Salario(){
    return salario;
  }

  public int getIdEmpleado(){
    return idEmpleado;
  }

  public String getPuesto(){
    return puesto;
  }
}
