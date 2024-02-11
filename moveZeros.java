public class moveZeros 
{
    public static void print(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) 
    {
        int [] arr = {1,0,2,3,2,0,0,4,5,1};
        
        for(int i =0 ;i<arr.length ;i++)
        {
        
            for (int j = 0; j < arr.length-1; j++) 
        
            {
            if(arr[j] != 0)
            {
                continue;
            }
            else
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            }
        }
        print(arr);

        
    }
    
}
