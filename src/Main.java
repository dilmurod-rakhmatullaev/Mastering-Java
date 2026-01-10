public class Main {
    public static void main(String[] args) {
        new SystemCore();
        new SystemCore();
    }
}

class SystemCore {
    static {
        System.out.println("Система: глобальная инициализация завершена.");
    }

    {
        System.out.println("Компонент: индивидуальная настройка завершена.");
    }
}