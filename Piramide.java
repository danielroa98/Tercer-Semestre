/*
Ejercicio Pirámide
Daniel Roa
A01021960
21 de agosto del 2018
*/
import java.util.*;

public class Piramide{
  public static void main(String[] args){

    Scanner lectura = new Scanner(System.in);

    int n;

    System.out.println("Inserta la base de la piramide:");
    n = lectura.nextInt();

    fondo(n);

    System.out.println(" ");

    System.out.println(fondo(n));
  }

  public static int fondo(int n){

    /*if (n == 1) {
      return n;
      System.out.println(fondo(n));
    } else{

      return n + fondo(n-1);

    }*/

    if (n == 1) {
      return n;
    }else;

    //return fondo(n-1);

    System.out.println(fondo(n));

  }
}
