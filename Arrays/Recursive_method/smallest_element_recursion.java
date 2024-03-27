public class smallest_element_recursion {
    public static void main(String[] args) {
        int arr[]={0,8,78,67,43,21};
        int n=arr.length;
        System.out.println(smallest(arr,n));

    }
    static int smallest(int arr[],int n){
        if(n==1){
            return arr[0];
        }
            return Math.min(arr[n-1],smallest(arr, n-1));
    }
}
