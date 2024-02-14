//only positives
public class longestSubarray 
{
    public static void main(String[] args) 
    {
        int arr [] = {2,3,5,1,9};
        int n = 10;
        int len = longsub(arr, n);
        System.out.println(len);
    }
    /*brute force : 3loops (timecomplexity : O(n^3))
    public static int longsub(int arr[], int n)
    {
        int len = 0;
        for (int i = 0; i < arr.length; i++) 
        {  
            for(int j = i; j<arr.length; j++)
            {
                int sum = 0;
                for(int k=i; k<=j; k++)
                {
                    sum += arr[k];
                }

                if(sum == n)
                {
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
} 
*/

public static int longsub(int arr[], int n)
    {
        int len = 0;
        for (int i = 0; i < arr.length; i++) 
        {   
            int sum = 0;
            for(int j = i; j<arr.length; j++)
            {
                sum += arr[j];
                

                if(sum == n)
                {
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
}
