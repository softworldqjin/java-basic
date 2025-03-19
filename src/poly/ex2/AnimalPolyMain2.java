package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Cow cow = new Cow();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal[] animals = {dog, cat, cow};

        for (Animal animal : animals) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 끝");
        }


    }
}
