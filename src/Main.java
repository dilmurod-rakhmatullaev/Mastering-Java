import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> days = new TreeMap<>();

        days.put("Monday", 1);
        days.put("Tuesday", 2);
        days.put("Wednesday", 3);

        for (var day : days.entrySet()) {
            System.out.println("День: " + day.getKey() + ", Номер: " + day.getValue());
        }
    }
}