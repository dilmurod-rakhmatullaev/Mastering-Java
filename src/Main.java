import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> firstBasketFruits = List.of("Яблоко", "Груша");
        List<String> secondBasketFruits = List.of("Банан", "Апельсин");

        Stream<String> allSaladIngredients = Stream.concat(firstBasketFruits.stream(), secondBasketFruits.stream());

        allSaladIngredients.forEach(System.out::println);
    }
}