public class SumOfElementsInArray {
    public static void main(String[] args) {
        int arr[]={23,45,67,8,9,1};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum + arr[i];
        }
        System.out.println(sum);
    }
}
