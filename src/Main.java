public class Main {
    public static void launchIntoSky(CanFly flyingObject){
        flyingObject.soar();
    }

    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft();
        Eagle eagle = new Eagle();

        launchIntoSky(aircraft);
        launchIntoSky(eagle);
    }
}

interface CanFly {
    void soar();
}

class Aircraft implements CanFly {
    @Override
    public void soar() {
        System.out.println("Самолёт взлетает!");
    }
}

class Eagle implements CanFly {
    @Override
    public void soar() {
        System.out.println("Орёл парит!");
    }
}