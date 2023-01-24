package fabryka;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class PizzaFactory {
// STARY SPOSÓB PRZED JAVA 8
//    public static Pizza preparePizza(final String whatPizza) {
//        switch (whatPizza) {
//            case "Pepperoni":
//                return new PepperoniPizza();
//            case "Hawaiian":
//                return new HawaiianPizza();
//            default:
//                throw new RuntimeException("Sorry, we only sell Pepperoni and Hawaiian pizza");
//        }
//    }

//    NOWY SPOSÓB PO JAVA 8
    public static final Map<String, Supplier<Pizza>> PIZZA_MAP = new HashMap<>();

    static {
        PIZZA_MAP.put("Pepperoni", () -> new PepperoniPizza());
        PIZZA_MAP.put("Hawaiian", () -> new HawaiianPizza());
    }

    public static Pizza preparePizza(final String whatPizza) {
        return Optional.ofNullable(PIZZA_MAP.get(whatPizza))
                .map(Supplier::get)
                .orElseThrow(() -> new RuntimeException(String.format("Sorry, we don't sell [%s]", whatPizza)));
    }

}
