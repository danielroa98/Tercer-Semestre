/*
Tarea 3, enum
Daniel Roa
A01021960
7 de octubre del 2018
*/

public class TarjetaCredito{

  //Tipo de tarjeta
  private String tC;

  private int numero;

  private static int noTarjeta = 123456789; //contador para los numeros de la tarjeta

  private int saldo;

  private Fecha fExpedicion;

  private Fecha fCaducidad;

  public TarjetaCredito(String tC, int saldo,int dia, String mes, int anio, int yr){
    noTarjeta++;
    this.numero = noTarjeta;
    this.tC = tC;
    this.saldo = saldo;
    this.fExpedicion = new Fecha(dia, mes, anio, yr);
  }

  public void printTarjetaCredito(){
    System.out.printf("Tipo de tarjeta: %s\nNumero de tarjeta: %d\nSaldo actual: %d\n", tC, numero, saldo);

    System.out.print("Fecha de expedicion: ");fExpedicion.printFechaExp();

    fCaducidad.printFechaCad();
  }

}
