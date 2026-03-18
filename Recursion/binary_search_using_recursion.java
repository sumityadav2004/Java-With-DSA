public class binary_search_using_recursion{
    public static void main(String args[]){
         int arr[]={2,4,7,9,13,16,18};
         int target=16;
        int ans=search(arr,target,0,arr.length-1);   
        System.out.println(ans);
    }
        static int search(int[] arr, int target, int start, int end){

        if(start>end){
            return -1;

        }
        int mid=start+ (end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            return search(arr,target,start,mid-1);
        }
        return search(arr,target,mid+1,end);
    }
}
