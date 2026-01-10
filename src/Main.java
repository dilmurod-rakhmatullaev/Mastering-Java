public class Main {
    public static void main(String[] args) {
        Cat myCat1 = new Cat("Charlie");
        System.out.println(myCat1.name);
        myCat1.sayHello();
    }
}

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println("Hello!");
    }
}

class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    void sayHello() {
        System.out.println("Meow!");
    }
}