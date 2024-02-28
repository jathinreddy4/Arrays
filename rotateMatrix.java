public class rotateMatrix 
{
    public static void main(String[] args) 
    {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rotate[][] = roatate(arr);
        for(int i=0; i<rotate.length;i++)
        {
            for(int j=0; j<rotate.length; j++)
            {
                System.out.print(rotate[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] roatate(int arr[][])
    {
        int n = arr.length;
        int ans[][] = new int[n][n];

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length;j++)
            {
                ans[j][n-1-i] = arr[i][j];
            }
        }
        return ans;
    }

}
