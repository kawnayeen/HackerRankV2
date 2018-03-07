package com.muhhsinin.day9;

public class Factorial {
    public int getFactorial(int input) {
        if (input < 0)
            return -1;
        if (input == 0)
            return 1;
        if (input == 1)
            return 1;
        return input * getFactorial(input - 1);
    }
}
