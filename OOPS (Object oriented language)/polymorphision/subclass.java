package polymorphision;

public class subclass extends A{
      public subclass (int num,String name){
        super(num,name);

      }
      public static void main(String args []){
        A obj=new A(42,"sumit");
        int n=obj.num;
      }
    
}
