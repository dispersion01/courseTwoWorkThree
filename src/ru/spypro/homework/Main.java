package ru.spypro.homework;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car("Машина один", 4);
        Car car2 = new Car("Машина два", 4);
//        car.modelName = "car1";
//        car2.modelName = "car2";
//        car.wheelsCount = 4;
//        car2.wheelsCount = 4;
        car.getModelName();
        car.updateTyre();



        Truck truck = new Truck("Грузовик один", 8);
        Truck truck2 = new Truck("Грузовик два", 6);
//        truck.getModelName(truck2) = "truck1";
//        truck2.modelName = "truck2";
//        truck.wheelsCount = 6;
//        truck2.wheelsCount = 8;
        truck.getModelName();
        truck.checkEngine();


        Bicycle bicycle = new Bicycle("Велосипед один", 2);
        Bicycle bicycle2 = new Bicycle("Велосипед два", 3);
//        bicycle.modelName = "bicycle1";
//        bicycle2.modelName = "bicycle2";
//        bicycle.wheelsCount = 2;
//        bicycle2.wheelsCount = 2;
        bicycle.updateTyre();
        bicycle.getWheelsCount();



        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);



    }
}
