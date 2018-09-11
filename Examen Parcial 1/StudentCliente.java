/*
Daniel Roa González
A01021960
Main, Problema 1
*/
import java.util.*;

public class StudentCliente{
  public static void main(String[] args){
    Scanner lectura = new Scanner(System.in);

    int unidad = 0;

    System.out.println("Inserta el nombre del alumno: ");
    String name = lectura.nextLine();

    System.out.println("Inserta el id del alumno: ");
    int identific = lectura.nextInt();


    Student s1 = new Student(name, identific);

      System.out.println("Inserta la cantidad de unidades:");
      unidad = lectura.nextInt();

    Student s2 = new Student(unidad);

    System.out.println("Usted inserto lo siguiente: ");

    System.out.println(" ");

    System.out.println("Nombre del alumno: "+name);

    System.out.println(" ");

    System.out.println("Id del alumno: "+identific);

    System.out.println(" ");

    System.out.println("Unidades del alumno: "+unidad);

  }
}
