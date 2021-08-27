package Lesson1;


public class Lesson1 {

    public static void main(String[] args) {
        Participant[] redTeamMembers = new Participant[4];
        redTeamMembers[0] = new Participant("Ivan", 16);
        redTeamMembers[1] = new Participant("Roman", 17);
        redTeamMembers[2] = new Participant("John", 14);
        redTeamMembers[3] = new Participant("Helga", 6);

        Team redTeam = new Team("Red", redTeamMembers);

        ObstacleBase[] obstacles = new ObstacleBase[4];
        obstacles[0] = new SmallObstacle();
        obstacles[1] = new HighObstacle();
        obstacles[2] = new SmallObstacle();
        obstacles[3] = new HighObstacle();

        Course course = new Course(obstacles);
        course.doIt(redTeam);


    }


}