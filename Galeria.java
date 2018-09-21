public class Galeria{

  private int id;
  private String nombreP;
  private String comprador;
  private int costo;
  private int pagado;
  private int dia;
  private String mes;
  private int anio;

  public Galeria(){

  }

  public Galeria(int id, String nombreP, String comprador, int costo, int pagado){
    this.id = id;
    this.nombreP = nombreP;
    this.comprador = comprador;
    this.costo = costo;
    this.pagado = pagado;

    int faltante = costo - pagado;

    System.out.println(" ");

    System.out.println("La pintura "+nombreP+" con el id de "+id+" fue adquirida por "+comprador+" por un monto de $"+pagado+" pesos. El precio original de la pintura es de $"+costo+" pesos.");

    if (faltante <= costo || faltante > 0) {
      System.out.println(" ");
      System.out.println("Falta un total de $"+faltante+" pesos.");
    }

  }

  public int retId(){
    return id;
  }

  public String retNombre(){
    return nombreP;
  }

  public String retComprador(){
    return comprador;
  }

  public int retCosto(){
    return costo;
  }

  public int retPagado(){
    return pagado;
  }

  public Galeria(int dia, String mes, int anio){
    this.dia = dia;
    this.mes = mes;
    this.anio = anio;

    System.out.println(" ");

    System.out.println("La transacción se realizó en el día "+dia+" del mes "+mes+" del año "+anio+".");
  }

  public int retDia(){
    return dia;
  }

  public String retMes(){
    return mes;
  }

  public int retAnio(){
    return anio;
  }

}
