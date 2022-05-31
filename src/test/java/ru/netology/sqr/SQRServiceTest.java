package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    void validData() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int lowerBorder = 200;
        int upperBorder = 300;
        int expected = 3;

        // вызываем целевой метод:
        int actual = service.calcSqrtInRange(lowerBorder, upperBorder);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void fullRange() {
        SQRService service = new SQRService();

        int lowerBorder = 100;
        int upperBorder = 9801;
        int expected = 90;

        int actual = service.calcSqrtInRange(lowerBorder, upperBorder);

        assertEquals(expected, actual);
    }

    @Test
    void outOfRange() {
        SQRService service = new SQRService();

        int lowerBorder = -1000000;
        int upperBorder = 1000000;
        int expected = 90;

        int actual = service.calcSqrtInRange(lowerBorder, upperBorder);

        assertEquals(expected, actual);
    }

    @Test
    void notInRange() {
        SQRService service = new SQRService();

        int lowerBorder = 0;
        int upperBorder = 99;
        int expected = 0;

        int actual = service.calcSqrtInRange(lowerBorder, upperBorder);

        assertEquals(expected, actual);
    }
}
