package HW5.ObstaclesTask;

public class Wall implements Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.jump(height);
        return height <= 3;
    }
}
