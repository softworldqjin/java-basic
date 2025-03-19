package poly.ex5;

public class InterfaceMain {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        sound(cat);
        sound(dog);
        sound(cow);

    }

    private static void sound(InterfaceAnimal interfaceAnimal) {
        interfaceAnimal.sound();
    }
}
