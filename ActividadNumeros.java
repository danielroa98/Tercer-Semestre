import java.util.*;
import java.util.Arrays;

public class ActividadNumeros{
  public static void main(String[] args){

    Scanner lectura = new Scanner(System.in);

    System.out.print("Inserta el número que deseas ver: ");
    int numero = lectura.nextInt();

    System.out.println(" ");

    System.out.println("Siguiente método");

    System.out.println(" ");

    cuadrado(numero);
  }

  public static void cuadrado(int numero){

    for (int i = numero; i>=1; i++) {
      for (int j=0; j > i; j--) {
        System.out.println(Arrays.toString());
      }
    }

  }
}
