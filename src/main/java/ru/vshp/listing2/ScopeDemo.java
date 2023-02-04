package ru.vshp.listing2;

public class ScopeDemo {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("До вложенного блока: x равно " + x);
        {
            int y = 3;
            System.out.println("Внутренний блок: х равно " + x + ", y равно " + y);
            x = y * 3;
        }
        System.out.println("После вложенного блока: х равно " + x);
    }
}
