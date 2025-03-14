package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); //data안에 있는 참조값(주소)를 바꿀수없다.

        //참조 대상의 값은 변경 가능
        data.value = 20;
        System.out.println(data.value);
        data.value = 30;
        System.out.println(data.value);

    }
}
