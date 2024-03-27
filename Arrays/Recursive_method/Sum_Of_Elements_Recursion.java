public class Sum_Of_Elements_Recursion {
    public static void main(String[] args) {
        int arr[]={20,80,65,45,100};
        int n=arr.length;
        System.out.println(sum(arr,n));
    }
    static int sum(int arr[],int n){
        if(n==1){
            return arr[0];
        }
        return arr[n-1]+sum(arr,n-1); 
}
}
