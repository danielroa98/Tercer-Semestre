/*
Daniel Roa
14 de Septiembre del 2018
Ejercicio de Recuperación
Examen A, Ejercicio 2
*/

import java.util.*;

public class Recuperacion {

 public static void main(String[] args) {
  Scanner lectura = new Scanner(System.in);

  int sum = 0;

  System.out.println("De que tamaño desea que sea su arreglo?");
  int ar = lectura.nextInt();

  int[] array = new int[ar];

  for (int i = 0; i <= (ar - 1); i++) {
   System.out.println("Inserta el valor " + (i) + " a continuación");
   array[i] = lectura.nextInt();
  }

  System.out.println(" ");

  System.out.println(intentoSecuencia(array));

 }

 public static int intentoSecuencia(int[] array) {
  int contador = 0;

  for (int i = 0; i < array.length - 1; i++) {

   if (array[i] + 1 == array[i + 1]) {

    System.out.print(array[i] + " ");
    contador++;

   }
  }

  System.out.println();

  return contador;
 }

}
