package unit_13duotai.test4anli;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象进行测试
        Animal a = new Cat();
        a.setName("凯露");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a = new Cat("波斯",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        //创建狗类对象进行测试
        Animal b = new Dog();
        b.setName("啸天");
        b.setAge(555);
        System.out.println(b.getName()+","+b.getAge());
        b.eat();

        b = new Dog("大黄",2);
        System.out.println(b.getName()+","+b.getAge());
        b.eat();
    }
}
