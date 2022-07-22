package unit_11jicheng.test2;
/*
    测试类
 */
public class Demo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("林青霞");
        System.out.println("---------------");
        NewPhone np = new NewPhone();
        np.call("林青霞");
    }
}
