package static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Data3 data3 = new Data3("A");
        System.out.println("A count=" + Data3.count);
        Data3 data4 = new Data3("A");
        System.out.println("B count=" + Data3.count);
        Data3 data5 = new Data3("A");
        System.out.println("C count=" + Data3.count);

        //인스턴스를 통한 접근 >> 힙에 한번 갔다가 클래스로 보냄 >> 권장안함,, 이거 인스턴스 변수냐?
        Data3 data6 = new Data3("D");
        System.out.println(data4.count);

        //클래스를 통한 접근 >> 이거 100퍼 스태택 변수네
        System.out.println(Data3.count);
    }
}
