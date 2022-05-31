package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int lowerBorder = 200;
        int upperBorder = 300;
        System.out.println("Количество квадратов в диапазоне от " + lowerBorder + " до " + upperBorder + " равно: " + service.calcSqrtInRange(lowerBorder, upperBorder));

    }
}