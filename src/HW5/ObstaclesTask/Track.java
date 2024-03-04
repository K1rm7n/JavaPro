package HW5.ObstaclesTask;

public class Track implements Obstacle{
    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.run(length);
        return true;
    }
}
