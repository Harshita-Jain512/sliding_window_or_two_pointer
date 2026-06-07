import java.util.HashSet;
public class SubarraysWithKDifferentIntegers {

    public static int findCount(int []arr, int k){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            HashSet<Integer>set = new HashSet<>();
            for(int j = i; j < arr.length; j++){
                set.add(arr[j]);
                if(set.size() == k){
                    count++;
                }else if(set.size() > k){
                    set.remove(arr[j]);
                    break;
                }
            }

        }
        return count;

    }
    public static void main(String[] args){
        int []arr = {1,2,1,3,4};
        int k = 3;
        System.out.println(findCount(arr, k));
    }
}
