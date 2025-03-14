package access.a;

public class AccessData {

    public int publicField;
    int defaultField;
    private int privateMethod;

    public void publicMethod() {
        System.out.println("publicField 호출 " + publicField);

    }

    void defaultMethod() {
        System.out.println("defaultField 호출 " + defaultField);

    }

    private void privateMethod() {
        System.out.println("privateMethod 호출 " + privateMethod);
    }

    public void innerAcces() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateMethod = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
