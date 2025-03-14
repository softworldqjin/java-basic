package ref;

public class Method2 {

    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        System.out.println(student1);
        Student student2 = createStudent("학생2", 12, 70);
        System.out.println(student2);
        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade) { //메서드임 이샛기
        Student student = new Student(); //x001
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; //x001 //호출되고 다 실행되고 student지워짐,, 객체의 주소는 그대로 남아서 그거.써서 만지기 가능
    }

    public static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
        System.out.println(student);
        
    }
}
