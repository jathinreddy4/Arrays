public class kadaneMaxiASubarray 
{
    public static void main(String[] args) 
    {
        int arr [] = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxsum = maxsub(arr);
        int maxx1 = maxsum1(arr);
        int maxx2 = maxsum2(arr);
        System.out.println(maxsum);
        System.out.println(maxx1);
        System.out.println(maxx2);


    }
//brute force
    public static int maxsub(int arr[])
    {
        int maximum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=1; j<arr.length; j++)
            {
                int sum = 0;

                //to add all the elements in the sub array
                for(int k=i; k<=j; k++)
                {
                    sum += arr[k];
                }

                maximum = Math.max(maximum, sum);
            }
        }
        return maximum;
    }
//better solution.
    public static int  maxsum1(int arr[])
    {
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            int sum1 = 0;
            for(int j=i; j<arr.length; j++)
            {
                sum1 += arr[j];

                maxi = Math.max(maxi, sum1);
            }
        }
        return maxi;
        
    }
//optimal solution using kadane algorithm
    public static int maxsum2(int arr[])
    {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];

            if(sum > maxi)
            {
                maxi =sum;
            }

            if(sum<0)
            {
                sum = 0;
            }
        }
        return maxi;
    }
}




