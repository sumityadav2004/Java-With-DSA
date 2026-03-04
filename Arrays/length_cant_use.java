public class lengthcantuse {
    public static void main(String args []){
     int arr[]={12,13,16,19,21,25,28,32};
     int target=21;

      int ans=cantlength(arr,target);
      System.out.println(ans);

    }
    static int cantlength(int arr[] ,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=start+(end-start+1);
            start=temp;
        }
        return binary(arr ,target,start,end);
    }
   static int binary(int arr [],int target,int start,int end){
            while(start<=end){

            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;

            }else if(target<arr[mid]){
                end=mid-1;
            }
                       else{
                return mid;
             }
            }
            return -1;
            
        }
    }


