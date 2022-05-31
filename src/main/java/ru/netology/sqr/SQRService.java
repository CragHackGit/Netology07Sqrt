package ru.netology.sqr;

public class SQRService {
    public int calcSqrtInRange(int lower, int upper) {
        int counter = 0;
        for (int i = 10; i <= 99; i = i + 1) {
            if (i * i < lower) {
                continue;
            } else if (i * i > upper) {
                break;
            }
            System.out.println("Квадрат числа: " + i + " равен: " + i * i);
            counter = counter + 1;
        }
        return counter;
    }
}