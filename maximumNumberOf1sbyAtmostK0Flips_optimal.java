public class maximumNumberOf1sbyAtmostK0Flips_optimal {

    public static int maximumNumberOf1s(int[] arr, int k){
        int maxLen = 0;
        int i = 0;
            int count = 0;
            for(int j = i; j < arr.length; j++){
                if(arr[j] == 0){
                    count++;
                }if(count <= k){
                      maxLen = Math.max(maxLen, j - i + 1);
                }
            }
            i++;
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(maximumNumberOf1s(arr, k));
    }
}
