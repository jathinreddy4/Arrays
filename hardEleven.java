/*Count Reverse Pairs
Problem Statement: Given an array of numbers, you need to return the count of reverse pairs. 
Reverse Pairs are those pairs where i<j and arr[i]>2*arr[j].
*/


public class hardEleven 
{
    public static void main(String[] args) 
    {
        int arr[] = {4, 1, 2, 3, 1};
        int ans = find(arr);
        System.out.println(ans);
    }    

    public static int find(int arr[])
    {
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] > 2*arr[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}
