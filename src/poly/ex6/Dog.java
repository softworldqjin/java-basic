package poly.ex6;

public class Dog extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

}

//extends를 통한 상속은 하나만 할 수 있다. 인터페이스는 다중 구현 가능. extends가 먼저나오고 implements나옴
