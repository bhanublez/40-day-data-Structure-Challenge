public class addDigit {
    public int addDigits(int num) {
        if (num / 10 == 0) {
      return num;
    }
    int digitSum = 0;
    while (num > 0) {
      digitSum += num % 10;
      num /= 10;
    }
    return addDigits(digitSum);
    }

    public static void main(String[] args) {
        addDigit ad = new addDigit();
        int num = 38;
        System.out.println(ad.addDigits(num));
    }
}
