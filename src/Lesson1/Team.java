package Lesson1;

public class Team {
    public String name;
    public Participant[] participants;
    public Team(String name, Participant[] participants) {
        this.name=name;
        this.participants=participants;
    }

    public void showAll() {
        System.out.println("Team " + name);
        for (int i=0; i<participants.length; i++){
            participants[i].showInfo();
        }
    }

    public void showFinished(){
        System.out.println("Team " + name);
        for (int i=0; i<participants.length; i++){
            if (participants[i].isFinished) {
                participants[i].showInfo();
            }
        }
    }

    public void move(ObstacleBase obstacle) {
        for (int i = 0; i < participants.length; i++) {
            if(!participants[i].canMove(obstacle.getHeight())){
                participants[i].isFinished=false;
            }
        }
    }
}
