package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldRangeNumber() {
      SQRService service = new SQRService();

        int expected = 3;
        int actual = service.rangeNumber(200, 300);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinNumber() {
        SQRService service = new SQRService();

        int expected = 5;
        int actual = service.rangeNumber(100, 200);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxNumber() {
        SQRService service = new SQRService();

        int expected = 9;
        int actual = service.rangeNumber(8000, 15000);

        assertEquals(expected, actual);
    }
}


