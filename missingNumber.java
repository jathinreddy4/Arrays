import java.util.*;
public class missingNumber 
{
    public static void main(String[] args) {
        int [] arr = {1,2,3,5};

        int sum1 = Arrays.stream(arr).sum();  //function to sum an array
        System.out.println(sum1);

        int sum2 = 0;
        for(int i=1; i<6; i++)
        {
            sum2 = sum2+ i;
        }

        System.out.println("missing number  = " + (sum2-sum1));

       
        
    }
    
}
