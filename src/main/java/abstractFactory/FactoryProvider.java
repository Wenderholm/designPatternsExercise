package abstractFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class FactoryProvider {

//    public static AbstractFactory<?> getFactory(String whatFactory) {
//        switch (whatFactory) {
//            case "Pizza":
//                return new PizzaFactory();
//            case "Car":
//                return new CarFactory();
//            default:
//                throw new RuntimeException("Sorry. we only provided cars and pizzas");
//        }
//    }

    //    NOWY SPOSÓB PO JAVA 8
    public static final Map<String, Supplier<?>> FACTORY_MAP = new HashMap<>();

    static {
        FACTORY_MAP.put("Pizza", () -> new PizzaFactory());
        FACTORY_MAP.put("Car", () -> new CarFactory());
    }

    public static AbstractFactory prepareFactory(final String whatFactory) {
        return (AbstractFactory) Optional.ofNullable(FACTORY_MAP.get(whatFactory))
                .map(Supplier::get)
                .orElseThrow(() -> new RuntimeException(String.format("Sorry, we don't sell [%s]", whatFactory)));
    }
}
