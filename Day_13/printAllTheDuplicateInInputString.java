public class printAllTheDuplicateInInputString {

    //Time Complexity: O(n)
    //Space Complexity: O(1)
    
    public static void main(String[] args) {
        String s = "AmitAnmolajaa";
        int[] arr = new int[256];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(arr[i]>1){
                System.out.println((char)i+" "+arr[i]);
            }
        }
    }
}
