package unit_15jiekou.test3anli;
/*
测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Jumpping j = new Cat();
        j.Jump();
        System.out.println("--------------");

        Animal a = new Cat();
        a.setName("巧克力");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
//        a.jump(); //a在animal，animal没有jump方法

        a = new Cat("巧克力",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("--------------");

        Cat c = new Cat();
        c.setName("巧克力");
        c.setAge(5);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        c.Jump();
    }
}
