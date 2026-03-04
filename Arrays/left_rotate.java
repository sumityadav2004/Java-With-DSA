
import java.util.Arrays;

public class leftrotate{
    public static void main(String args []){
        int arr[]={21,23,35,36,37,39};
       leftrotate(arr);
       System.out.println(Arrays.toString(arr));

    }
     static void leftrotate(int arr []){
       
        int temp=arr[0];
       
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
         

        }
        arr[arr.length-1]=temp;
     }


}