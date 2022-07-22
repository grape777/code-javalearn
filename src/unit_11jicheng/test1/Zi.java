package unit_11jicheng.test1;

public class Zi extends Fu {
    public int age = 20;

    public void show(){
        int age = 30;
        System.out.println(age);
        //要访问本类的成员变量age，怎么办？
        System.out.println(this.age);
        //要访问父类的成员变量age，怎么办？
        System.out.println(super.age);
    }
}
