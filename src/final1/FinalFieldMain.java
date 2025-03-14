package final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");

        ConstructInit constructInit1 = new ConstructInit(20); //최초로 값을 초기화하고 다음부턴 값을 변경못함
        ConstructInit constructInit2 = new ConstructInit(30); //이것도 위와 같음.
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        //final 필드 - 필드 초기화
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        //상수에
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);

    }
}
