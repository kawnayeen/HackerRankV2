package com.muhhsinin.day10;

/**
 * kawnayeen
 * 3/6/18
 */
class BinaryNumbers {
    String getBinary(int decimalNumber) {
        if (decimalNumber < 0)
            return "";
        if (decimalNumber == 0)
            return "0";
        if (decimalNumber == 1)
            return "1";
        return getBinary(decimalNumber / 2) + decimalNumber % 2;
    }
}
