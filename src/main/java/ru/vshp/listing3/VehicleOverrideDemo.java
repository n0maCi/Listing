package ru.vshp.listing3;

class Vehicle6 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle6(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.setWheels(wheels);
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }

    Vehicle6() {
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

    public String toString() {
        return "Vehicle(passengers=" + passengers + ";" +
                "wheels=" + wheels + ";" +
                "maxspeed=" + maxspeed + ";" +
                "burnup=" + burnup + ")";
    }
}

class Auto1 extends Vehicle6 {
    boolean sunroof;

    Auto1(boolean sunroof) {
        this(4, 4, 200, 12, sunroof);
    }

    Auto1(int f, int g, int h, int j, boolean sunroof) {
        super(f,g,h,j);
        this.sunroof = sunroof;
    }

    public String toString() {
        return "Auto(passengers=" + passengers + ";" +
                "wheels=" + super.getWheels() + ";" +
                "maxspeed=" + super.getMaxSpeed() + ";" +
                "burnup=" + burnup + ";" +
                "sunroof=" + sunroof + ")";
    }
}
class VehicleOverrideDemo {
    public static void main(String[] args) {
        Vehicle6 v = new Vehicle6(2, 2, 100, 9);
        Auto1 a = new Auto1(2, 4, 180,12, true);
        System.out.println("Vehicle6.toString(): " + v.toString());
        System.out.println("Auto1.toString(): " + a.toString());
    }
}
