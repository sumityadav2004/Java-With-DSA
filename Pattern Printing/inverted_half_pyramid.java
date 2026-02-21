package Pattern;
public class inverted_half_pyramid{
    public static void main(String args []){
   pattern2(4,0);

    }
    static void pattern(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            pattern(r,c+1);
            System.out.print("*");
            
        }
        else{
        
        pattern( r-1,0);
         System.out.println();
        }
    }
    static void pattern2(int row,int c){
        if(row==0){
            return;
        }
        if(c<row){
             System.out.print("*");
            pattern2(row,c+1);
           
            
        }
        else{
        System.out.println();

        pattern2( row-1,0);
         
}
}}