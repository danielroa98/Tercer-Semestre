public class Canguro {

 private int pos = 0;
 private int vel = 0;
 private String termino;

 public Canguro() {

 }

 public Canguro(int pos, int vel) {
  this.pos = pos;
  this.vel = vel;
 }

 public void setPos(int pos) {
  this.pos = pos;
 }

 public int getPos() {
  return pos;
 }

 public void setVel(int vel) {
  this.vel = vel;
 }

 public int getVel() {
  return vel;
 }


 //comparador de datos posicipn y velocidad
 public boolean disTotal(Canguro c) {

  boolean a = false;
  String termino;


  if ((c.pos > pos && c.pos < pos) || (c.vel < vel && c.vel > vel)) {
    termino = "No";

   return a;
  }

  while (a != true) {
   if (c.pos == pos) {
    a = true;

    return a;
   } else {
    c.pos += c.vel;

    pos += vel;

    termino = "Si";
   }


  }
  return a;

 }

}
