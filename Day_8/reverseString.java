public class reverseString{

    //Time Complexity: O(n)
    //Space Complexity: O(1)
    //Approach detail used: Two pointer approach
    
    public void reverseString(char[] s) {
        int n=s.length;//size of array
        
        for(int i=n-1,j=0;i>=n/2;i--,j++){
            char c=s[i];//swapping
            s[i]=s[j];
            s[j]=c;
        }
    }
    public static void main(String[] args) {
        reverseString rs=new reverseString();
        char[] s={'h','e','l','l','o'};
        rs.reverseString(s);
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
    }

}