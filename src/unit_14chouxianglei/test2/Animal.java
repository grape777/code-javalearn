package unit_14chouxianglei.test2;
/*
抽象类
 */
public abstract class Animal {

    private int age = 20;
    private final String city = "北京"; //final代表常量

    public Animal(){}

    public Animal(int age){
        this.age = age;
    }


    public void show(){
        age = 40;
        System.out.println(age);

 //     city = "上海";  //被final修饰无法改变
        System.out.println(city);
    }

    public abstract void eat();
}
