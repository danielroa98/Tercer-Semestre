/*
 * Tarea 4, Instituto Educativo con ArrayList
 * Daniel Roa
 * A01021960
 * 13 de octubre del 2018
 */

import java.util.*;
import java.util.ArrayList;

public class InstitutoMain {
 public static void main(String[] args) {
  Scanner lecturaS = new Scanner(System.in); //Scanner Strings
  Scanner lecturaI = new Scanner(System.in); //Scanner Ints

  int opcion, students, elimina;

  /***************Datos de los alumnos***********/

  String nombres;
  String apellidop;
  String apellidom;

  /***********Creacion del ArrayList************/

  ArrayList < Alumnos > grupo = new ArrayList < Alumnos > ();

  /*************Menu Principal**************/

  System.out.println("\nBienvenid@ al sistema!");

  System.out.println(" ");

  System.out.println("***************************");

  System.out.println("******MENU  PRINCIPAL******");

  System.out.println("***************************");

  System.out.println(" ");

  System.out.println("1) Ingresar un nuevo candidato\n2) Eliminar un candidato existente\n3) Ver la lista de candidatos actuales");
  opcion = lecturaI.nextInt();

  System.out.println(" ");

  /*********Lista predeterminada*************/

  Alumnos a5 = new Alumnos("Christian Alberto", "Dalma", "Schulz");
  Alumnos a4 = new Alumnos("Luis Armando", "Ortiz", "Revilla");
  Alumnos a3 = new Alumnos("Luis Daniel", "Roa", "Gonzalez");
  Alumnos a2 = new Alumnos("Miriam", "Perez", "de Haro");
  Alumnos a1 = new Alumnos("Rodrigo", "Roa", "Gonzalez");

  grupo.add(0, a1);
  grupo.add(0, a2);
  grupo.add(0, a3);
  grupo.add(0, a4);
  grupo.add(0, a5);

  /***********Inician las instrucciones de cada menu********/


  /*******************AGREGA CANDIDATOS NUEVOS************/
  if (opcion == 1) { //agrega candidatos

   System.out.println("Usted eligió la opción " + opcion + "\nAgregar nuevo candidato");

   System.out.println("\nCuál es el nombre del alumno?");
   nombres = lecturaS.nextLine();

   System.out.println("\nCuál es su apellido paterno?");
   apellidop = lecturaS.nextLine();

   System.out.println("\nCuál es su apellido materno?");
   apellidom = lecturaS.nextLine();

   Alumnos a6 = new Alumnos(nombres, apellidop, apellidom);

   grupo.add(0, a6);

   System.out.println("\nLa lista actualizada es la siguiente: ");

   for (int i = 0; i < grupo.size(); i++) {

    System.out.printf("\nAplicante no. " + (i + 1) + "\nNombres: " + grupo.get(i).getNombres() + "\nApellido Paterno: " + grupo.get(i).getApellidoP() + "\nApellido Materno: " + grupo.get(i).getApellidoM() + "\n");

   }

  } else

   /************ELIMINACION DE CANDIDATOS**********/

   if (opcion == 2) { //elimina candidatos

    System.out.println("Usted eligió la opción " + opcion + "\nEliminar un candidato");

    System.out.println("\nQue canidato desea eliminar?");
    elimina = lecturaI.nextInt();

    grupo.remove(elimina);

    System.out.println("\nLa lista actualizada es la siguiente: ");

    for (int i = 0; i < grupo.size(); i++) {

     System.out.printf("\nAplicante #" + (i + 1) + "\nNombres: " + grupo.get(i).getNombres() + "\nApellido Paterno: " + grupo.get(i).getApellidoP() + "\nApellido Materno: " + grupo.get(i).getApellidoM() + "\n");

    }

   } else

    /************VISUALIZACION DE LA LISTA DE ALUMNOS**********/

    if (opcion == 3) { //visualiza la lista

     System.out.println("Usted eligió la opción " + opcion + "\nVer vista de candidatos");

     System.out.println("\nLa lista de candidatos es la siguiente: ");

     for (int i = 0; i < grupo.size(); i++) {

      System.out.printf("\nAplicante #" + (i + 1) + "\nNombres: " + grupo.get(i).getNombres() + "\nApellido Paterno: " + grupo.get(i).getApellidoP() + "\nApellido Materno: " + grupo.get(i).getApellidoM() + "\n");

     }

    } else

     /**********CICLO POR SI EL USUARIO SE CONFUNDE*******************/

     if (opcion != 1 || opcion != 2 || opcion != 3) {
      System.out.println("Esa opción no existe");

      System.out.println("\n Adios");
     } //CICLO IF EN CASO QUE EL USUARIO INSERTE UN VALOR INEXISTENTE

  System.out.println("\nGracias por usar el sistema!");

 }
}
