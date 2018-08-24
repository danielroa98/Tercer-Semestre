/*
TAREA 1, SERIES DE TIEMPO
12 de agosto del 2018
Daniel Roa
A01021960
*/
import java.util.*;
import java.util.Arrays;

public class SeriesdeTiempo {
 public static void main(String[] args) {
  Scanner lectura = new Scanner(System.in);

  int cantidad;
  double p, retardo;

  System.out.print("Cuantos valores tiene la serie de tiempo? ");
  cantidad = lectura.nextInt();

  double[] serie = new double[cantidad];

  System.out.println(" ");

  System.out.println("Inserte la serie de tiempo a continuación.");

  System.out.println(" ");

  for (int i = 0; i < serie.length; i++) {
   System.out.printf("Ingresa el valor[%d]: ", i + 1);
   serie[i] = lectura.nextDouble();
  }

  System.out.println(" ");

  System.out.print("Ingrese a continuación el retardo deseado: ");
  p = lectura.nextDouble();

  retardo = p - 1;

  System.out.println(" ");

  System.out.print("Los valores que insertó son: ");
  System.out.println(Arrays.toString(serie));

  System.out.println(" ");

  System.out.println("El retardo que insertó es: " + p);

  if (p > serie.length) {
   System.out.println("El retardo que insertó es muy grande, favor de insertar otro.");
   p = lectura.nextDouble();

   retardo = p - 1;

   System.out.println("El retardo que insertó es: " + p);
  }



  prueba(serie, retardo);

  //prueba(serie, retardo);

 }
 /*public static void tiempo(double[] serie, double retardo) {

  System.out.println(Arrays.toString(serie));

  /*for (int i = 0; i<=retardo; i++) {

    double m = 0;
     i += m;

     serie[i] = m;

     break;
  }
  do {
   for (int j = 0; j <= retardo; j++) {

    if (j <= retardo) {
     int r = 1;
     double res;
     int o ;

     serie[j] += serie[j + r];

     o = serie[j]/retardo;

     r++;

     //System.out.println("Los numeros finales son: "+res);
     //System.out.printf("Prueba exitosa");
    }
   }
   break;
  } while (serie.length >= retardo);

  System.out.println(" ");

  System.out.print("Los numeros son: "+Arrays.toString(serie));

  System.out.println(" ");
}*/

 public static void prueba(double[] serie, double retardo){
   /*
   do {
     for (int j = 0; j <= retardo; j++) {
       serie[j] += serie[j+1];
       if (j > retardo) {
         System.out.println("Te mmste");
       }
     }
   } while (serie.length >= retardo);
   */
   for (int i = 0; i>=retardo; i++) {
     
   }

}
