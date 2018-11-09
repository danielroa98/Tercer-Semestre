/*
 *Daniel Roa
 *A01021960
 *Tarea Kindle
 *28 de octubre del 2018
 */

public class Book extends Archives {

 public Book(String titulo, String autor, int pag, int dia, String mes, int anio) {
  super(titulo, autor, pag, dia, mes, anio);
 }

 public static String getTitulo() {
  return titulo;
 }

 public static String getAutor() {
  return autor;
 }

 public static int getPag() {
  return pag;
 }

 public static int getDia() {
  return dia;
 }

 public static String getMes() {
  return mes;
 }

 public int getAnio() {
  return anio;
 }

 public static printBookDatos(String titulo, String autor, int pag, int dia, String mes, int anio) {

  System.out.println("\nEl titulo del libro es: "+titulo+"\nEl autor es: "+autor+"\nTiene "+pag+" paginas.\n\nFue publicado el "+dia+"/"+mes+"/"+anio);

 }

}
