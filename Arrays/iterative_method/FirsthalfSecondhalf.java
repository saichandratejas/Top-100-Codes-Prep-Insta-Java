public class FirsthalfSecondhalf {
    public static void main(String[] args) {
        int arr[]={20,30,45,50,10,90};
        int n=arr.length;
        sorting(arr,n);
    }
    static void sorting(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            for(int j=n/2;j<n-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
