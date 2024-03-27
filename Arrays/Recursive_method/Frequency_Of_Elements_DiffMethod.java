import java.util.Arrays;

public class Frequency_Of_Elements_DiffMethod {
    public static void main(String[] args) {
        int arr[]={20,30,70,50,40,40,40,70,20,30};
        int n=arr.length;
        freq(arr,n);
    }
    static void freq(int arr[],int n){
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int count=1;
            while(i<n-1 && arr[i]==arr[i+1]){
                i++;
                count++;
            }
            System.out.println(arr[i]+ " occured "+ count+" times ");
        }
    }
}
