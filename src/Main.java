import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Main {

    public static void main(String[] args) {
        ArrayList grades = new ArrayList();

        grades.add(99);
        grades.add(80);
        grades.add(70);
        grades.add(90);
        grades.add(75);

        int size = grades.size();

        System.out.println(size);

        for (int i = 0; i < size; i++) {
            System.out.println(grades.get(i));
        }

        // iterate via "New way to loop"
        for (Object item :  grades) {
            System.out.println(item);
        }

        Queue orders = new LinkedList();
        orders.add("Order1");
        orders.add("Order2");
        orders.add("Order3");
        System.out.print(orders.poll());
        System.out.print(orders.poll());
        System.out.print(orders.poll());

    }

}
