public class Smallestlargest {
    public static void main(String[] args) {
        int arr[]={0,88,78,67,54,32,1,23};
        int n=arr.length;
        smallest(arr,n);
        largest(arr,n);
    }
    static void smallest(int arr[],int n){
        int small=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println("Smallest element int he array is = "+ small);
    }
    static void largest(int arr[],int n){
        int large=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        System.out.println("Largest element int he array is = "+ large);
    }
}
