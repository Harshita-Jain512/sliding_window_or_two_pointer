public class LongestRepeatingCharacterReplacement {

    public static int  characterReplacement(String s, int k){
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++){
            int []freq = new int[26];
            int maxFreq = 0;
            for(int j = i; j <s.length(); j++){
                freq[s.charAt(j) - 'A']++;
                maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A']);
                int windowSize = j - i + 1;
                int replace = windowSize - maxFreq;
                if(replace <= k){
                    maxLen = Math.max(maxLen, windowSize);
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }
}
