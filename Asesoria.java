/*
Programa hecho para imprimir un cuadrado rodeado de numeros por input
Daniel Roa
A01021960
23 de agosto del 2018
*/
import java.util.*;

public class Asesoria{
  public static void main(String[] args){

    Scanner lectura = new Scanner(System.in);

    System.out.println("Ingresa el digito que deseas construir: ");
    int a = lectura.nextInt();

    int n = (a*2)-1;

    int [][] spiral = new int[n][n];

    for (int j = 0; j<n; j++) {
      for (int k=j; k<n-j; k++) {
        spiral[j][k] = a;
        spiral[n-(j+1)][k] = a;

      }

      for (int k=j+1; k<n-(j+1); k++) {
        spiral[k][j] = a;
        spiral[k][n-(j+1)] = a;
      }
      a--;
    }

    for (int j = 0; j<spiral.length; j++) {
        System.out.println(Arrays.toString(spiral[j]));
    }
  }
}
