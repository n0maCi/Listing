package ru.vshp.listing3;

class Vehicle5 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle5(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.setWheels(wheels);
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }

    Vehicle5() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
    }

    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    }

    int getMaxSpeed() {
        return  this.maxspeed;
    }

    int getWheels() {
        return this.wheels;
    }

    void setWheels(int wheels) {
        if ((wheels < 1) || (wheels > 24)) {
            System.out.println("Неверно указано число");
            return;
        }
        this.wheels = wheels;
    }
}

class Auto extends Vehicle5 {
    boolean sunroof;
}
public class ExtendsVehicleDemo {
    public static void main(String[] args) {
        Auto bmw = new Auto();
        bmw.sunroof = true;
        System.out.println("Путь, пройденный за 1.5 часа: " + bmw.distance(1.5) + " км.");
        System.out.println("Max.скорость: " + bmw.getMaxSpeed() + " км/ч.");
        System.out.println("Наличие люка: " + bmw.sunroof);
    }
}
