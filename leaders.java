//find the elements who are greater than all the elements to their right
public class leaders 
{
    public static void main(String[] args) 
    {
        int arr[] = {10,22,12,3,0,6};
        lead(arr);    
    }
    
    public static void lead(int arr[])
    {
        //last element is always the leader.
        int n = arr.length;
        int maxfromRight = arr[n-1];
        System.out.println(maxfromRight);
        

           // to print the last element.

        // i= n-2 bcoz last element n-1 is always the leader 
        // n-2 will  be the second last element so we commpare it with the last element and go backwards
        for (int i = n-2; i>=0; i--)
        {
            if(arr[i] > maxfromRight)
            {
                maxfromRight = arr[i];
                System.out.println(maxfromRight + " ");
            }
        }
        

        
    }
}
