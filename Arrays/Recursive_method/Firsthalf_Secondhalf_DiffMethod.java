import java.util.Arrays;

public class Firsthalf_Secondhalf_DiffMethod {
    public static void main(String[] args) {
        int arr[]={20,45,60,70,90,80};
        int n=arr.length;
        sorting(arr,n);
    }
    static void sorting(int arr[],int n){
        Arrays.sort(arr);
        for(int i=0;i<n/2;i++){
            System.out.println(arr[i]+" ");
        }
        for(int j=n-1;j>=n/2;j--){
            System.out.println(arr[j]+" ");
        }


    }
}
