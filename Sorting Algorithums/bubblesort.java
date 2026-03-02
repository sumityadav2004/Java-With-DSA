import java.util.Arrays;
public class bubblesort{
public static void main(String args []){
    int arr[]={12,13,8,6,4,3,16,2,1,7};
      bubble(arr);
      System.out.println(Arrays.toString(arr));
  
    }
    static void bubble(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
