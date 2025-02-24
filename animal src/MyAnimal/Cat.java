package MyAnimal;

public class Cat {
    public static final int maxLives=9;
    public String name;
    public String breed;
    public int age;
    public int numOfLives;
    private static int catCount=0;

    public Cat(){
        catCount++;
    }
    public static int getCatCount(){
        return catCount;
    }
}
