package unit_8mianduiduixiang.test04;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("葡萄");
        s.setAge(20);

        s.show();

        //使用get方法获取成员变量的值
        System.out.println(s.getName()+"----"+s.getAge());
        System.out.println(s.getName()+","+s.getAge());
    }
}
