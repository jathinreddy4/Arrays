public class leftrotate 
{
    public static void print(int arr[])
    {
       System.out.println("left rotated array : ");
       for(int i=0; i<arr.length; i++)
       {
        System.out.print(arr[i] + " ");
       }
       
    }

    public static void main(String[]args)
    {
        int []arr = {1,2,3,4,5};
        int i=0;
        for(int j=1; j<arr.length; j++)
        {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
        }
        print(arr);


       
    }
    
}
