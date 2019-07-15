package javarevisited;

public class PrimeCheck {

  public static void main(String[] args) {
    int n = 6;
    boolean isprime = isPrimeUsingSqrt(n);
    System.out.println("Is number " + n + " prime: " + isprime);
  }

  private static boolean isPrimeUsingSqrt(int n) {
    if (n <= 0 || n == 1 || n % 2 == 0) return false;
    if (n == 2 || n == 3) return true;
    int sqrt = (int) Math.sqrt(n) + 1;
    for (int i = 2; i < sqrt; i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
}
