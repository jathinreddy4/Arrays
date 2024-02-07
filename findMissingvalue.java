import java.util.*;
public class findMissingvalue 
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        Scanner obj = new Scanner(System.in);;
        System.out.println("enter the number to find");
        int x = obj.nextInt();


        for(int i=0; i<arr.length; i++)
        {
            if(x == arr[i])
            {
                System.out.println("number found @ " + i);
            }
            
        }
    }
    
}
