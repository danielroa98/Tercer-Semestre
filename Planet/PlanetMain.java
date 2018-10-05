import java.util.*;

public class PlanetMain{
    public static void main(String[] args) {

      int peso = 70;

      double masa = peso / Planet.TIERRA.Gravedad();

    //  System.out.printf("Tu peso en el planeta %s es de %f\n", Planet.MERCURIO, Planet.MERCURIO.Peso(masa));

      for (Planet p: Planet.values()) {
        System.out.printf("Tu peso en el planeta %s es %f\n", p, p.Peso(masa));
      }

      for (int i = 0; i < 10; i++) {
        System.out.printf("Tu peso en el planeta %s es %f\n", Planet.MERCURIO, Planet.MERCURIO.Peso(masa));
      }

    }
}
