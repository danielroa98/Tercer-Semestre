/*
Función Euclidian
Daniel Roa
A01021960
21 de agosto del 2018
*/
import java.util.*;

public class Euclidian{
  public static void main(String[] args){

  Scanner lectura = new Scanner(System.in);

  int demo = 0;

  int q, p;

  System.out.println("Cual es el primer numero?");
  q = lectura.nextInt();

  System.out.println("Cual es el segundo numero?");
  p = lectura.nextInt();

  demo = operacion(q, p);

  System.out.println(" ");

  System.out.println("---Resultado---");

  System.out.println("   "+demo+"   ");

  }

  public static int operacion(int q, int p){

    if (p == 0) {

      return q;

    }
    return operacion(p, q%p);

  }
}
