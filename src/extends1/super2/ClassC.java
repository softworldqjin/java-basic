package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        super(10,20); //ClassB에 기본 생성자가 없으므로 직접 매개변수를 전달해서 생성자를,, 호출해야한다.
        System.out.println("ClassC 생성자");
    }
}
