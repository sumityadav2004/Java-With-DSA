import java.util.Arrays;
public class maxvalue {
    public static void main(String args []){
         int arr[]={32,43,22,55,33,4,32,432};
        System.out.println(maxRange(arr));


    }
    static int maxRange(int arr[]){
        int maxvalue=arr[0];
        for(int i=1;i<arr.length;i++){

        if(arr[i]>maxvalue){
            maxvalue=arr[i];
        } 
    }
    
           return maxvalue;
    }
}
