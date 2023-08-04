//https://practice.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621/1
public class smallestWindow {

    
    //Optimized Approach
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public static String smallestWindowOptimized(String s, String p)
    {
        //Length of given strings
        int n=s.length();
        int m=p.length();

        //Counting the frequency of characters in p
        int[] freq=new int[26];
        for(int i=0;i<m;i++){
            freq[p.charAt(i)-'a']++;
        }
        int count=0;
        int[] freq1=new int[26];
        int i=0,j=0;
        int min=Integer.MAX_VALUE;
        int start=0;
        while(i<n && j<n){
            //Counting the frequency of characters in s
            freq1[s.charAt(j)-'a']++;

            //If the frequency of character in s is less than
            // or equal to the frequency of character in p
            if(freq1[s.charAt(j)-'a']<=freq[s.charAt(j)-'a']){
                count++;
            }

            //Agar all the characters of p are present in s
            if(count==m){
                //Now we will try to minimize the window
                //by removing the unwanted characters
                //from the starting of the window
                while(freq1[s.charAt(i)-'a']>freq[s.charAt(i)-'a']){
                    freq1[s.charAt(i)-'a']--;
                    i++;
                }
                //Now we will check if the window size is
                //less than the minimum window size
                //if yes then we will update the minimum window size
                //and the starting index of the window
                if(min>j-i+1){
                    min=j-i+1;
                    start=i;
                }
            }
            //Now we will try to increase the window size
            j++;
        }
        //If no such window is present
        //then we will return -1
        if(min==Integer.MAX_VALUE){
            return "-1";
        }
        //Else we will return the smallest window
        return s.substring(start,start+min);
    }

    public static void main(String[] args) {
        String s="timetopractice";
        String p="toc";
        System.out.println(smallestWindowOptimized(s,p));
    }
}
