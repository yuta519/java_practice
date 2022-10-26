import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Q2 {

    public static void main(String[] args) {
        List<Integer> first_list = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i=0; i < 10; i++) {
            first_list.add(rand.nextInt(50));
        }

        List<Integer> second_list = new ArrayList<Integer>();
        for (int i=0; i < 10; i++) {
            second_list.add(first_list.get(i));
        }

        first_list.set(9, first_list.get(9)-5);

        System.out.println("First Array:  " + first_list);
        System.out.println("Second Array: " + second_list);
    }

}
