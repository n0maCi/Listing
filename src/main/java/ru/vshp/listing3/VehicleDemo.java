package ru.vshp.listing3;

class Vehicle {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;
    void distance(double interval) {
        double value = maxspeed * interval;
        System.out.println("пройдет путь, равный " + value + " км.");
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        car1.passengers = 2;
        car1.wheels = 6;
        car1.maxspeed = 130;
        car1.burnup = 30;
        double distance = car1.maxspeed * 0.5;
        System.out.print("За полчаса car1 может проехать ");
        System.out.println(distance + " км.");
        car1 = null;
    }
}
