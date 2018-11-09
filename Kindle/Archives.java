/*
 *Daniel Roa
 *A01021960
 *Tarea Kindle
 *28 de octubre del 2018
 */

public class Archives {

 /*****Datos generales******/
 protected String titulo;
 protected String autor;

 /*****Dato libro*****/
 protected int pag;

 /**********Datos libro y revista************/
 protected int dia;
 protected String mes;
 protected int anio;

 protected String publica;

 public Archives(String titulo, String autor, int pag, int dia, String mes, int anio) {
  this.titulo = titulo;
  this.autor = autor;
  this.pag = pag;
  this.dia = dia;
  this.mes = mes;
  this.anio = anio;
 }

 public Archives(String titulo, String autor, String publica, int dia, String mes, int anio) {
  this.titulo = titulo;
  this.autor = autor;
  this.publica = publica;
  this.dia = dia;
  this.mes = mes;
  this.anio = anio;
 }

}
