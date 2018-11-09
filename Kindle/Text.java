/*
 *Daniel Roa
 *A01021960
 *Tarea Kindle
 *28 de octubre del 2018
 */

import java.util.*;

public class Text {
 public static void main(String[] args) {
  Scanner lecturaS = new Scanner(System.in);
  Scanner lecturaI = new Scanner(System.in);

  String titulo;
  String autor;
  int pag;

  int dia;
  String mes;
  int anio;

  String publica;

  String opc;

  System.out.println("**********************");
  System.out.println("******Bienvenido******");
  System.out.println("***Elija una opción***");
  System.out.println("**********************");
  System.out.println("*******1) Libro (l)***\n******2) Revista (r)**");
  opc = lecturaS.nextLine();

  if (opc.equalsIgnoreCase("l")) {

   System.out.println("\nUd. eligió la opción LIBRO\n");

   System.out.println("Cuál es el titulo del libro?");
   titulo = lecturaS.nextLine();
   System.out.println("Quién escribió el libro?");
   autor = lecturaS.nextLine();
   System.out.println("Cuántas páginas tiene?");
   pag = lecturaI.nextInt();
   System.out.println("\nPorfavor, inserte la fecha de publicación.");
   System.out.println("Dia: ");
   dia = lecturaS.nextInt();
   System.out.println("Mes: ");
   mes = lecturaS.next();
   System.out.println("Año: ");
   anio = lecturaI.nextInt();

   Archives ar1 = new Archives(titulo, autor, pag, dia, mes, anio);

   System.out.println(Book.printBookDatos(Book.getTitulo(), Book.getAutor(), Book.getPag(), Book.getDia(), Book.getMes(), Book.getAnio()));

  } else if (opc.equalsIgnoreCase("r")) {

   System.out.println("Ud. eligió la opción REVISTA\n");

   System.out.println("Cuál es el titulo del artículo?");
   titulo = lecturaS.nextLine();
   System.out.println("Quién escribió el artículo?");
   autor = lecturaS.nextLine();
   System.out.println("Donde fue publicado?");
   publica = lecturaS.nextLine();
   System.out.println("Cuando fue publicado?\nDía:");
   dia = lecturaI.nextInt();
   System.out.println("Mes: ");
   mes = lecturaS.nextLine();
   System.out.println("Año: ");
   anio = lecturaI.nextInt();

   Archives ar1 = new Archives(titulo, autor, publica, dia, mes, anio);

  }

 }
}
