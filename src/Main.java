import Transport.*;
public class Main {
    public static void main(String[] args) {
               Car audi = new Car(
                "Audi",
                "A8",
                3.0f,
                BodyType.SEDAN);
        audi.printType();
        Truck kamaz = new Truck(
                "KAMAZ",
                "4911-EXTREME",
                17.2f,
                LoadType.N3);
        kamaz.printType();
        Bus peugeot = new Bus(
                "Peugeot",
                "806",
                2.0f,
                CapacityType.ESPECIALLY_SMALL);
        peugeot.printType();
    }
   }