package poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Cow cow = new Cow();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();

        soundAnimal(cow);
        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(duck);


    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 시작");
        animal.sound();
        System.out.println("동물 소리 끝");
    }
}
