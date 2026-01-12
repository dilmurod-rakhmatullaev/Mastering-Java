import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> tasks = new LinkedList<>();

        tasks.add(5);
        tasks.add(15);
        tasks.add(25);

        System.out.println(tasks.peek());
        System.out.println(tasks.size());
    }
}