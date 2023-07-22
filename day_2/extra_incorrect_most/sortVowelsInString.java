package extra_incorrect_most;
public class sortVowelsInString {

    //Brute force approach
    public String sortVowels(String s){
        int n = s.length();
        char[] arr = s.toCharArray();
         for(int i=0;i<arr.length;i++){
             char c=arr[i];
             if(!isVowel(c)){
                 continue;
             }
             for(int j=i+1;j<arr.length;j++){
                 if(isVowel(arr[j])){
                 if(c>arr[j]){
                     char temp=arr[j];
                     arr[j]=arr[i];
                     arr[i]=temp;
                     c=temp;
                 }
                 }
             }
         }
        return new String(arr);
    }

   //Optimal approach
   //Time complexity: O(n)
   //Space complexity: O(n)
   //Trie but incoorect
       public String sortVowelsOptimal(String s){
            int n = s.length();
            char[] arr = s.toCharArray();
            int i = 0;
            int j = n-1;
            while(i < j){
                while(i < j && !isVowel(arr[i])){
                    i++;
                }
                while(i < j && !isVowel(arr[j])){
                    j--;
                }
                // char temp = arr[i];
                // arr[i] = arr[j];
                // arr[j] = temp;
                if(arr[i]>arr[j]){
                    char temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
                i++;
                j--;
            }
            return new String(arr);
        }    
    
    
       public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c=='A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'  ;
    }  
    
    public static void main(String[] args) {
        String s = "lEEAAeetcode";
        sortVowelsInString obj = new sortVowelsInString();
        String res = obj.sortVowels(s);
        System.out.println(res);
        String res1 = obj.sortVowelsOptimal(s);
        System.out.println(res1);

    }
    

}
