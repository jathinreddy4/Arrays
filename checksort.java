public class checksort {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        
        for(int i=1; i<arr.length;i++)
        {
            for(int j=i-1;i<arr.length-1;j++)
            {
                if(arr[i]  > arr[j])
                {
                    
                }
                else
                {
                    System.out.println("flse");
                }
            }
        }
        System.out.println("true");

        
    }

    
}
