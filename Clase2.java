import java.util.*;
import java.util.Arrays;

public class Clase2
{

  static int[] prueba = new int[3];

  public static void main(String[] args)
  {
    //Scanner lectura = new Scanner(System.in);

      push(4);
      push(3);
      push(2);

      System.out.println("El push es: "+ Arrays.toString(prueba));

      pop();

      //boolean p = pop;
  }

  public static void push(int a)
  {

    for (int i = prueba.length-1; i>0; i--)
    {
      prueba[i] = prueba[i-1];
    }
    prueba  [0] = a;
  }

  public static boolean pop()
  {
    int b = prueba[prueba.length-1];
    //int b = prueba[j];
    for (int j = prueba.length-1; j >=1; j--)
    {
      prueba[j] = prueba[j-1];

  }
  prueba[0] = 0;

    System.out.println("El pop es: "+ b +Arrays.toString(prueba));
    return true;
  }

}
