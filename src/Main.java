import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, -2, 3, -4, 5));
        List<Integer> digits = new ArrayList<>(List.of(-6, 7, -8, 9, 0));

        numbers.removeIf(n -> n < 0);
        System.out.println(numbers);

        Iterator<Integer> it = digits.iterator();
        while (it.hasNext()) {
            int n = it.next();
            if (n < 0) {
                it.remove();
            }
        }
        System.out.println(digits);
    }
}