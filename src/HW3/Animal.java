package HW3;

public class Animal {
    private static int animalCount = 0;
    public Animal(){
        animalCount++;
    }
    public void run(int distance){
        System.out.println(getName() + "ran" + distance + "m.");
    }
    public void swim(int distance){
        System.out.println(getName() + "swam" + distance + "m.");
    }

    public String getName() {
        return null;
    }

    public static int getAnimalCount(){
        return animalCount;
    }
}