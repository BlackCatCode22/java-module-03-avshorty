package MyAnimal;

public class Dog {
   public String name;
   public String breed;
   public int age;
   private static int dogCount=0;
   public Dog(){
        dogCount++;
    }
    public static int getDogCount(){
       return dogCount;
}
}
