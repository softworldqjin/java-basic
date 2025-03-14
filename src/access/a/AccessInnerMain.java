package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField = 1;

        //같은 패키지 default호출가능
        data.defaultField = 2;

        //private 호출 불가
        // data.privateMethod = 3;

        data.innerAcces();
    }
}
