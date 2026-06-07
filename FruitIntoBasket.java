import java.util.HashSet;
public class FruitIntoBasket {
    public static int totalFruit(int[] fruits){
        int maxLen = 0;
        for(int i = 0; i < fruits.length; i++){
            HashSet<Integer>set = new HashSet<>();
            for(int j = i; j < fruits.length; j++){
                set.add(fruits[j]);
                if(set.size() <= 2){
                    maxLen = Math.max(maxLen, j - i + 1);
                }else{
                    break;
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