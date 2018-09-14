import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class ExamenA
{
  static int[] y = new int[6];
  static int suma=0;
  public static void main(String [] args)
  {
    int x[] = {1,3,5,6,7,9};
    ordenar(x);
    longitud(y);
  }

    public static void ordenar (int [] x)
    {
      for (int i=0 ; i<x.length-1 ; i++ )
      {
        int c=x[i];
        if (x[i+1] == c+1) {
          y[i]=c;
          suma=suma+1;
        }
      }
        System.out.println(Arrays.toString(y));
    }

    static void longitud (int [] x)
    {
      System.out.println("longitud: "+suma);
    }

}
