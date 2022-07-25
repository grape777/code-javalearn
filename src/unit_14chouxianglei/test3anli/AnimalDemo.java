package unit_14chouxianglei.test3anli;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.setName("雅秀特拉");
        c.setAge(18);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        System.out.println("-------------------------------");
        c = new Cat("雅秀特拉",15);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        System.out.println("-------------------------------");

        Animal d = new Dog();
        d.setName("aibo");
        d.setAge(5);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
        System.out.println("-------------------------------");
        d = new Dog("aibo",5);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();

    }
}
