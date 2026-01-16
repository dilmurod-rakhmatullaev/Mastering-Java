import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> sales = List.of(5, 7, 5, 9, 7, 11, 13, 9, 15);
        List<Integer> top4Unique = sales.stream()
                        .distinct()
                                .limit(4)
                                        .collect(Collectors.toList());

        System.out.println(top4Unique);
    }
}