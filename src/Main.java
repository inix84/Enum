package Transport;
import Auto_Racing.*;
public class Main {
    public static void main(String[] args) {
        Car lada =new Car("Lada","2114",1.7);
        Car chevrolet = new Car("Chevrolet", "Lacetti", 1.7d);
        Car skoda = new Car("Skoda","Fabia",1.3);
        Car renault = new Car("Renault","Sandero Stapway",1.6);
        Bus volgaBus = new Bus("Волгабас", "5270", 6.7);
        Bus hyundaiBus = new Bus("Hyundai", "Universe", 12.4);
        Bus manBus = new Bus("Man", "Lion`s Coach", 12.1);
        Bus volvoBus = new Bus("Volvo","B10M",9.7);
        Trucks manTruckTruck = new Trucks("Man","TGS 6x6",13.4);
        Trucks renaultTruck = new Trucks("Renault", "Premium",7.3);
        Trucks mersedesBenzTruck = new Trucks("Mersedes-Benz 6x6", "Arocs",10.3 );
        Trucks kamazTruck = new Trucks("КамАЗ", "4325",6.3);
        System.out.println(chevrolet);
        System.out.println(skoda);
        System.out.println(renault);
        System.out.println(lada);
        System.out.println(manBus);
        System.out.println(volgaBus);
        System.out.println(hyundaiBus);
        System.out.println(volvoBus);
        System.out.println(kamazTruck);
        System.out.println(manTruckTruck);
        System.out.println(mersedesBenzTruck);
        System.out.println(renaultTruck);
        renault.pitStop();
        System.out.println(manBus.bestLapTime());
        System.out.println(manBus.maxSpeed());
        DriverCategoryB Ivan = new DriverCategoryB("Иванов Иван", "B",3,chevrolet);
        System.out.println(Ivan);
        kamazTruck.startMoving();
        kamazTruck.pitStop();
        kamazTruck.stopMoving();
        DriverCategoryC Angelina = new DriverCategoryC("Анжела Батьковна","C", 4,manTruckTruck);
        System.out.println(Angelina);
        DriverCategoryD Rita = new DriverCategoryD("Маргарита Павловна", "D", 6, volgaBus);
        System.out.println(Rita);
    }
}