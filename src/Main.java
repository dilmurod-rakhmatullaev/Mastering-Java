public class Main {
    public static void main(String[] args) {
        Pressable anonym = new Pressable() {
            @Override
            public void activateEngine () {
                System.out.println("Engines are launched, we're flying to the stars");
            }
        };
        anonym.activateEngine();
    }
}

interface Pressable {
    abstract void activateEngine();
}