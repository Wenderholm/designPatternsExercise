package fabryka;

public class PepperoniPizza implements Pizza{
    @Override
    public String whatSauce() {
        return "Spicy";
    }

    @Override
    public void bake() {
        System.out.println("I'm soo backing");
    }

    public void beMoreSpacy(){
        System.out.println("pepperoni be more spacy");
    }

}
