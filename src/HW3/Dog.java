package HW3;

public class Dog extends Animal{
    private static int dogCount = 0;
    public Dog(){
        dogCount++;
    }
    @Override
    public String getName(){
        return "Dog";
    }
    @Override
    public void run(int distance){
        if(distance <= 500)
            run(distance);
        else
            System.out.println("Dog can't run more than 500 meters!");
    }
    @Override
    public void swim(int distance){
        if(distance <= 10)
            swim(distance);
        else
            System.out.println("Dog can't swim more than 10 meters!");
    }
    public static int getDogCount(){
        return dogCount;
    }
}