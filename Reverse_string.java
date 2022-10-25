import java.util.Scanner;

public class Reverse_string {
    public class Expt_10 {
        public static void main(String[] args) {
            Scanner Scanner = new Scanner(System.in);
            System.out.println("Input a string: ");
            char[]letters= Scanner.nextLine().toCharArray();
            System.out.println("Reverse string: ");
            for(int i=letters.length-1;i>=0;i--){
                System.out.println(letters[i]);
            }
            System.out.println("\n");
        }
    }
}
