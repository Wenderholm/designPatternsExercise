package singleton;

public class Main {

    public static void main(String[] args) {
//	 singleton
//        warunki stowrzenia
//        1. prywatny konstruktor
//        2. instancja która będzie występowała tylko raz -> w zmiennej private static w  tej klasie (unikalnaInstancja)
//        3. statyczna metoda publiczna (getInstance())
//        4. klasa finalna

        LazyInitializationSingleton instance = LazyInitializationSingleton.getInstance();
        System.out.println(instance);
        LazyInitializationSingleton instance1 = LazyInitializationSingleton.getInstance();
        System.out.println(instance1);
        LazyInitializationSingleton instance2 = LazyInitializationSingleton.getInstance();
        System.out.println(instance2);
        LazyInitializationSingleton instance3 = LazyInitializationSingleton.getInstance();
        System.out.println(instance3);
        LazyInitializationSingleton instance4 = LazyInitializationSingleton.getInstance();
        System.out.println(instance4);

// po wywołaniu kodu powyżej widać że instancja klasy uniklanej jest tworzeona tylko raz zgodnie z założeniem
// wzoraca singleton i kazda z instancji utworzonych powyżej jest tą samą istancją czyli wskazuje na ten sam obiekt


        CzekoladowyKociol czekoladowyKociol1 = CzekoladowyKociol.pobierzInstancje();
        System.out.println(czekoladowyKociol1);


    }
}
