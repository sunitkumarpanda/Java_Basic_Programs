import java.util.Scanner;

public class Accept_two_value_return_large_value {
    public class Expt_12 {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.println("input the first number: ");
            int a=in.nextInt();
            System.out.println("input second number: ");
            int b= in.nextInt();
            System.out.println("Result:"+result(a,b));
        }
        public static int result(int x,int y)
        {
            if (x==y)
                return 0;
            if (x %6==y%6)
                return(x<y)?x:y;
            return(x>y)?x:y;
        }

    }
}
