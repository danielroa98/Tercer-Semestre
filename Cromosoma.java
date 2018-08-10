import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Cromosoma
{
  public static void main(String[] args)
  {
    Scanner lectura = new Scanner(System.in);

    String input;

    System.out.println("Ingrese la secuencia de cromosomas: ");
    input = lectura.nextLine();

    calcular(input);//el valor de input se pasará a la siguiente función llamada calcular
  }

  public static void calcular(String input) //se importa el valor del "input" que se declaró con anterioridad
  {
    char c_adn, c_input;
    int porcentaje = 0;
    int indice = -1;
    int max = 0;
    int suma = 0;
    String adn[] = {"00000101010101010101", "00101010101101110111", "00100010010000001001"};

    for (int i = 0; i < adn.length; i++)
    {
    String secuencia = adn[i];
    suma = 1;

      for (int j = 0; j < secuencia.length(); j++)
        {
          c_adn = secuencia.charAt(j);
          c_input = input.charAt(j);

            if (c_adn == c_input)
            {
              suma = suma + 1;
            }
        }
    }
  }
}
