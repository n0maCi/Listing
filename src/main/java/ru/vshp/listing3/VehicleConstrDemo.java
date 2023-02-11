package ru.vshp.listing3;

class Vehicle1 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    double distance(double interval) {
        double value = maxspeed * interval;
        return value;
    }
    // Listing 3.8
    /*Vehicle1(int p, int w, int ms, int bu) {
        passengers = p;
        wheels = w;
        maxspeed = ms;
        burnup = bu;
    }*/
    // Listing 3.9
    Vehicle1(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }

}

class VehicleConstrDemo {
    public static void main(String[] args) {
        Vehicle1 car = new Vehicle1(2, 4, 130, 30);
        Vehicle1 bus = new Vehicle1(45, 4, 100, 25);

        double interval = 1;
        double distanceCar = car.distance(interval);
        double distanceBus = bus.distance(interval);

        System.out.println("Автомобиль с " + car.passengers + " пассажирами " + "проедет за 1 час " + distanceCar + " км.");
        System.out.println("Автобус с " + bus.passengers + " пассажирами " + "проедет за 1 час " + distanceBus + " км.");
    }
}
