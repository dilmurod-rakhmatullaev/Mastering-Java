import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("яблоко");
        fruits.add("груша");
        fruits.add("яблоко");
        fruits.add("слива");
        fruits.add("груша");

        Set<String> onlyFruits = new TreeSet<>(fruits);

        System.out.println(onlyFruits);
    }
}