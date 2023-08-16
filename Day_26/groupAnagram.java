import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
//https://leetcode.com/problems/group-anagrams/description/
public class groupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        //My Brute force
        HashMap<String,List<String>> map=new HashMap<>();
        int n=strs.length;
        for(int i=0;i<n;i++){
            String s=strs[i];//Traversing given string
            //Converting travered string in to character array
            char[] c=s.toCharArray();
            Arrays.sort(c);//Sorting Array
            String str=new String(c);//After sorting again converted to String
            if(map.containsKey(str)){
                map.get(str).add(s);//If exist str then directly add the original required word to map
            }else{//If sorted str not exixt in map the add it first then and the original one
                map.put(str,new ArrayList<>());
                map.get(str).add(s);
            }
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        
    }
}
