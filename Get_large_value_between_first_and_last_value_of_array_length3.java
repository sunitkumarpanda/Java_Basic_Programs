import java.util.Arrays;

public class Get_large_value_between_first_and_last_value_of_array_length3 {
    public class Expt_13 {
        public static void main(String[] args)
        {
            int[]array_nums={20,30,40};
            System.out.println("Original array:"+ Arrays.toString(array_nums));
            int max_val=array_nums[0];
            if (array_nums[2]>=max_val)
                max_val=array_nums[2];
            System.out.println("larger value between first element:"+max_val);
        }
    }
}
