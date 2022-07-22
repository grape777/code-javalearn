package unit_8mianduiduixiang.test03;

/*
学生类
 */
public class Student {
    //成员变量
    String name;

    //使用private关键字
    private int age;

    //提供get/set方法
    public void setAge(int a) {
        // age = a;
        if (a < 0 || a > 120) {
            System.out.println("年龄有误");
        } else {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }

    //成员方法
    public void show() {
        System.out.println(name + "," + age);
    }
}
