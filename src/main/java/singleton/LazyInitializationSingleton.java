package singleton;

public class LazyInitializationSingleton {

    private static LazyInitializationSingleton unikalnaInstancja;

    private LazyInitializationSingleton() {
        System.out.println("creating LazyInitializationSingleton");
    }

    public static LazyInitializationSingleton getInstance() {
        System.out.println("LazyInitializationSingleton getInstance()");
        if(unikalnaInstancja == null){
            unikalnaInstancja = new LazyInitializationSingleton();
        }
        return unikalnaInstancja;
    }

    static void someStaticMethod(){
        System.out.println("some static method");
    }
}
