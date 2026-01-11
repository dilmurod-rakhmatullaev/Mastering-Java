import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> studentCard = new HashMap<String, Integer>();
        studentCard.put("Иван", 20);
        studentCard.put("Мария", 21);
        studentCard.put("Алексей", 19);

        System.out.println(studentCard);
    }
}