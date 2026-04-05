public class classbox {

double l;
double h;
double w;


classbox () {
    super();
  this.l=-1;
  this.h=-1;
  this.w=-1;
}
classbox(double side){
    
    this.l=side;
    this.w=side;
    this.h=side;
}
  classbox(double l,double h,double w){
    this.l=l;
    this.w=w;
    this.h=h;
}
classbox(classbox old){
    this.l=old.l;
    this.h=old.h;
    this.w=old.w;
}
public void gretting(){
    System.out.println("there is the boxes");
}

}
