public class SecondSmallest {
    public static void main(String[] args) {
        int arr[]={9,79,65,34,52,1};
        int n=arr.length;
        secondsmallest(arr,n);
    }
    static void secondsmallest(int arr[],int n){
        int smallest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        int second_smallest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<second_smallest && arr[i]!=smallest){
                second_smallest=arr[i];
            }
        }
        System.out.println("Second smallest element in the array is = "+ second_smallest);
    }
}
