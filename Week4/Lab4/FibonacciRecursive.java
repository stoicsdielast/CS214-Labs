package com.rudrprasad;

public class FibonacciRecursive {
    public long compute(int n) {
        if (n <= 1) return n;
        return compute(n - 1) + compute(n - 2);
    }
}
