package Lesson1;

public  class Course {
    public ObstacleBase[] obstacles;

    public Course(ObstacleBase[] obstacles) {
        this.obstacles = obstacles;
    }


    public void doIt(Team team) {
        team.showAll();
        System.out.println();
          for (int i = 0; i < obstacles.length; i++) {
            team.move(obstacles[i]);
        }
        System.out.println("Course is finished");
          team.showFinished();
    }
}
