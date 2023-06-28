package org.minhthuan.mathutil.core;

public class MathUtility {

    public static final double PI = 3.1415;

    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20, please.");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

//        long product = 1;
//        for (int i = 2; i <= n; i++)
//            product *= i;
//        return product;
        return n * getFactorial(n - 1);
    }
}
