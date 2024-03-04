package HW3;

public class Cat extends Animal{
    private static int catCount = 0;
    public Cat(){
        catCount++;
    }
    @Override
    public String getName(){
        return "Cat";
    }
    @Override
    public void run(int distance){
        if(distance <= 200)
            run(distance);
        else
            System.out.println("Cat can't run more than 200 meters!");
    }
    @Override
    public void swim(int distance){
        System.out.println("Cat can't swim!");
    }
    public static int getCatCount(){
        return catCount;
    }
}
