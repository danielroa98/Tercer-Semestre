import java.util.*;

public class Max{

  @SuppressWarnings("unchecked")
  public static void main(String[] args) {

    ArrayList<Object> arr = new ArrayList<Object>();

    arr.add(new ArrayList <Object>());
    arr.add(new Integer(20));
    arr.add(new ArrayList<Object>());

    //arr.get(0).add(new Integer(23));

    ((ArrayList)arr.get(0)).add(new Integer(23));
    ((ArrayList)arr.get(0)).add(new Integer(24));
    ((ArrayList)arr.get(0)).add(new Integer(25));

    ((ArrayList)arr.get(2)).add(new Integer(5));
    ((ArrayList)arr.get(2)).add(new Integer(56));

    System.out.println(arr);

    //System.out.println(calculaMax(arr, 0));
  }

  @SuppressWarnings("unchecked")
  public static int calculaMax(ArrayList<Object> obj, int max){
    for (int i =0; i < obj.size(); i++) {

      if ((obj.get(i).getClass()) == Integer.class) {
        if ((Integer)obj.get(i) > max) {

        }
      }else
      {

      }
    }
    return max;
  }
}
