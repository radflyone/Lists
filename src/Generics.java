import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args){
       //requires cast to convert to String
        List list = new ArrayList();
        list.add("hello");
        String s = (String) list.get(0);

      //When re-written to use generics, the code does not require casting
        List<String> list2 = new ArrayList<String>();
        list2.add("hello");
        String s2 = list2.get(0);   // no cast
    }
}
