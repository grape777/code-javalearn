package unit_8mianduiduixiang.test02;

public class StudentDemo3 {
    public static void main(String[] args) {
        //创建第一个对象并使用
        Student s1 = new Student();

        s1.name = "菠萝";
        s1.age = 20;
        System.out.println(s1.name + "," + s1.age);

        //把第二个对象的地址赋值给第二个对象
        Student s2 = s1;

        s2.name = "香蕉";
        s2.age = 30;
        System.out.println(s1.name + "," + s1.age);
        System.out.println(s2.name + "," + s2.age);

    }
}
