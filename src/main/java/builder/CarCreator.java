package builder;

public class CarCreator {
    public static void main(String[] args) {
        Car emptyCar = Car.builder().build();

        System.out.println(emptyCar);

//        1. na początek tworzony jest nowy obiekt przez metodę biulder w klasie Car
//        2. .brand("Ford") powoduje dodanie marki do istniejącego obiektu i jego zwrócenie z nową marką
//        public CarBuilder brand(final String brand) {
//            this.brand = brand;
//            return this;
//        }
        Car anotherCar = Car.builder()
                .brand("Ford")
                .model("Mustang")
                .year(2012)
                .build();
        System.out.println(anotherCar);
    }
}
