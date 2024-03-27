public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={25,45,60,90,100};
        int n=arr.length;

        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
