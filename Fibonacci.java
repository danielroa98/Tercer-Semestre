/*
Daniel Roa
Material de estudio
Sucesión de Fibonacci
23 de agosto de 2018
*/

import java.util.*;

public class Fibonacci {
 public static void main(String[] args) {

  Scanner lectura = new Scanner(System.in);

  int n;

  int resultado = 0;

  System.out.println("Hasta que numero quieres que llegue?");
  n = lectura.nextInt();

  resultado = operando(n);

  System.out.println(" ");

  System.out.println("La sucesión es: ");

  System.out.println(" ");

  for (int i = 0; i <= n; i++) {
   System.out.print(operando(i) + ", ");

  }

 }
 public static int operando(int n) {

  if (n == 0) {
   return 0;
  } else if (n == 1) {
   return 1;
  } else
   return operando(n - 1) + operando(n - 2);

 }
}
