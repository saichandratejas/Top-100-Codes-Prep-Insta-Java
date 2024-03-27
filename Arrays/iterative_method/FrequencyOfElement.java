import java.util.Arrays;
public class FrequencyOfElement {
    public static void main(String[] args) {
        int arr[]={20,40,40,20,10,90,60,30,10};
        int n=arr.length;
        frequency(arr,n);
    }
    static void frequency(int arr[],int n){
        
        Boolean visited[]=new Boolean[n];
        Arrays.fill(visited,false);

        for(int i=0;i<n;i++){
            if(visited[i]==true)
                continue;
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+" occured "+count+" " +"times");
        }
        
    }
}
