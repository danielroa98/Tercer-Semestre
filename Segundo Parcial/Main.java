/*
 *Examen Parcial 2
 *Daniel Roa
 *A01021960
 *23 de octubre del 2018
 */


import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner lecturaI = new Scanner(System.in);
    Scanner lecturaS = new Scanner(System.in);

    String nombre, apellidoP, apellidoM, tipo;

    int sel;

    /**************FECHA nacimiento************************/

    int diaN;
    int mesN;
    int anioN;

    /***********FECHA INSCRIPCION***********************/

    int dia = 1;
    int mes = 3;
    int anio = 2012;

    ArrayList <Materias> materia = new ArrayList <Materias>();


    System.out.println("\n.---------MENU-PRINCIPAL-----------.");
    System.out.println(".----------------------------------.");
    System.out.println("-Escoga una opcion (solo el numero)-");
    System.out.println("-1) Alumno Regular-\n-2)Alumno Becario\n-3)Alumno Intercambio");
    sel = lecturaI.nextInt();

    if (sel == 1) {

      tipo = "Regular";

      System.out.println("Inserte los siguientes datos: ");
      System.out.println("Nombre: ");
      nombre = lecturaS.nextLine();
      System.out.println("Apellido Paterno: ");
      apellidoP = lecturaS.nextLine();
      System.out.println("Apellido Materno: ");
      apellidoM = lecturaS.nextLine();

      System.out.println("\n\nDia de nacimiento: ");
      diaN = lecturaI.nextInt();
      System.out.println("\nMes de nacimiento: ");
      mesN = lecturaI.nextInt();
      System.out.println("\nAño de nacimiento: ");
      anioN = lecturaI.nextInt();

      Alumno a1 = new Alumno(tipo, nombre, apellidoP, apellidoM, diaN, mesN, anioN, dia, mes, anio);



      //Materias

    }else //fin primer if

    if (sel == 2) {

            tipo = "Becario";

            System.out.println("Inserte los siguientes datos: ");
            System.out.println("Nombre: ");
            nombre = lecturaS.nextLine();
            System.out.println("Apellido Paterno: ");
            apellidoP = lecturaS.nextLine();
            System.out.println("Apellido Materno: ");
            apellidoM = lecturaS.nextLine();

            System.out.println("\n\nDia de nacimiento: ");
            diaN = lecturaI.nextInt();
            System.out.println("\nMes de nacimiento: ");
            mesN = lecturaI.nextInt();
            System.out.println("\nAño de nacimiento: ");
            anioN = lecturaI.nextInt();

            System.out.println("\n\nDia de INSCRIPCION: ");
            dia = lecturaI.nextInt();
            System.out.println("\nMes de INSCRIPCION: ");
            mes = lecturaI.nextInt();
            System.out.println("\nAño de INSCRIPCION: ");
            anio = lecturaI.nextInt();


            Alumno a1 = new Alumno(tipo, nombre, apellidoP, apellidoM, diaN, mesN, anioN, dia, mes, anio);


    }else

    if (sel == 3) {

            tipo = "Intercambio";

            System.out.println("Inserte los siguientes datos: ");
            System.out.println("Nombre: ");
            nombre = lecturaS.nextLine();
            System.out.println("Apellido Paterno: ");
            apellidoP = lecturaS.nextLine();
            System.out.println("Apellido Materno: ");
            apellidoM = lecturaS.nextLine();

            System.out.println("\n\nDia de nacimiento: ");
            diaN = lecturaI.nextInt();
            System.out.println("\nMes de nacimiento: ");
            mesN = lecturaI.nextInt();
            System.out.println("\nAño de nacimiento: ");
            anioN = lecturaI.nextInt();

            System.out.println("\n\nDia de INSCRIPCION: ");
            dia = lecturaI.nextInt();
            System.out.println("\nMes de INSCRIPCION: ");
            mes = lecturaI.nextInt();
            System.out.println("\nAño de INSCRIPCION: ");
            anio = lecturaI.nextInt();


            Alumno a1 = new Alumno(tipo, nombre, apellidoP, apellidoM, diaN, mesN, anioN, dia, mes, anio);
    }
  }
}
