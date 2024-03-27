public class ThirdSmallest {
        public static void main(String[] args) {
            int arr[]={0,1,2,3,4};
            int n=arr.length;
            thirdsmallest(arr,n);
        }
        static void thirdsmallest(int arr[],int n){
            int smallest=arr[0];
            for(int i=0;i<n;i++){
                if(arr[i]<smallest){
                    smallest=arr[i];
                }
            }
            int second_smallest=arr[0];
            for(int i=0;i<n;i++){
                if(arr[i]<second_smallest && arr[i]!=smallest){
                    second_smallest=arr[i];
                }
            }
            int third_smallest=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]<third_smallest && arr[i]!=smallest && arr[i]!=second_smallest){
                    third_smallest=arr[i];
                }
            }
            System.out.println("Third smallest element in the array is = "+ third_smallest);
        }
    }
