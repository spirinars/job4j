package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true; // это код из задания//
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[0]) {
                result = false;
            }
        }
    return result;
    }
}


