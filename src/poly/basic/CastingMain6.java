package poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("parent호출");
        call(parent);

        Parent parent1 = new Child();
        System.out.println("parent1호출");
        call(parent1);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        //Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child child) { //Child타입으로 child변수 선언
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
}
