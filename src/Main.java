public class Main {
    public static void main(String[] args) {
        Cat myCat1 = new Cat();
        myCat1.sayHello();
    }
}

class Animal {
    void sayHello() {
        System.out.println("Hello!");
    }
}

class Cat extends Animal {
    @Override
    void sayHello() {
        System.out.println("Meow!");
    }
}