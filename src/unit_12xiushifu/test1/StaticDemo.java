package unit_12xiushifu.test1;

/*测试类*/
public class StaticDemo {
    public static void main(String[] args) {

        Student.university = "清华同方";

        Student s1 = new Student();
        s1.name = "舒鑫";
        s1.age = 16;
//        s1.university = "清华同方";
        s1.show();

        Student s2 = new Student();
        s2.name = "李光辉";
        s2.age = 16;
//        s1.university = "清华同方";
        s2.show();
    }
}
