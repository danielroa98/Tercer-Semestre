/*
 *Daniel Roa
 *A01021960
 *Tarea Kindle
 *28 de octubre del 2018
 */

public class Mag extends Archives {

 public Mag(String titulo, String autor, String publica, int dia, String mes, int anio) {
  super(titulo, autor, publica, dia, mes, anio);
 }

 public String getTitulo() {
  return titulo;
 }

 public String getAutor() {
  return autor;
 }

 public String getPublica() {
  return publica;
 }

 public int getDia() {
  return dia;
 }

 public String getMes() {
  return mes;
 }

 public int getAnio() {
  return anio;
 }

 public void printMag() {

  System.out.println("El libro " + titulo + " escrito por " + autor + " publicado por: " + publica + ".");

  System.out.println("Fue publicado en " + dia + "/" + mes + "/" + anio);

 }

}
