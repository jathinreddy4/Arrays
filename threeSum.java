import java.util.*;
public class threeSum 
{
    public static void main(String[] args) 
    {
        int arr [] = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = tsum(arr);

        //print
        for(List<Integer> ab : ans)
        {
            System.out.println("[");
            for(Integer i :ab)
            {
                System.out.print(i+ " ");
            }
            System.out.println("]");
        }
        System.out.println();

        System.out.println("better  ");
        List<List<Integer>> ans1 = t1sum(arr);

        for(List<Integer> triplet : ans1)
        {
            System.out.println(triplet);
        }

        



        
    }
    
    public static  List<List<Integer>> tsum(int arr[])
    {
        Set<List<Integer>> ls = new HashSet<>();
        

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                for(int k=j+1; k<arr.length; k++)
                {
                    if(arr[i] + arr[j] + arr[k] == 0)
                    {
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                        temp.sort(null);
                        ls.add(temp);
                    }
                }
            }
            
        }
        //store the set elements in the ans
        List<List<Integer>> ans  = new ArrayList<>(ls);
        return ans;
    }

    //better solution 

    public static List<List<Integer>> t1sum(int arr[])
    {
        Arrays.sort(arr); // to sort the array
        Set<List<Integer>> sl = new HashSet<>();

        //now for the first element find the other 2 elemetns

        for(int i=0; i<arr.length-2; i++)
        {
            //2pointer
            int left =i+1;
            int right= arr.length-1;

            while(left<right)
            {
                int sum = arr[i] + arr[left] + arr[right];

                if(sum == 0)
                {
                    // add the set and move to find other triplets
                    sl.add(Arrays.asList(arr[i], arr[left] , arr[right]));
                    left++;
                    right--;
                }
                else if(sum<0)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }


        }
        List<List<Integer>> ans1  = new ArrayList<>(sl);
        return ans1;
    }

}
