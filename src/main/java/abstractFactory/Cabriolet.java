package abstractFactory;

public class Cabriolet implements Car {

    @Override
    public void drive() {
        System.out.println("Cabriolet driving");
    }

    public void openRoof(){
        System.out.println("Open roof option in Cabriolet");
    }
}
