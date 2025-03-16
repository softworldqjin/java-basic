package poly.basic;

public class CastingMain5 {

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
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
