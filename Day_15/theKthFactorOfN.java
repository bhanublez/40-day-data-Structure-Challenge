//https://leetcode.com/problems/the-kth-factor-of-n/
public class theKthFactorOfN {
    public int kthFactor(int n, int k) {
        //Counting from 1 to n, if the number is a factor of n, then k is decremented.
        for(int i = 1; i < Math.sqrt(n); ++i) 
	        if(n % i== 0 && --k == 0) 
		        return i;             
        //Counting from sqrt(n) to 1, if the number is a factor of n,
        // then k is decremented.          
        for(int i = (int) Math.sqrt(n); i >= 1; --i) 
	        if(n % (n/i) == 0 && --k == 0) 
		         return n/i;          
        return -1;
        
    }
    public static void main(String[] args) {
        theKthFactorOfN t=new theKthFactorOfN();
        int n=12,k=3;
        System.out.println(t.kthFactor(n, k));
    }
}
