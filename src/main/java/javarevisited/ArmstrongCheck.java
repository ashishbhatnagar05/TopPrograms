package javarevisited;

public class ArmstrongCheck {

  public static void main(String[] args) {
    System.out.println(isArmstrong(153));
  }

  private static boolean isArmstrong(int num) {
    int actual = num;
    int sum = 0;
    while (num != 0) {
      int temp = num % 10;
      sum = sum + (int) Math.pow(temp, 3);
      num = num / 10;
    }

    if (sum == actual) return true;

    return false;
  }
}
