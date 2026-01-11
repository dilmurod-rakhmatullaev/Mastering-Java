import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> fruits = new TreeMap<>();

        fruits.put("pear", 6);
        fruits.put("apple", 2);
        fruits.put("banana", 4);

        for (var fruit : fruits.entrySet()) {
            System.out.println(fruit.getKey() + fruit.getValue());
        }
    }
}