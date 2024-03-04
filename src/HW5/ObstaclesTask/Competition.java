package HW5.ObstaclesTask;

public class Competition {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Andrew"),
                new Cat("Bart"),
                new Robot("XL-R8")
        };

        Obstacle[] obstacles = {
                new Track(100),
                new Wall(2),
                new Track(200),
                new Wall(3)
        };

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(participant)) {
                    System.out.println(participant.getClass().getSimpleName() + " " + participant + " didn't pass the obstacle");
                    break;
                }
            }
        }
    }
}
