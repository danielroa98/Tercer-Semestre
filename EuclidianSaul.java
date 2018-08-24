import java.util.*;

public class EuclidianSaul{
  public static void main(String[] args) {
    int resultado = 0;
    Scanner kb = new Scanner(System.in);
    System.out.println("Ingresa dos numeros");
    int p = kb.nextInt();
    int q = kb.nextInt();

    resultado = gcd(p,q);
    System.out.println(resultado);
  }
  public static int gcd(int p, int q){
    if(q==0){
      return p;
    }
    return gcd(q, p%q);
  }
}
