public class NumberOfSubstringCintainingAllThreeCharacters {

    public static int countSubstring(String s){
        int count = 0;
        for(int i = 0; i <s.length(); i++){
            int []freq = new int[3];
            for(int j = i; j < s.length(); j++){
                char c = s.charAt(j);
                     freq[c - 'a']++;
                     if(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
                        count++;
                     }
            }
        }
        return count;
    }
    public static void main(String[] args){
        String s = "aaacb";
        System.out.println(countSubstring(s));
    }
}
