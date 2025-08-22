public class FibonacciIterative {
    private long count = 0;
    public long compute(int n) {
        if (n <= 1) {
            this.count++;
            return n;
        }

        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long next = a + b;
            a = b;
            b = next;

        }
        return b;
    }
}

public void setCount (long n){
    this.count = n;
}

public void getCount (){
    return this.count();
}

void main() {
}

