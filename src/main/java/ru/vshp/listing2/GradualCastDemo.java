package ru.vshp.listing2;

public class GradualCastDemo {
    public static void main(String[] args) {
        byte x = 5, z;
        int y;
        y = x * x;
        z = (byte) (x * x);
    }
}
