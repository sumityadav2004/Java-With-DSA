public class constructor {
    public static void main(String args []){
   
// int[] rno =new int[5];
   //String[] name=new String[5];
   //float[] marks=new float[5];



   Student[] students= new Student[5];

   Student kunal=new Student();
   kunal.rno=11;
   kunal.name="kunal khus";
   kunal.marks=89;
   Student sumit=new Student();
   sumit.rno=27;
   sumit.name="sumit yadav";
   sumit.marks=87.6f;
   Student lokesh= new Student();
   Student rahul=new Student();
   //we will use this fr three object.
  // Student lokesh=new Student(17,"lokesh tewatia",89);

  //  System.out.println(Arrays.toString(students));
       //  System.out.println(kunal.name);
         //System.out.println(sumit.name);
       //  System.out.println(lokesh.rno);
         //System.out.println(rahul.rno);
        //rahul.changename("abhi yadav");
         //rahul.greeting();
        //rahul.changename("abhi yadav");
         Student danish=new Student(07,"danish jain",88.7f);
         
          // System.out.println(danish.rno);
          Student golu=new Student();
          System.out.println(golu.name);
          Student one =new Student();
           Student two=one;
         //  one.name="yadav hi kahde";  //here one pit refer two anoter.
           //System.out.println(two.name);    
    
        }
}

class Student{
int rno=13 ;
String name="sumit yadav corder";
float marks= 99;



void greeting(){
    System.out.println("hello i am "+ this.name);
}
void changename(String newname){
    name=newname;
}
Student(Student other){
    this.rno=other.rno;
    this.name=other.name;
    this.marks=other.marks;
}

Student(){

    this.rno=17;
    this.name="lokesh tewatia";
    this.marks=89.5f;

}
Student(int rno,String name,float marks){
      this.rno=rno;
      this.name=name;
      this.marks=marks;
}   
   }
   
   
   
    
     
     








       