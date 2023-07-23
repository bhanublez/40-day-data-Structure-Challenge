package Prac;
/*
 * Split Strings by Separator
User Accepted:0
User Tried:0
Total Accepted:0
Total Submissions:0
Difficulty:Easy
Given an array of strings words and a character separator, split each string in words by separator.

Return an array of strings containing the new strings formed after the splits, excluding empty strings.

Notes

separator is used to determine where the split should occur, but it is not included as part of the resulting strings.
A split may result in more than two strings.
The resulting strings must maintain the same order as they were initially given.
 */

import java.util.ArrayList;
import java.util.List;

public class splitScreenBySeprator {
//     Constraints:

// 1 <= words.length <= 100
// 1 <= words[i].length <= 20
// characters in words[i] are either lowercase English letters or characters from the string ".,|$#@" (excluding the quotes)
// separator is a character from the string ".,|$#@" (excluding the quotes)  
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("the|quick|brown|fox");
         words.add("jumps|over");
        // words.add("the@lazy|dog");
        char separator = '|';
        List<String> result = splitWordsBySeparator(words, separator);
        for (String string : result) {
            System.out.println(string);
        }
    }

    public static List<String> splitWordsBySeparator(List<String> words, char s) {
        List<String> result = new ArrayList<>();
        for (String string : words) {
            // System.out.println(string);
            if(s=='.' || s==',' ||s=='|' || s=='$' ||s=='#' || s=='@' ){
                System.out.println(string);
            String[] temp = string.split("["+s+"]");
                for (String string2 : temp) {
                if (!string2.equals("")) {
                   // System.out.println(string2);
                    result.add(string2);
                }
            }
            }
            
        }
        return result; 
    } 
    
}