package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        //instanceValue++; // 인스턴스 변수 접근
        DecoData.staticValue++; // 정적 변수 접근
        DecoData.staticMethod(); // 정적 메서드 접근
        //instanceMethod();// 인스턴스 메서드 접근

        //static은 static만 접근 가능
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();
        staticValue++;
        staticMethod();
    }
    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }

    public static void staticCall(DecoData data) {

        data.instanceValue++;
        data.instanceCall();
    }
}
