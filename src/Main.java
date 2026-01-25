import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Optional<Integer> sum1 = numbers.stream()
                .reduce(Integer::sum);

        System.out.println(sum1);

        int sum2 = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum2);
    }
}