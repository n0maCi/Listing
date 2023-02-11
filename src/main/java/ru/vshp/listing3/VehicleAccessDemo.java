package ru.vshp.listing3;

class Vehicle2 {
    int passengers;
    int wheels;
    private int maxspeed;
    int burnup;

    Vehicle2(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }

    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    }
}

class VehicleAccessDemo {
    public static void main(String[] args) {
        Vehicle2 ferrari = new Vehicle2(2, 4, 360, 12);
        double distance = ferrari.distance(0.5);
        System.out.println("Ferrari за полчаса проедет " + distance + " км.");
        //System.out.println("Скорость Ferrari: " + ferrari.maxspeed + " км/ч");

    }
}
