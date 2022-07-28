package unit_17InnerClass.test2;

public class Outer {

    private int num = 10;

    /* 一般不这样使用
    public class Inner{
        public void show(){
            System.out.println(num);
        }
    }
    */

    private class Inner{
        public void show(){
            System.out.println(num);
        }
    }

    public void method(){
        Inner i = new Inner();
        i.show();
    }
}
