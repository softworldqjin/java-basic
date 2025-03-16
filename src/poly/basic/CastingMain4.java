package poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child(); //기능이 다있잖음,, Parent인스턴스, Child인스턴스 모두 생성된 상태
        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent(); //Parent인스턴스만 생성되있는 상태
        Child child2 = (Child) parent2; //Child 인스턴스 없음, 런타임 오류
        child2.parentMethod(); //실행 불가
    }
}
