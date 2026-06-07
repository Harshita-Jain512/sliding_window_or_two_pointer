import java.util.*;
public class LongestSubstringWithoutRepetatingElement {

    public static int lengthOfLongestSubstring(String s){
        int Length = 0;
        for(int i = 0; i < s.length(); i++){
            int count = 0;
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j = i; j < s.length(); j++){
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                     if(map.get(s.charAt(j)) > 1){
                        break;
                     }else{
                        count++;
                        Length = Math.max(Length, count);
                     }

            }
        }
        return Length;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
