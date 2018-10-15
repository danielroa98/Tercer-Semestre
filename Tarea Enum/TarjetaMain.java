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
    Scanner lecturaInt = new Scanner(System.in);

    /*******Datos Tarjetahabiente****/

    String tarjeta;
    int saldo;

    /******Fechas*****/

    int dia;
    String mes;
    int anio;

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

    System.out.println(" ");

    System.out.println("Cuál es el saldo actual de la tarjeta?");
    saldo = lecturaInt.nextInt();

    System.out.println();

    System.out.println("Escriba la fecha a continuación, por favor, que el mes no este escrito de manera numerica");

    System.out.print("Dia: ");
    dia = lecturaInt.nextInt();
    System.out.print("Mes: ");
    mes = lectura.nextLine();
    System.out.print("Año: ");
    anio = lecturaInt.nextInt();

    int diaC = dia;

    String mesC = mes;

    int yr = anio + 5;

    TarjetaCredito t1 = new TarjetaCredito(tarjeta, saldo, dia, mes, anio, diaC, mesC, yr);

    t1.printTarjetaCredito();
  }
}
