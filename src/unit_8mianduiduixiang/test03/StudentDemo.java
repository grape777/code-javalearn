package unit_8mianduiduixiang.test03;
/*
测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();

        //给成员变量赋值
        s.name = "葡萄";
        s.setAge(-30);

        //调用show方法
        s.show();
    }
}
