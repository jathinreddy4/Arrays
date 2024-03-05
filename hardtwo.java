import java.util.*;

public class hardtwo 
{
    public static void main(String[] args) 
    {
        int arr[] = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = major(arr);
        System.out.println("the majority elemetns are : ");
        for(int i=0; i<ans.size(); i++)
        {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }    

    public static List<Integer> major(int arr[])
    {
       
        int N = arr.length;
        int threshold = N/3;

        List<Integer> ls = new ArrayList<>();

        for(int i=0; i<arr.length; i++)
        {  
            int count =0;
            for(int j=0; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }

                if(count > threshold)
                {
                    ls.add(arr[i]);
                }

                if(ls.size() == threshold ) break;
            }
        }
        return ls;
        
    }
}
