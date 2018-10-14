/*
Clase; ArrayList
Daniel Roa
A01021960
9 de octubre del 2018
*/
public class Book{

  private String titulo;
  private String author;
  private int paginas;

  public Book(String titulo, String author, int paginas){
    this.titulo = titulo;
    this.author = author;
    this.paginas = paginas;
  }

  public String getTitulo(){
    return titulo;
  }

  public String getAuthor(){
    return author;
  }

  public int getPaginas(){
    return paginas;
  }
}
