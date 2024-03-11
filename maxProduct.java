//Given an array that contains both negative and positive integers, find the maximum product subarray.

public class maxProduct 
{
    public static void main(String[] args) 
    {
        int arr[] = {1, 2, -3, 0, -4, -5};  
        int ans = find(arr);
        System.out.println(ans);
    }    

    public static int find(int arr[])
    {
        int maxProduct = 0;
        for(int i=0; i<arr.length; i++)
        {
            int product = 1;
            for(int j= i; j<arr.length; j++)
            {
                product *= arr[j];
                maxProduct = Math.max(maxProduct, product);
            }

            
        }
        return maxProduct;
    }
}
