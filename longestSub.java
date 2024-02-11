public class longestSub 
{
    public static void main(String[] args) 
    {
        int [] arr = {2,3,1,2,9}; 
        System.out.println(findlength(arr)); 
    }
    
    public static int findlength(int [] arr)
    {
       
        for(int i=0; i<arr.length; i++)
        {
            
            int k = 10;
            for (int j = 1; j < arr.length;j++ ) 
            {
                if(arr[i] + arr[j] == k)
                {
                    return j;
                } 
        
            }
            
        }
        return -1;
    }
}
