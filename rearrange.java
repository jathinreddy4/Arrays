public class rearrange 
{
    public static void main(String[] args) {
        int arr[] = {1,2,-3,-1,-2,3};
        int ans[] = arrange(arr);
        System.out.println("Rearranged array is : ");
        for(int i=0 ;i<arr.length; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] arrange(int arr[])
    {
        int pos[] = new int[arr.length];
        int neg[] = new int [arr.length];
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

        for(int i=0;i<arr.length/2;i++){
      
            arr[2*i] = pos[i];
            arr[2*i+1] = neg[i];
        }

        return arr;
    }

}
