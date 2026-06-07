public class maximumNumberOf1sbyAtmostK0Flips{

    public static int maximumNumberOf1s(int[] arr, int k){
        int maxLen = 0;
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = i; j < arr.length; j++){
                if(arr[j] == 0){
                    count++;
                }if(count <= k){
                      maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(maximumNumberOf1s(arr, k));
    }
}