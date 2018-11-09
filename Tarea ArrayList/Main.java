import java.util.ArrayList;

public class Main{

  public static void main(String[] args) {
    int max = 0;
    int pos = 0;

    ArrayList<Integer> a1 = new ArrayList<Integer>();
    ArrayList<Integer> b1 = new ArrayList<Integer>();
    ArrayList<Integer> c1 = new ArrayList<Integer>();
    ArrayList<Integer> d1 = new ArrayList<Integer>();

    b1.add(5);
    b1.add(23);
    d1.add(4);
    d1.add(2);
    c1.addAll(d1);
    c1.add(6);
    a1.add(3);
    a1.addAll(b1);
    a1.add(3);
    a1.addAll(c1);
    a1.add(8);

    //[1, [2,3], [4,5,6], 8]

    //b1 = [1, 30]
    //
    //

    System.out.println();
    System.out.println(a1);
    System.out.println();
  }
}
