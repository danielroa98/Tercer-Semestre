import java.util.*;

public class EmpleadoCliente{
  public static void main(String[] args){
    Scanner lectura = new Scanner(System.in);
    Scanner prueba = new Scanner(System.in);

    int suel = 10000;

    int suel1 = 10000;

    String confirm;

    System.out.println(" ");

    System.out.println("Como se llama el empleado?");
    String nom = lectura.nextLine();

    System.out.println(" ");

    System.out.println("Cuál es su apellido paterno?");
    String apep = lectura.nextLine();

    System.out.println(" ");

    System.out.println("Cuál es su apellido materno?");
    String apem = lectura.nextLine();

    System.out.println(" ");

    System.out.println("Cuál es su número de identificación?");
    int iden = lectura.nextInt();

    System.out.println(" ");

    System.out.println("Desea cambiar el salario de su empleado?");
    confirm = lectura.next();

    if (confirm.equalsIgnoreCase("si")) {
      System.out.println("Cual será el nuevo salario?");
      suel = lectura.nextInt();
    }

    System.out.println(" ");

    Empleado e1 = new Empleado(nom, apep, apem, iden, suel);

    System.out.println(" ");

    System.out.println("Desea comparar dos empleados?");
    String comparador = lectura.next();

    System.out.println(" ");

    if (comparador.equalsIgnoreCase("si")) {
      System.out.println("Como se llama el nuevo empleado?");
      String nom1 = lectura.next();

      System.out.println(" ");

      System.out.println("Cuál es el apellido paterno?");
      String apep1 = lectura.next();

      System.out.println(" ");

      System.out.println("Cuál es el apellido materno?");
      String apem1 = lectura.next();

      System.out.println(" ");

      System.out.println("Cuál es el número de identificación?");
      int iden1 = prueba.nextInt();

      System.out.println(" ");

      System.out.println("Cual es el salario?");
      suel1 = prueba.nextInt();

      System.out.println(" ");

      Empleado e3 = new Empleado(comparador, nom1, apep1, apem1, iden1, suel1);

    }

  }

}
