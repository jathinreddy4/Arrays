//sort 0,1,2 in given array
import java.util.*;

public class midTwo 
{
    public static void main(String[] args) {
        int arr[]  = {0, 2, 1, 2, 0, 1};
        ArrayList<Integer> arry = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        
        brute(arr);
        System.out.println("brute force");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");   
        }
        System.out.println();
        int n = 6;
        optimal(arry,n);
        System.out.println("optimal");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arry.get(i) + " ");    
        }
    }

    public static void brute(int arr[])
    {
        for(int i=0; i<arr.length ;i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                if(arr[j] > arr[i])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                else
                {

                }
            }
        }
    }

    public static void optimal(ArrayList<Integer> arry, int n)
    {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for(int i = 0; i<n;i++)
        {
            if(arry.get(i) == 0) cnt0++;
            else if(arry.get(i) == 1) cnt1++;
            else cnt2++;
        }
        //replacing

        for (int i = 0; i < cnt0; i++) arry.set(i, 0); // replacing 0's
        for (int i = cnt0; i < cnt0 + cnt1; i++) arry.set(i, 1); // replacing 1's
        for (int i = cnt0 + cnt1; i <n; i++) arry.set(i, 2); // replacing 2's
    }

    

}
