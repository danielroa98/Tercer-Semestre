/*
* Tarea 4, Instituto Educativo con ArrayList
* Daniel Roa
* A01021960
* 13 de octubre del 2018
*/

import java.util.*;
import java.util.ArrayList;

public class InstitutoMain{
  public static void main(String[] args) {
    Scanner lecturaS = new Scanner(System.in); //Scanner Strings
    Scanner lecturaI = new Scanner(System.in); //Scanner Ints

    int opcion;

    ArrayList<Alumnos> alumno = new ArrayList<Alumnos>();

    System.out.println("Bienvenid@ al sistema!");

    System.out.println(" ");

    System.out.println("Que opción desea hacer hoy?");

    System.out.println(" ");

    System.out.println("1) Ingresar un nuevo candidato\n2) Eliminar un candidato existente\n3) Ver la lista de candidatos actuales");
    opcion = lecturaI.nextInt();

    System.out.println(" ");

    System.out.println("Usted eligió la opción "+opcion);


    //Alumnos a1 = new Alumnos();

  }
}
