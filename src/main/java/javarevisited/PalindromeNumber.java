package javarevisited;

public class PalindromeNumber {
  public static void main(String[] args) {
    System.out.println(isPalindrome(2312));
  }

  private static boolean isPalindrome(int num) {
    int actual = num;
    int reverse = 0;
    while (num != 0) {
      reverse = reverse * 10 + num % 10;
      num = num / 10;
    }
    if (actual == reverse) return true;
    return false;
  }
}
