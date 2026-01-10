public class Main {
    public static void main(String[] args) {
        Renderable shape = new Renderable() {
            @Override
            public void paint() {
                System.out.println("Painting smth");
            }
        };

        shape.paint();
        shape.adjustScale();
        Renderable.validateColorPalette();
    }
}

interface Renderable {
    void paint();

    default void adjustScale() {
        System.out.println("Размер объекта скорректирован по умолчанию.");
    }

    static void validateColorPalette() {
        System.out.println("Цветовая палитра проверена, всё в порядке!");
    }
}