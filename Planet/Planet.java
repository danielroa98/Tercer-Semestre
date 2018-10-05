/*
  Enum, ejemplo 2
  Daniel Roa
  A01021960
  5 de octubre del 2018
*/

public enum Planet{

  //Creación de objetos

  MERCURIO(3.303e+23, 2.4397e6),
  VENUS(3.303e+23, 2.4397e6),
  TIERRA(3.303e+23, 2.4397e6),
  MARTE(3.303e+23, 2.4397e6),
  JUPITER(3.303e+23, 2.4397e6),
  SATURNO(3.303e+23, 2.4397e6),
  URANO(3.303e+23, 2.4397e6),
  NEPUTNO(3.303e+23, 2.4397e6);

  //Finaliza la creación de objetos

    private double masa;
    private double radio;

    private static final double G = 6.67300e-11;

    private Planet(double masa, double radio){
      this.masa = masa;
      this.radio = radio;
    }

    private double getMasa(){
      return masa;
    }

    private double getRadio(){
      return radio;
    }

    public double Gravedad(){
      return G * masa / (radio * radio);
    }

    public double Peso(double p){
      return p * Gravedad();
    }
}
