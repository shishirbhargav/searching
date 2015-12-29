package crackingCodingInterview.array;

import java.util.HashMap;

/**
 * Created by shishirbhargav on 12/28/15.
 */
public class anagrams {

    public static void main(String[] argv){

        String s1 = "hello";
        String s2 = "loleh";
        String s3 = "hi";
        String s4 = "retyf";

        if (findAnagram(s1,s2))
            System.out.print("Anagrams!!");
        else
            System.out.print("Not Anagrams!!");

    }

    static boolean findAnagram(String a, String b){

        // If the strings are of different lengths they are not anagrams
        if (a.length() != b.length())
            return false;

        // Check if the strings have same number of characters
        else{
            HashMap<Character,Integer> charSet = new HashMap<Character,Integer>();
            for (int i = 0; i < a.length(); i++){
                char ch = a.charAt(i);
                if (charSet.containsKey(ch))
                    charSet.put(ch,charSet.get(ch) + 1);
                else
                    charSet.put(ch,1);
            }

            for (int i = 0; i < b.length(); i++) {
                char ch = b.charAt(i);
                if (charSet.containsKey(ch))
                    charSet.put(ch,charSet.get(ch)-1);
                else
                    return false;
            }

            for (char ch : charSet.keySet()){
                if (charSet.get(ch) != 0)
                    return false;
            }
        }

        return true;
    }
}
