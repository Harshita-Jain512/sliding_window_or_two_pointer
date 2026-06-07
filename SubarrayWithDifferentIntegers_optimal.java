import java.util.HashMap;
class SubarrayWithDifferentIntegers_optimal {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums , k - 1);
    }
    public static int atMost(int []nums, int k){
        if(k == -1){
            return 0;
        }
        int count = 0;
        int i = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int j = 0; j < nums.length; j++){
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
                while(map.size() > k){
                    map.put(nums[i], map.get(nums[i]) - 1);

                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }
                    i++;
                }
                    count = count + (j - i + 1);
            }
        return count;
    }
    public static void main(String[] args){
        int []arr = {1,2,1,3,4};
        int k = 3;
        SubarrayWithDifferentIntegers_optimal obj = new SubarrayWithDifferentIntegers_optimal();
        System.out.println(obj.subarraysWithKDistinct(arr, k));
    }
}