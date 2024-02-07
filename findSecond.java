// finding second largest and second smallest

import java.util.Arrays;

public class findSecond 
{
    public static void main(String[] args) {
        /* 
        int arr[] = {2,43,423,2445,232,5,1};      //brute force approach
        for(int num : arr)
        {
            System.out.print(num + " ");
        }

        Arrays.sort(arr);
        System.out.println("sorted array");
        for (int i : arr) {
            System.out.print(i + " ");
            
        }
        System.out.println();
        System.out.println("second largest number:" + arr[arr.length-2]);
        System.out.println("second smallest number: " + arr[0+1]);
        */

        int [] arr = {1,2,3,4,5,6};
        int smax = secondlargest(arr);
        System.out.println("Second largest : ");
        System.out.println(smax);
    }
    public static int secondlargest(int arr[])
    {
        int fmax = arr[0];
        int smax = -1;

        for (int i = 0; i < arr.length; i++) 
        {
            if(arr[i] > fmax)
            {
                smax = fmax;
                fmax = arr[i];
            }
            else if(arr[i] < fmax && arr[i] > smax)
            {
                smax = arr[i];
            }
        }
        return smax;

    }
    


    
}
