/*
 *Examen Parcial 2
 *Daniel Roa
 *A01021960
 *23 de octubre del 2018
 */


public enum Materias{

  TEORIA_DEL_ARTE("Luis Garcia", 9, 7),
  DIBUJO("Daniel Roa", 18, 8),
  ESCULTURA("Jorge Palacios", 18, 9),
  FOTOGRAFIA("Christian Dalma", 18, 10),
  CANTO("Rodrigo Roa", 18, 11),
  ACTUACION("Luis Revilla", 18, 12),
  ESCENOGRAFIA("Julio Profe", 18, 13),
  DG("Julio Profe", 18, 14),
  HA("Julio Profe", 9, 15),
  COLOR("Julio Profe", 9, 16),
  PAISAJE("Julio Profe", 9, 17);

  private String profe;
  private int creditos;
  private int hora;

  private Materias(String profe, int creditos, int hora){
    this.profe = profe;
    this.creditos = creditos;
    this.hora = hora;
  }

  private String getProfe(){
    return profe;
  }

  private int getCreditos(){
    return creditos;
  }

  private int getHora(){
    return hora;
  }
}
