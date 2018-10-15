/*
Tarea 3, enum
Daniel Roa
A01021960
7 de octubre del 2018
*/

public class TarjetaCredito{

  //Tipo de tarjeta
  private String tarjetaC;

  private int numero;

  private static int noTarjeta = 123456789; //contador para los numeros de la tarjeta

  private int saldo;

  private Fecha fExpedicion;

  private Fecha fCaducidad;

  public TarjetaCredito(String tarjetaC, int saldo,int dia, String mes, int anio, int diaC, String mesC, int yr){
    noTarjeta++;
    this.numero = noTarjeta;
    this.tarjetaC = tarjetaC;
    this.saldo = saldo;
    this.fExpedicion = new Fecha(dia, mes, anio, diaC, mesC, yr);
    //this.fExpiracion = new Fecha(dia, mes, yr);
  }

  public void printTarjetaCredito(){
    System.out.printf("Tipo de tarjeta: %s\nNumero de tarjeta: %d\nSaldo actual: %d\n", tarjetaC, numero, saldo);

    System.out.print("Fecha de expedicion: ");fExpedicion.printFechaExp();

    fCaducidad.printFechaCad();
  }

}
