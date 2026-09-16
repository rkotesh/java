package CIET;

abstract class Calculator {

    abstract void divide(int a, int b);
}

class MyCalculator extends Calculator {

    void divide(int a, int b) {
        int c = a / b;
        System.out.println("Result: " + c);
    }
}

public class Dataabstract {

    public static void main(String[] args) {

        MyCalculator obj = new MyCalculator();

        obj.divide(10, 2);
    }
}