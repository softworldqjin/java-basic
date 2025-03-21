package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child - > Child");
        System.out.println("value=" + child.value);
        child.method();

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent(); //Parent클래스 인스턴스만 있음
        System.out.println("Parent - > Parent");
        System.out.println("value=" + parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스 참조
        Parent poly = new Child();
        System.out.println("Parent - > Child");
        System.out.println("value=" + poly.value); //변수는 오버라이딩 안됨
        poly.method(); //자식에 메서드가 오버라이딩 됨, 자식에 오버라이딩된 메서드를 절대적으로 실행!
    }
}
