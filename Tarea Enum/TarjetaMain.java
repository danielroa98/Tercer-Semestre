/*
Tarea 3, enum
Daniel Roa
A01021960
7 de octubre del 2018
*/

import java.util.*;

public class TarjetaMain{
  public static void main(String[] args) {

    Scanner lectura = new Scanner(System.in);

    String tarjeta;

    /*******Datos Tarjetahabiente****/

    int saldo = 5000;

    /******Fechas*****/

    int dia = 7;
    String mes = "octubre";
    int anio = 2018;

    int yr = anio + 5;
    /*******Tipo de Tarjeta*******/
    System.out.println("Inserte el tipo de tarjeta: ");
    tarjeta = lectura.nextLine();

    System.out.printf("Usted insertó %s\n", tarjeta);

    if (tarjeta.equalsIgnoreCase("CLASICA")) {
      System.out.println("Usted debe tener unos ingresos minimos de $7,500\n Y una anualidad de $699");
    }else

    if (tarjeta.equalsIgnoreCase("ORO")) {
      System.out.println("Usted debe tener unos ingresos minimos de $15,000\n Y una anualidad de $959");
    }else

    if (tarjeta.equalsIgnoreCase("PLATINUM")) {
      System.out.println("Usted debe tener unos ingresos minimos de $45,000\n Y una anualidad de $1,999");
    }else

    if (tarjeta.equalsIgnoreCase("BLACK")) {
      System.out.println("Usted debe tener unos ingresos minimos de $100,000\n Y una anualidad de $4,599");
    }

    TarjetaCredito t1 = new TarjetaCredito(tarjeta, saldo, dia, mes, anio, yr);

    t1.printTarjetaCredito();
  }
}
