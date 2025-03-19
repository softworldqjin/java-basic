package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

        move(dog);
        move(cat);
        move(cow);

    }

    public static void soundAnimal(AbstractAnimal abstractAnimal) {
        System.out.println("동물 소리 시작");
        abstractAnimal.sound();
        System.out.println("동물 소리 끝");
    }

    public static void move(AbstractAnimal abstractAnimal) {
        System.out.println("동물 움직임 시작");
        abstractAnimal.move();
        System.out.println("동물 움직임 끝");
    }
}
