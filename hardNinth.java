//Find the repeating and missing numbers

public class hardNinth 
{
    public static void main(String[] args) 
    {
        int arr[] = {3,1,2,5,3};
        int ans = find(arr);
        System.out.println(ans);    
    }

    public static int find(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    return arr[i];
                }

                while(Arrays.c)
            }
        }
        return -1;

    }
}
