package abstractFactory;

public class CarFactory implements AbstractFactory<Car> {
    @Override
    public Car create(String type) {
        switch (type) {
            case "Pickup":
                return new Pickup();
            case "Cabriolet":
                return new Cabriolet();
            default:
                throw new RuntimeException("Sorry, we only sell Cabriolet and Pickup");
        }
    }

//    NOWY SPOSÓB PO JAVA 8
//    public static final Map<String, Supplier<Pizza>> PIZZA_MAP = new HashMap<>();
//
//    static {
//        PIZZA_MAP.put("Pepperoni", () -> new PepperoniPizza());
//        PIZZA_MAP.put("Hawaiian", () -> new HawaiianPizza());
//    }
//
//    public static Pizza preparePizza(final String whatPizza) {
//        return Optional.ofNullable(PIZZA_MAP.get(whatPizza))
//                .map(Supplier::get)
//                .orElseThrow(() -> new RuntimeException(String.format("Sorry, we don't sell [%s]", whatPizza)));
//    }

}
