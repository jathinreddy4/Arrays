public class checksort {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1])
            {

            }
            else{
                System.out.println("not sorted");
            }
        }
        System.out.println("sorted");

        
    }

    
}
