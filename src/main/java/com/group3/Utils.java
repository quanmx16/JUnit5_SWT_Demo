package com.group3;

public class Utils {
    public static int getFibonacci(int x) {
        int result;
        if (x < 1)
            throw new InvalidValueException("Argument has to be greater than 0");
        else if (x == 1 || x == 2) {
            result = 1;
        } else {
            int pre1 = 1;
            int pre2 = 1;
            int current = 2;
            int tmp;
            for (int i = 2; i < x; i++) {
                tmp = current;
                current = pre1 + pre2;
                pre2 = pre1;
                pre1 = current;
            }
            result = current;

        }
        return result;
    }
}
