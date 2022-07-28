package unit_17InnerClass.test4;

public class Outer {

    public void method(){
        /*  对象
        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
         */

        /*
        //对象调用show方法
        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();
         */

        // 是接口的实现类对象
        Inter i = new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };

        i.show();
    }
}
