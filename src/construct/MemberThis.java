package construct;

public class MemberThis {
    String nameField;

    void inintMember(String nameParameter) {
        this.nameField = nameParameter; //this 생략되있음 this.nameField
    }
}
