 public class binarysearchdecending{
   public static void main(String args[]){
    int arr []={65,63,61,54,52,42,32,21,11};
    int target=21;
   int ans=binarysearch(arr,target);
   System.out.println(ans);

}
static int binarysearch(int arr[],int target){
    int start=0;
    int end=arr.length-1;
    while(start<=end){
    int mid=start+(end-start)/2;
    if(arr[mid]>target){
        start=mid+1;
    }
    else if(arr[mid]<target){
        end=mid-1;
    }
    else{
    return mid;
    }
          
} 
     return -1;

}
 }


   