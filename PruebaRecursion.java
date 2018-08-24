/*
Prueba Función Recursiva
Daniel Roa
A01021960
21 de agosto del 2018
*/
import java.util.*;

public class PruebaRecursion{
  public static void main(String[] args){

    Scanner lectura = new Scanner(System.in);

    int n;

    System.out.println("Inserta el numero");
    n = lectura.nextInt();

    factorial(n);

    System.out.println(factorial(n));
  }

  public static long factorial(int n){

    if (n == 1) {
      return 1;

    }
    return n * factorial(n-1);

  }
}
