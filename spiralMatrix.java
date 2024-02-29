import java.util.ArrayList;
import java.util.List;

public class spiralMatrix 
{
    public static void main(String[] args) 
    {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        List<Integer> ans = printSpiral(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();

    }  
    
     public static List<Integer> printSpiral(int[][] arr)
     {
        List<Integer> ans = new ArrayList<>(); //created a list to store the elements
        int rowBegin = 0;
        int rowEnd = arr.length - 1;
        int colBegin = 0;
        int colEnd = arr[0].length - 1;

        while( rowBegin <= rowEnd && colBegin <= colEnd)
        {
            for(int j=colBegin; j<=colEnd; j++)  //towards right
            {
                ans.add(arr[rowBegin][j]);
            }
            rowBegin++;

            for(int j=rowBegin; j<=rowEnd; j++)  //towards down
            {
                ans.add(arr[j][colEnd]);
            }
            colEnd--;

            if(rowBegin <= rowEnd)
            {
                for(int j=colEnd; j >= colBegin; j--)   //towards left
                {
                    ans.add(arr[rowEnd][j]);
                }
                rowEnd--;
            }


            if(colBegin <= colEnd)
            {
                for(int j=rowEnd; j>=rowBegin; j--)   //towards up
                {  
                    ans.add(arr[j][colBegin]);
                }
                colBegin++;
    
            }
          
        }
        return ans;

     }
}
