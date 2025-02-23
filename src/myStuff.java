import p1.driver;
public class myStuff {

    public static void main(String[] args) {
        driver car = new driver();
        car.make = "ford";
        car.model = "flex";
        car.miles = 155000;
        car.year = 2016;
        car.value = 8000;
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
    }
}