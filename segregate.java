//segrate positive and negative elements

public class segregate 
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


       

    }
    


    
    
}
