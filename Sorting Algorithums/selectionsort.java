import java.util.Arrays;
public class selectionsort {
    public static void main(String args []){
        int arr[]={12,6,7,14,7,9,3};
        search(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void search(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length -i -1;              
           int maxindex=getMaxIndex(arr,0,last);
            swap(arr,maxindex,last);
        }  
        
        } 
        
    
    static int getMaxIndex(int arr[],int start,int end){
   int max=start;
        for(int i=1;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            } 
        }
            return max;
        }  
        
        
        static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
        
    }   
}