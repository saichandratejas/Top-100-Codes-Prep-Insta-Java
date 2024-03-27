public class largest_element_recursion {
    public static void main(String[] args) {
        int arr[]={0,9,77,54,32,1};
        int n=arr.length;
        System.out.println(largest(arr,n));
    }
    static int largest(int arr[],int n){
        if(n==1){
            return arr[0];
        }
        return Math.max(arr[n-1],largest(arr, n-1));
    }
}
