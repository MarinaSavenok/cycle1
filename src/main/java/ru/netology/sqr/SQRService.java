package ru.netology.sqr;

public class SQRService {
    public int rangeNumber(int nummin, int nummax) {
        int counter = 0;
        int j;
        for (int i = 10; i < 99; i++) {
            j = i * i;
            if (j >= nummin && j <= nummax)
                counter++;
        }

        return counter;
    }
}
