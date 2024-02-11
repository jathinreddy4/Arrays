public class maxConsi 
{
    public static void main(String[] args) 
    {
        int [] arr ={1,1,1,0,0,1,1,1,1,1};
        System.out.print("maxmimum count of 1's are : ");
        System.out.print(findmaxc(arr));   
    }

    public static int findmaxc(int[]arr)
    {
        int count = 0;
        int maxi = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == 1) 
            {
                count++;   
            } 
            else 
            {
                count = 0;   
            } 
            
            maxi = Math.max(maxi, count);
        }
        return maxi;

    }
    
}
