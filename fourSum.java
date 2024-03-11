import java.util.*;
public class fourSum 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,0,-1,0,-2,2}; 
        
        System.out.println("brute : ");
        List<List<Integer>> ans = fsum(arr);

        for(List<Integer> triplet : ans)
        {
            System.out.println(triplet);
        }

        System.out.println("better : ");
        List<List<Integer>> ans1 = f1sum(arr);

        for(List<Integer> triplet : ans1)
        {
            System.out.println(triplet);
        }
    }  
    
    public static List<List<Integer>> fsum(int[]arr)
    {
        Set<List<Integer>> ls = new HashSet<>();

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                for(int k= j+1; k<arr.length; k++)
                {
                    for(int l=k+1; l<arr.length; l++)
                    {
                        int sum = arr[i]+arr[j]+arr[k]+arr[l];
                        if(sum == 0)
                        {
                            List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                            temp.sort(null);
                            ls.add(temp);
                        }
                    }
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>(ls);
        return ans;
    }


    public static List<List<Integer>> f1sum(int arr[])
    {
        Arrays.sort(arr);
        Set<List<Integer>> sl = new HashSet<>();

        for(int i=0; i<arr.length-3; i++)
        {
            for(int j=i+1; j<arr.length-2; j++)
            {
                int left = j+1;
                int right = arr.length-1;

                while(left<right)
                {
                    int sum1 = arr[i]+arr[j]+arr[left]+arr[right];

                    if(sum1 == 0)
                    {
                        sl.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                        left++;
                        right--;
                    }
                    else if(sum1 < 0)
                    {
                        left++;
                    }
                    else
                    {
                        right--;
                    }
                }
            }
        }

        List<List<Integer>> ans1 = new ArrayList<>(sl);
        return ans1;

    }


}
