package abstractFactory;

public class Pickup implements Car {

    @Override
    public void drive() {
        System.out.println("Pickup driving");
    }

    public void delivery(){
        System.out.println("Pickup is very good to transport something");
    }
}
