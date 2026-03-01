public class mountainarray {
    public static void main(String args[]){
   int arr[]={12,13,14,15,16,10,9,8,6,5};
   int target=6;
     int ans=search(arr, target);
     System.out.println(ans);


   }
   static int search (int arr[],int target){
    int peak=mountainarray(arr,target);
    int firsttry=orderAgonstic(arr,target,0,peak);
   
   if(firsttry != -1){
    return firsttry;

     }
     else{
        return orderAgonstic(arr, target, peak+1,arr.length-1);
     }
   }
     static int mountainarray(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        if(arr[mid]<arr[mid+1]){
            mid=end;
        }
            else{
             start =mid+1;
            }
            return start;
        
     }
     static int orderAgonstic(int arr[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[start]<arr[mid]){
            if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }}
             else{
                if(arr[mid]>target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }}
            }
        
        return -1;

     }

     

    }

