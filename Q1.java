import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        List<Integer> random_int_list = new ArrayList<Integer>();

        Random rand = new Random();
        // int num = rand.nextInt(50);
        for (int i=0; i < 10; i++) {
            random_int_list.add(rand.nextInt(50));
        }
        System.out.println(random_int_list);

        Scanner scan = new Scanner(System.in);
        System.out.println("Input your number!");
        int input = scan.nextInt();

        if (random_int_list.contains(input)) {
            System.out.println("Your input is in Random Array!");
            scan.close();
            return;
        }
        System.out.println("Your inputb is not in Random Array!");
        scan.close();
    }
}
