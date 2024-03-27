public class Smallest_Largest_recurison {
    public static void main(String[] args) {
        int arr[]={0,23,43,21,65,78};
        int n=arr.length;
        System.out.println(smallest(arr,n));
        System.out.println(largest(arr,n));
    }
    static int smallest(int arr[],int n){
        if(n==1){
            return arr[0];
        }
            return Math.min(arr[n-1], smallest(arr,n-1));
    }
    static int largest(int arr[],int n){
        if(n==1){
            return arr[0];
        }
            return Math.max(arr[n-1], smallest(arr,n-1));
    }
}
