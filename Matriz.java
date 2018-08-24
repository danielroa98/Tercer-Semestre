/*
Arreglos en 2 Dimensiones
14 de agosto del 2018
Daniel Roa
A01021960
*/
public class Matriz{

  public static void main(String[] args){

  int[][] matriz = new int[3][4];

  /*
  0 0 0 0
  0 0 0 0
  0 0 0 0
  */

  //int[][] matriz = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};

  /*
  1 2 3 4
  5 6 7 8
  9 10 11 12
  */

  for (int i= 0; i < matriz.length; i++) {

    for (int j = 0; j < matriz[i].length; j++) {
      System.out.print(matriz[i][j]);
      System.out.println();
      }
    }


  }
}
