package Lesson1;

public class Participant {
    public String name;
    public int maxObstacleHeight;
    public boolean isFinished;


    public Participant(String name, int maxObstacleHeight){
        this.name=name;
        this.maxObstacleHeight=maxObstacleHeight;
        this.isFinished=true;
    }

    public void showInfo(){
        System.out.println( name );
    }
    public boolean canMove (int height){
        return maxObstacleHeight>=height;
    }

}
