//Find the Majority Element that occurs more than N/2 times
// need to learn optimal solution.
public class midThree 
{
    public static void main(String[] args) 
    {
        int arr[] = {2,2,1,1,1,2,2};
        
        int ans = major(arr);
        System.out.println(ans);    
    }    

    public static int major (int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n ;i++)
        {
            int count = 0;
            for(int j=0; j<n; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }

            if(count >= (n / 2))
            {
                return arr[i];
            }
        }
        return 0;
        
    }
}
