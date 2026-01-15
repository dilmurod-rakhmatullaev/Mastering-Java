import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] levels = {1, 2, 3, 4, 5};
        Arrays.stream(levels).forEach(System.out::println);
    }
}