package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

        //다운캐스팅(부모타입 -> 자식타입)
        //Child child = (Child) poly; //poly는 Parent타입이고 참조값을 지니는데, Child타입으로 바꾸고, child에 참조값을 복사 대입
        //child.childMethod(); //특정 타입으로 변경하는 것을 캐스팅이라 한다. 업캐스팅: 부모타입으로 바꿈, 다운캐스팅: 자식타입으로 바꿈
        //다운캐스팅으로 통해 (Child가 Parent를 상속받았으니) Child인스턴스 Parent인스턴스 둘다 쓸수있다.

        //일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod(); //poly가 Child타입으로 변하는게 아니다. 복사 대입, poly타입은 영구적으로 변하지않는다.
    }
}
