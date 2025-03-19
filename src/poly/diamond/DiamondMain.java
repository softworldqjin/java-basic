package poly.diamond;

public class DiamondMain {

    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.method();
        a.methodCommon();

        Child child = new Child();
        child.method();
        child.methodCommon();
    }
}
