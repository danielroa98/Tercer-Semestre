import java.util.*;

public class Arreglos{
  public static void main(String[] args){
    Scanner lectura = new Scanner(System.in);

    System.out.println("Inserta el tamaño de tu arreglo;");
    int n = lectura.nextInt();

    System.out.println("De que tamaño desea que sea su sub arreglo?");
    int m = lectura.nextInt();

    if (n > 100000 || n < 1) {
      System.out.println("Compruebe de nuevo la cantidad de su arreglo");
    }else if (n <= 100000 && n >= 1) {
      System.out.println("El tamaño de su arreglo esta bien");
    }

    if (m > n) {
      System.out.println("ERROR");
    }else if (m <= n) {
      System.out.println("Todo bien");
    }

    int[] matrix = new int[n];

    for (int i = 0; i <= (n-1); i++) {

      System.out.println("Inserta los numeros de su arreglo");
      matrix[i] = lectura.nextInt();

      System.out.println("Valores insertados (demo): "+matrix[i]);

    }


  }

}
