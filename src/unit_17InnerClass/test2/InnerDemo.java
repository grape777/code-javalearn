package unit_17InnerClass.test2;

public class InnerDemo {
    public static void main(String[] args) {
        //创建内部类对象，并调用方法
//        Inner i = new Inner();

//        Outer.Inner oi = new Outer().new Inner();
//        oi.show();

        // 间接调用
        Outer o = new Outer();
        o.method();

    }
}
