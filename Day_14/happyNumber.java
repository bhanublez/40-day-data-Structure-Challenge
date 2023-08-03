//https://leetcode.com/problems/happy-number/description/
public class happyNumber {
    //Brute force
    public boolean isHappy(int n) {
        int sum = 0;
        int count = 0;
        while (n != 1) {
            while (n != 0) {
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            n = sum;
            sum = 0;
            count++;
            if (count > 100) {
                return false;
            }
        }
        return true;
    }

    //Floyd Cycle detection algorithm
    //Two pointers, one slow one fast
    public boolean isHappyOptimal(int n) {
        //Two pointer approach
        int slow=n;
        int fast=n;
        do{
            slow=square(slow);
            fast=square(square(fast));
        }while(slow!=fast);

        return slow==1;
    }
     public int square(int num) {
        
        int result = 0;
        
        while(num > 0) {
            int remainder = num % 10;
            result += remainder * remainder;
            num /= 10;
        }
        
        return result;
    }
    public static void main(String[] args) {
        happyNumber hn = new happyNumber();
        System.out.println(hn.isHappy(19));
        //Optimal
        System.out.println(hn.isHappyOptimal(199));
    }

}
