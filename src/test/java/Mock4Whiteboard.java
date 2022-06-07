
import java.util.LinkedHashMap;

public class Mock4Whiteboard {

    //Write a method that takes an array of String and returns the count of each unique element in the array as a Map

    public static LinkedHashMap<String, Integer> countUniques (String[] arr){
        LinkedHashMap<String, Integer> uni = new LinkedHashMap<>();
        for (String s : arr){
            if (!uni.containsKey(s)) uni.put(s, 1);
            else uni.put(s, uni.get(s) + 1);
        }
        return uni;
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "apple", "orange", "apple", "kiwi"};
        System.out.println(countUniques(arr));
    }
}
