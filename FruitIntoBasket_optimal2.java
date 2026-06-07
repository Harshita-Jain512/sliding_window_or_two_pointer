import java.util.HashMap;

public class FruitIntoBasket_optimal2 {
    public static int totalFruit(int[] fruits){
    int maxLen = 0;
    int i = 0;
    HashMap<Integer, Integer>map = new HashMap<>();
    for(int j = 0; j < fruits.length; j++){
        map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);
        if(map.size() <= 2){
            maxLen = Math.max(maxLen, j - i + 1);
        }else{
            while(map.size() > 2){
                map.put(fruits[i], map.get(fruits[i]) - 1);
                if(map.get(fruits[i]) == 0){
        map.remove(fruits[i]);
    }

                i++;
            }
        }
    }
    return maxLen;
}
    public static void main(String[] args) {
        int[] fruits = {1, 2, 1, 3, 4};
        System.out.println(totalFruit(fruits));
    }
}
