package interfaces;

public class nicecar {
    private engine engin;
    private media music=new jblplayer();

public nicecar(){
    engin=new powerengine();

}

     public nicecar(engine engin){
        this.engin=engin;
     }
     public void start(){
        engin.start();
     }
     public void stop(){
        engin.stop();
     }
     public void startmusic(){
        music.start();
     }
     public void stopmusic(){
        music.stop();
     }
     public void upgradeengine(){
        this.engin=new electriccar();
        
     }

}
