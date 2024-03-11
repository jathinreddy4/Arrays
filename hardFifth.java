//Length of the longest subarray with zero Sum
//Given an array containing both positive and negative integers, 
//we have to find the length of the longest subarray with the sum of all elements equal to zero.

public class hardFifth 
{
    public static void main(String[] args) 
    {
        int arr[] = {9, -3, 3, -1, 6, -5};   
        int ans = find(arr);
        System.out.println("The longest length: ");
        System.out.println(ans); 

    }    

    public static int find(int arr[])
    {
        int maxlen = 0;
        for(int i=0; i<arr.length; i++)
        {
            int sum =0;
            for(int j=0; j<arr.length; j++)
            {
                if(arr[i] + arr[j] == sum)
                {
                    break;
                }

                maxlen = Math.max(maxlen, j);
            }
        }
        return maxlen;
        
        
    }
}
