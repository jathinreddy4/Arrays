public class appearOnce 

{
    public static void main(String[] args) {
        int [] arr = {4,5,5,6,6,4,8};
        System.out.println("The number only once in the array is : ");
        System.out.println(captureleast(arr));
        System.out.println("using optimal solution");
        System.out.println(pakadleast(arr));
        
    }
//BRUTE FORCE APPROACH
    public static int captureleast(int[]arr)
    {
        
        int once;
        for(int i=0; i<arr.length; i++)
        {
            int count =0;
            for(int j =0; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
                
            }
            if(count == 1)
            {
                return arr[i];
            }
        }
        return -1;        
    }

    //OPTIMAL USING BITWISE OPERATOR //NISHANT CHAHAR VIDEO
    public static int pakadleast(int[]arr)
    {
        int ans=0;
        for (int i = 0; i < arr.length; i++) 
        {
            ans = ans^arr[i];   
        }
        return ans;
    }
    
}
