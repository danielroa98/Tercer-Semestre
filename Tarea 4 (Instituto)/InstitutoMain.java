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

    int opcion, students, elimina;

    /***************Datos de los alumnos***********/

    String nombres;
    String apellidop;
    String apellidom;

    /***********Creacion del ArrayList************/

    ArrayList<Alumnos> grupo = new ArrayList<Alumnos>();

    /*************Menu Principal**************/

    System.out.println("\nBienvenid@ al sistema!");

    System.out.println(" ");

    System.out.println("***************************");

    System.out.println("*******Menu Principal******");

    System.out.println("***************************");

    System.out.println(" ");

    System.out.println("1) Ingresar un nuevo candidato\n2) Eliminar un candidato existente\n3) Ver la lista de candidatos actuales");
    opcion = lecturaI.nextInt();

    System.out.println(" ");

    System.out.println("Usted eligió la opción "+opcion);

    /*********Lista predeterminada*************/

    Alumnos a1 = new Alumnos("Luis Daniel", "Roa", "Gonzalez");

    Alumnos a2 = new Alumnos("Christian Alberto", "Dalma", "Schulz");

    Alumnos a3 = new Alumnos("Luis Armando", "Ortiz", "Revilla");

    grupo.add(0, a1);
    grupo.add(0, a2);
    grupo.add(0, a3);

    /***********Inician las instrucciones de cada menu********/


    /*******************AGREGA CANDIDATOS NUEVOS************/
    if (opcion == 1) { //agrega candidatos

      System.out.println("Cuantos alumnos desea añadir?");
      students = lecturaI.nextInt();


      for (int cont = 0; cont <= students; cont++) {

        System.out.println("");

        grupo.add(0, a1);
      } //for usado para añadir la cantidad deseada de alumnos al sistema

      System.out.println("\nLa lista actualizada es la siguiente: ");

      for (int i = 0; i < grupo.size(); i++) {

        System.out.printf("\nAplicante no. "+ (i+1) +"\nNombres: " + grupo.get(i).getNombres() + "\nApellido Paterno: "+grupo.get(i).getApellidoP()+"\nApellido Materno: "+grupo.get(i).getApellidoM() +"\n");

      }

    }else

    /************ELIMINACION DE CANDIDATOS**********/

      if (opcion == 2) { //elimina candidatos

      System.out.println("\nQue canidato desea eliminar?");
      elimina = lecturaI.nextInt();

      grupo.remove(elimina);

      System.out.println("\nLa lista actualizada es la siguiente: ");

      for (int i = 0; i < grupo.size(); i++) {

        System.out.printf("\nAplicante #"+ (i+1) +"\nNombres: " + grupo.get(i).getNombres() + "\nApellido Paterno: "+grupo.get(i).getApellidoP()+"\nApellido Materno: "+grupo.get(i).getApellidoM() +"\n");

      }

    }else

    /**********************VISUALIZACION DE LA LISTA DE ALUMNOS**********/

      if (opcion == 3) { //visualiza la lista

      System.out.println("\nLa lista de candidatos es la siguiente: ");

        for (int i = 0; i < grupo.size(); i++) {

          System.out.printf("\nAplicante #"+ (i+1) +"\nNombres: " + grupo.get(i).getNombres() + "\nApellido Paterno: "+grupo.get(i).getApellidoP()+"\nApellido Materno: "+grupo.get(i).getApellidoM() +"\n");

        }

    }else

    /**********CICLO POR SI EL USUARIO SE CONFUNDE*******************/

    if (opcion != 1 || opcion != 2 || opcion != 3) {
      System.out.println("Esa opción no existe");

      System.out.println("\n Adios");
    } //CICLO IF EN CASO QUE EL USUARIO INSERTE UN VALOR INEXISTENTE


  }
}
