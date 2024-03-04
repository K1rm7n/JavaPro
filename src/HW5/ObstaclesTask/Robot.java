package HW5.ObstaclesTask;

public class Robot implements Participant{
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        System.out.println(name + " ran " + distance + " m.");
    }

    @Override
    public void jump(int height) {
        System.out.println(name + " jumped to a height of " + height + " m.");
    }
}
