package ru.vshp.listing3;

class Vehicle3 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle3(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.setWheels(wheels);
        this.maxspeed = maxspeed;
        this.burnup = burnup;
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

class VehicleGetSetMethod {
    public static void main(String[] args) {
        Vehicle3 ferrari = new Vehicle3(2, -2, 360, 12);
        System.out.println("Max скорость: " + ferrari.getMaxSpeed() + " км/ч");
        System.out.println("Число колес: " + ferrari.getWheels());
    }
}
