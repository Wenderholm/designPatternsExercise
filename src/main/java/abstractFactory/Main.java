package abstractFactory;

public class Main {
    public static void main(String[] args) {

//        Object o1 = FactoryProvider.getFactory("Pizza").create("Pepperoni");
        Object o3 = FactoryProvider.prepareFactory("Pizza").create("Pepperoni");
        Object o4 = FactoryProvider.prepareFactory("Car").create("Pickup");
//        Object o2 = FactoryProvider.getFactory("Car").create("Pickup");
        System.out.println(o3);
        System.out.println(o4);
    }
}
