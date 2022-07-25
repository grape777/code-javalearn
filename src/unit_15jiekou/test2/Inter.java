package unit_15jiekou.test2;

public interface Inter {
    public int num = 10; //可以是变量
    public final int num2 = 20; //可以是常量
//    public static final int num3 = 30; //常量默认是静态修饰的
    int num3 = 30; //等价上面

//    public Inter(){} //接口没有构造方法

//    public void show(){} //接口里面不能有非抽象方法
    public abstract void method();
    void show(); //接口里的方法默认带抽象修饰符

}
