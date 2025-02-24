import MyAnimal.*;
public class animal {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.age = 3;
        myDog.breed = "golden doodle";
        myDog.name = "sunny";
        System.out.println(myDog.breed);
        System.out.println(Dog.getDogCount());

        Cat myCat = new Cat();
        myCat.name = "SnowBall";
        myCat.age = 2;
        myCat.breed = "sphynx";
        myCat.numOfLives = 5;
        System.out.println(myCat.name);
        System.out.println(Cat.getCatCount());
        int numOfAnimal= Cat.getCatCount()+ Dog.getDogCount();
       System.out.println(numOfAnimal);
    }
    }
