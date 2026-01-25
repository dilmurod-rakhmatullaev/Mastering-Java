import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(100, 250, 80, 40);

        OptionalDouble averageOpt = prices.stream()
                .mapToInt(Integer::intValue)
                .average();

        double average = averageOpt.orElse(0.0);

        int min = prices.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(-1);

        System.out.println("Средняя стоимость проданных товаров: " + average);
        System.out.println("Минимальная цена дня: " + min);
    }
}