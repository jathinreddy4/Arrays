public class rearrangeBySign 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,-4,-5};
        int pos[] = new int[2];
        int neg[] = new int [2];
        int poss = 0;
        int negi = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > 0)
            {
                pos[poss++] = arr[i];
            }
            else
            {
                neg[negi++] = arr[i];
            }
        }

        System.out.println("positive array: ");
        for (int i : pos) 
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("negative array:");
        for (int i : neg) 
        {
            System.out.print(i + " ");    
        }

        for(int i=0;i<arr.length/2;i++)
        {
      
            arr[2*i] = pos[i];
            arr[2*i+1] = neg[i];
            
        }

       

    }
    


    
    
}
