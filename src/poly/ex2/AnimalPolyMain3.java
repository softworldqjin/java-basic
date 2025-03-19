package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.sound();

        Animal[] animals = {new Cow(), new Cat(), new Dog(), new Pig()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    //변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 시작");
        animal.sound();
        System.out.println("동물 소리 끝");
    }
}
