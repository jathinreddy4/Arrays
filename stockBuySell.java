public class stockBuySell 
{
    public static void main(String[] args) 
    {
        int arr[] = {7,1,5,3,6,4};
        int maxProfit = maxprof(arr);
        System.out.println("The max profit is : ");
        System.out.println(maxProfit);  

        int maxProfit1 = maxprof2(arr);
        System.out.println("max profit : ");
        System.out.println(maxProfit1);

    }
    
    public static int maxprof(int arr[])
    {
        int max = 0;
        for(int i=0; i<arr.length; i++)
        {
            int sum =0;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j] > arr[i])
                {
                    sum = arr[j] - arr[i];
                }

                max = Math.max(max, sum);
            }
        }
        return max;
        
    }

    public static int maxprof2(int arr[])
    {
        int max1 = 0;
        int min_value = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            min_value = Math.min(min_value, arr[i]);
            max1 = Math.max(max1 , arr[i] - min_value);
        }

        return max1;
    }
}
