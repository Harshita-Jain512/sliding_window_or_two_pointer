import java.util.HashMap;
public class LongestSubstringwithAtMostKDistinctCharacters {
    public static int lengthOfLongestSubstringKDistinct(String s, int k){
        int maxLength =0;
        int i = 0;
        HashMap<Character, Integer>map = new HashMap<>();
        for(int j = 0; j < s.length(); j++){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            while(map.size() > k){
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                if(map.get(s.charAt(i)) == 0){
                   map.remove(s.charAt(i));
                }
                i++;
            }
            maxLength = Math.max(maxLength, j - i + 1);
        }
        return maxLength;
    }
    public static void main(String[] args){
        String s = "abcddefg";
        int k = 3;
        System.out.println(lengthOfLongestSubstringKDistinct(s, k));
    }
}
