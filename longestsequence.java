import java.util.HashSet;

public class longestsequence 
{
    public static void main(String[] args) {
        int arr[] = {100,200,1,3,2,4};
        int ans =Length(arr);
        System.out.println(ans);
    }

    public static int Length(int arr[])
    {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        int maxLen = 1;
        for(int num : arr)
        {
            int length = 1;
            int current = num;
            

            while(set.contains(current+1))
            {
                length++;
                current++;
            }

            

            maxLen = Math.max(maxLen, length);
        }
        return maxLen;
    }    
}
