/*
Clase; ArrayList
Daniel Roa
A01021960
9 de octubre del 2018
*/
import java.util.ArrayList;

public class Main{
  public static void main(String[] args) {
    //ArrayList<Int> name = new ArrayList<Integer>();

    ArrayList<Book> kindle = new ArrayList<Book>();//se inserta el tipo de dato que se desea almacenar

    ArrayList<Integer> numeros = new ArrayList<Integer>();

    Book b1 = new Book("Sistemas Operativos Modernos", "Tanenbaum Andrews", 1071);

    Book b2 = new Book("The October Country", "Bradbury Ray", 347);

    Book b3 = new Book("Eragon", "Paolini Christopher", 648);

    Book b4 = new Book("Fahrenheit 451", "Bradbury Ray", 174);

    //kindle.add(b1);       //que solo añada el objeto al ArrayList
    kindle.add(0, b1);    //añade el objeto a la posicion "0" del ArrayList
    kindle.add(0, b2);
    kindle.add(0, b3);
    kindle.add(0, b4);

    for (int i = 0; i < kindle.size(); i++) {

      System.out.println("Libro " + (i+1) + ": " + kindle.get(i).getTitulo() + ", " + kindle.get(i).getAuthor() +", "+ "total de páginas: "+kindle.get(i).getPaginas());

    }


      kindle.remove(2); //Elimina elemntos del array list

      System.out.println(" ");

      System.out.println("IMPRIMIENDO DESPUÉS DE ELIMINAR EL SEGUNDO LIBRO");

      System.out.println("");

    for (int i = 0; i < kindle.size(); i++) {

      System.out.println("Libro " + (i+1) + ": " + kindle.get(i).getTitulo() + ", " + kindle.get(i).getAuthor() +", "+ "total de páginas: "+kindle.get(i).getPaginas());

    }

    numeros.add(0);
    numeros.add(1);
    numeros.add(2);
    numeros.add(3);
    numeros.add(4);

    System.out.println();
    for (int i = 0; i < numeros.size(); i++) {
      System.out.println(numeros.get(i));
    }
  }
}
