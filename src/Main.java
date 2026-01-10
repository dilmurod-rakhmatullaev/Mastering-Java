public class Main {
    public static void main(String[] args) {
        Library.Archive.readParchment();
    }
}

class Library {
    static class Archive {
        static void readParchment() {
            System.out.println("Ancient parchment was found out");
        }
    }
}