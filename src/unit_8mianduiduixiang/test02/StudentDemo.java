package unit_8mianduiduixiang.test02;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        System.out.println(s);

        //使用对象
        s.name = "葡萄";
        s.age = 19;

        System.out.println(s.name + "," + s.age);

        //使用成员方法
        s.study();
        s.doHomework();
    }
}
