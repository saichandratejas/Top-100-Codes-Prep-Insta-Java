public class largestelement {
    public static void main(String[] args) {
        int arr[]={2,10,98,64,34};
        int n=arr.length;
        largest(arr,n);
        

    }
    static void largest(int arr[],int n){
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
