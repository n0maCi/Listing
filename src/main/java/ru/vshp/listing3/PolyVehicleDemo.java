package ru.vshp.listing3;

class PolyVehicleDemo {
    public static void main(String[] args) {
        Auto1 a = new Auto1(true);
        Vehicle6 v = new Vehicle6();

        Vehicle6[] pvd = {a, v};

        for (int i = 0; i < pvd.length; i++) {
            System.out.println(pvd[i].toString());
        }
    }
}
