public class M2sum 
{
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        int target  = 14;
        String ans = twosum(arr, target);
        System.out.println(ans);
    }

    public static String twosum(int arr[], int target)
    {
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 1; j < arr.length; j++) 
            {  
                if(arr[i] + arr[j] == target)
                {
                    return "YES";
                   
                }
               
            } 
        }
        return "NO";
    }
}