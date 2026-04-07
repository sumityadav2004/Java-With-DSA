package interfaces;

public class car implements brake,engine {
 
    @Override
    public void brake(){
        System.out.println("break like a normal car");
    }
    @Override
    public void start(){
        System.out.println("startlike a normal car");
    }
    @Override
    public void stop(){
        System.out.println("stop like a nrmal car");

    }
    @Override
    public void acc(){
        System.out.println( "acc like a nomal car");


    }






}
