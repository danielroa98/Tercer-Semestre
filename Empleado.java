public class Empleado{

  private String nombre;
  private String apellidop;
  private String apellidom;
  private int id;
  private int sueldo = 10000;

  private String compara;
  private String a, b, c, d, e, f;

  public Empleado(){

  }

  public Empleado(String nombre, String apellidop, String apellidom, int id, int sueldo){
    this.nombre = nombre;
    this.apellidop = apellidop;
    this.apellidom = apellidom;

    if (id < 1 || id > 1000000) {
      System.out.println("ERROR, verifique de nuevo a su empleado");
    }

    this.id = id;

    if(id < 10000 || id > 10000){
      System.out.println("Usted insertó $"+sueldo);
      System.out.println(" ");
    }else

    this.sueldo = sueldo;

    System.out.println("Los datos insertados pertenecen a "+nombre+" "+apellidop+" "+apellidom+" con el número de empleado de: "+id+" y con un salario de: $"+sueldo+".");
  }

  public Empleado(String compara, String nombre1, String apellidop1, String apellidom1, int id1, int sueldo1){

      if (compara.equalsIgnoreCase("si")) {
        this.nombre = nombre;
        this.apellidop = apellidop;
        this.apellidom = apellidom;

        if (id < 1 || id > 1000000) {
          System.out.println("ERROR, verifique de nuevo a su empleado");
        }

        this.id = id;

        if(id < 10000 || id > 10000){
          System.out.println("Usted insertó $"+sueldo);
        }else if (id == 10000) {
          System.out.println("Usted dejó el salario en: $"+sueldo);
        }

        this.sueldo = sueldo;
      }else
      this.compara = compara;

      System.out.println("Usted escribió "+compara);


    }

    public boolean compara(Empleado e){

      boolean a = false;

      String cagon;

      if (this.id == id || this.sueldo == sueldo) {
        cagon = "Son iguales";
      }else
      cagon = "Son diferentes";

      return a;
    }

}
