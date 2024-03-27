public class smallestelement {
    public static void main(String[] args) {
        int arr[]={0,3,7,9,1,23,90,87};
        int n=arr.length;
        smallest(arr,n);
    }
    static void smallest(int arr[],int n){
        int smallest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println(smallest);
    }
}
