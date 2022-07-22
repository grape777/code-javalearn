package unit_8mianduiduixiang.test06;

public class StudentDemo {
    public static void main(String[] args) {
        //无参构造方法创建对象后使用setXxx()赋值
        Student s1 = new Student();
        s1.setName("葡萄");
        s1.setAge(19);
        s1.show();

        //使用带参数构造方法直接创建带有属性值的对象
        Student s2 = new Student("葡萄",20);
        s2.show();
    }
}
