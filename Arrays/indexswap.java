
import java.util.Arrays;

public class indexswap {
    public static void main(String args []){
        int arr []={23,24,25,29};
        swap(arr,0,2);
        System.out.println(Arrays.toString(arr));
    }

    static void swap (int arr[],int index1,int index2){
       int temp=arr[index1];
      arr[index1]=arr[index2];
      arr[index2]=temp;
    }
    
}

