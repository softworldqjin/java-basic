package poly.ex6;

import poly.diamond.Child;

public class SoundFlyMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Chicken chicken = new Chicken();
        Bird bird = new Bird();

        soundAnimal(dog);
        soundAnimal(chicken);
        soundAnimal(bird);

        flyAnimal(chicken);
        flyAnimal(bird);

    }

    //AbstractAnimal 사용 가능
    private static void soundAnimal(AbstractAnimal abstractAnimal) {
        System.out.println("동물 소리 내기 시작");
        abstractAnimal.sound();
        System.out.println("동물 소리 끝");
    }

    //Fly 인터페이스
    private static void flyAnimal(Fly fly) {
        System.out.println("날기 시작");
        fly.fly();
        System.out.println("날기 끝");
    }
    
}
