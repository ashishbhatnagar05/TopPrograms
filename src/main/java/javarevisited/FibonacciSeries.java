package javarevisited;

public class FibonacciSeries {

  public static void main(String[] args) {

    int fib = calculateFibonacciSeriesUsingLoop(8);
    System.out.println("loop:" + fib);
    fib = calculateFibonacciSeriesUsingRecursion(8);
    System.out.println("recursion:" + fib);
  }

  private static int calculateFibonacciSeriesUsingLoop(int n) {
    int t1 = 0;
    int t2 = 1;
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum = t1 + t2;
      t1 = t2;
      t2 = sum;
    }
    return sum;
  }

  private static int calculateFibonacciSeriesUsingRecursion(int n) {
    if (n == 0) return 1;
    else {
      return n + calculateFibonacciSeriesUsingRecursion(n - 1);
    }
  }
}
