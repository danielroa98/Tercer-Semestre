/*
Matriz
Daniel Roa
A01021960
17 de agosto del 2018
*/
import java.util.*;
import java.util.Arrays;
import java.io.*;

public class EjercicioMatriz{
public static void main(String[] args){

    Scanner lectura = new Scanner(System.in);

    int enter;

    System.out.println("De que tamaño es la longitud?");
    enter = lectura.nextInt();

    //no = (enter*2)-1;

    cuadrado(enter);
  }

  public static void cuadrado(int enter){

    int no, p;

    boolean r = false;

    p = enter;

    no = ((enter*2)-1);

    int[][]valor = new int[no][no];

    for (int a = 0; a <= valor.length-1; a++) {

      valor[a];

     System.out.println(Arrays.toString(valor[a]));

        for (int b = 0; b <= valor.length-1; b++) {

          if (a == b && a != 0) {
            if (a == enter-1) {
              r = true;
            }
            if (r == true) {
              p++;
            }else p--;
          }

          System.out.print(p+ "");

          for (int c = 0; c <= valor.length; c++) {

            System.out.print(p+"");
          }

        }
    }

  }
}
