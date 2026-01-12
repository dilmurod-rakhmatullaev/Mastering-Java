import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("dog", "собака");
        dictionary.put("cat", "кошка");
        dictionary.put("bird", "птица");

        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}