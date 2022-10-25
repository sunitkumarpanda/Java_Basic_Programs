import java.util.Scanner;

public class Check_num_even_or_odd {
    public class Expt_11 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("input a number: ");
            int n = in.nextInt();
            if (n % 2 == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }
    }
}
