import java.util.Scanner;
public class linearSearch 
{
    public static void main(String[] args) 
    {
        int [] arr = {1,2,3,4,5};
        Scanner ob = new Scanner(System.in);
        System.out.println("Input number to find");
        int x = ob.nextInt();
        
        for(int i=0; i<arr.length; i++)
        {
            if( x == arr[i])
            {
                System.out.println("Number found at index : " + arr[i]);
            }

        }
        
       
    }
    
}
