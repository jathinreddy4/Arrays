public class mediumThree 
{
    public static void main(String[]args)
    {
        int arr[] = {100,200,1,2,3,4};
        int ans = longcons(arr);
        System.out.println(ans);
    }

    public static int longcons(int arr[])
    {
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            int x = i;
            for(int j=0; j<arr.length; j++)
            {
                if(arr[x+1] == arr[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}
