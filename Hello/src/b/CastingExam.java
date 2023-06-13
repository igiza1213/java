package b;

public class CastingExam {
    public static void main(String[] args) {
        Car myCar, yourCar;
        Bus myBus, yourBus;
        Truck myTruck, yourTruck;

        myCar = new Car();
        myBus = new Bus();
        myTruck = new Truck();

        System.out.println("[" + myCar.print() + "]");
        System.out.println("[" + myBus.print() + "]");
        System.out.println("[" + myTruck.print() + "]");

        yourCar = myBus;
        yourBus = (Bus) yourCar;
        System.out.println("[" + yourBus.print() + "]");
        yourCar = myTruck;
        yourTruck = (Truck)yourCar;
        System.out.println("[" + yourTruck.print() + "]");

    }
}
