import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> things = new ArrayList<>();
        Set<Integer> uniqueThings = new HashSet<>();

        things.add(3);
        things.add(7);
        things.add(3);
        things.add(9);

        uniqueThings.add(3);
        uniqueThings.add(7);
        uniqueThings.add(3);
        uniqueThings.add(9);

        System.out.println(things.size());
        System.out.println(uniqueThings.size());
    }
}