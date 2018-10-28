public class Archives{

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

  public Archives(String titulo, String autor, int pag, int dia, String mes, int anio){
    this.titulo = titulo;
    this.autor = autor;
    this.pag = pag;
    this.dia = dia;
    this.mes = mes;
    this.anio = anio;
  }

  public Archives(String titulo, String autor, String publica, int dia, String mes, int anio){
    this.titulo = titulo;
    this.autor = autor;
    this.publica = publica;
    this.dia = dia;
    this.mes = mes;
    this.anio = anio;
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
}
