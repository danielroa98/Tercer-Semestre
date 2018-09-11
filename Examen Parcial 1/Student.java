/*
Daniel Roa González
A01021960
Problema 1
*/

public class Student{
  private String nombre;
  private int id;
  private int unidades = 0;

  public Student(){

  }

  public Student(String nombre, int id){
    this.nombre = nombre;
    this.id = id;

    //System.out.println(nombre+" "+id); //PRINT PARA PROBAR COMO SE ARCHIVAN LOS DATOS
  }

  public String getName(){
    return nombre;
  }

  public int getId(){
    return id;
  }


  public Student(int unidades){

    this.unidades = unidades;

    String a;

    if (this.unidades == 180) {
     System.out.println("El alumno se puede graduar.");
   }else if (this.unidades < 180) {
      System.out.println("Al alumno le faltan unidades para graduarse.");
    }

    System.out.println(" ");

  }

  public int getUnidades(){
    return unidades;
  }

  /*public Student Imprime(Student s){
    Student imprime = new Student(this.nombre, this.id, this.unidades);
    return imprime;
  }*/ //no pude hacer que funcionara


}
