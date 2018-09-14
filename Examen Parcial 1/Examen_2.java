public class Examen_2
{
 public static void main(String[] args)
 {
    //int[] array = {1, -2, 4, -5, 1};
    //calcular2(array,1,1);
    //calcular2(array, 0, 3);
    //calcular2(array,3,4);

    int[] array2 = {5, 1, 4, 5, 6, 7, 8, 12};
    System.out.println(detSecuencia(array2));
 }

   /*
   public static void calcular2(int[] array, int p1, int p2){
     int res = 0;
     for (int i = p1; i <= p2 ; i++) {
         res += array[i];

     }
     System.out.println(res);
   }
   */

  public static int detSecuencia(int[] array){
    int cont = 0;

    for (int i = 0;i < array.length -1 ; i++) {
      if (array[i] + 1 == array[i + 1] ) {
        System.out.print(array[i] + " ");
        cont ++;
      }
    }
    System.out.println();
    return cont + 1;
  }
}
