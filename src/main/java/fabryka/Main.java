package fabryka;

public class Main {
    public static void main(String[] args) {
        Pizza pepperoni = PizzaFactory.preparePizza("Pepperoni");
        System.out.println(pepperoni);
        Pizza hawaiian = PizzaFactory.preparePizza("Hawaiian");
        System.out.println(hawaiian);
//        PizzaFactory.preparePizza("AnotherPizza");

//        dzieki temu ze uzyawmy interfejsu Pizza mozemy wymusic kontrakt na klasach dzidziczących czyli
//        PepperoniPizza oraz HawaiianPizza ponieważ implementująć Pizza musza mieć nadpisane rzeczy z pizza



    }
}
