//https://leetcode.com/contest/biweekly-contest-110/problems/account-balance-after-rounded-purchase/
public class round {
    public static int accountBalanceAfterPurchase(int number) {
        int remainder = number % 10;
        int distanceToPrev = remainder;
        int distanceToNext = 10 - remainder;
        if (distanceToPrev < distanceToNext) {
            return 100-(number - distanceToPrev);
        } else {
            return 100-(number + distanceToNext);
        }
    }
    
        public static void main(String[] args) {
            int number1 = 43;
            int nearestRoundedValue1 = accountBalanceAfterPurchase(number1);
            System.out.println("Account balance becomes at 43: " + nearestRoundedValue1); // Output will be 40
    
            int number2 = 15;
            int nearestRoundedValue2 = accountBalanceAfterPurchase(number2);
            System.out.println("Account Balance become at 15: " + nearestRoundedValue2); // Output will be 20
        }
    
}
