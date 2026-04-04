public class oddoperator {

    public static void main(String args []){
        int number=55;
        System.out.println(odd(number));


    }
    static boolean odd(int number){
        return (number & 1)==1;
    }
}

    
