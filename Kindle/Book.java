public class Book extends Archives{

   public Book(String titulo, String autor, int pag, int dia, String mes, int anio){
     super(titulo, autor, pag, dia, mes, anio);
  }

  public String getTitulo(){
    return titulo;
  }

  public String getAutor(){
    return autor;
  }

  public int getPag(){
    return pag;
  }

  public int getDia(){
    return dia;
  }

  public String getMes(){
    return mes;
  }

  public int getAnio(){
    return anio;
  }

  public void printBook(){

    System.out.println("El libro "+titulo+" escrito por "+autor+" con páginas "+pag+".");

    System.out.println("Fue publicado en "+dia+"/"+mes+"/"+anio);

  }
}
