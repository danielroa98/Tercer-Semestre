/*
 *Daniel Roa
 *A01021960
 *Interfaces
 *28 de octubre del 2018
 */
import java.util.*;

public class Main{
  public static void main(String[] args) {

    ArrayList<Student> al = new ArrayList<Student>();

    al.add(new Student(101, "My Queen Christian", 21));
    al.add(new Student(112, "George", 20));
    al.add(new Student(132, "Colombian", 19));

    Collections.sort(al);

    /*
    for (int i = 0; i<al.size(); i++) {
      System.out.println(al.get(i).rollno+" "+al.get(i).name+" "+al.get(i).age);
    }
    */

    for (Student st:al) {
      System.out.println(st.rollno+" "+st.name+" "+st.age);
    }

    Student s1 = new Student(101, "My Feik Queen", 20);

    System.out.println(s1.compareTo(new Student(106, "Wicho", 19)));
  }
}

/*La interface iterable se encuentra definida en el paquete de java.lang
*/
