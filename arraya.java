import java.util.*;

public class arraya {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter rows");
        int rows = obj.nextInt();
        System.out.println("enter cols");
        int cols = obj.nextInt();
        int arr[][] = new int[rows][cols];  
        
        for(int i = 0; i<arr.length; i++)   //input 
        {
            for(int j = 0; j< arr[i].length; j++)
            {
                arr[i][j] = obj.nextInt();
            }
        }

        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr.length; j++)

            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        //
        for(int i = 0; i<arr.length; i++)  //printing using toString() function;
        {
            System.out.println(Arrays.toString(arr[i]));
        }

        for(int [] a : arr)    //enhansed  for loop 
        {
            System.out.println(Arrays.toString(a));
        }

       
    }
}
