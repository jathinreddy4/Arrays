public class findmax 
{
    public static void main(String[] args) 
    {
        int[] arr = {9,2,3,4,5,645,4};
        System.out.print("Max number: ");
        System.out.print(max(arr));
    }

    static int max(int arr[])
    {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) 
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    

    
}
