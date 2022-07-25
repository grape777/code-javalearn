package unit_15jiekou.test2;

//public class InterImpl implements Inter{
  public class InterImpl extends Object implements Inter{  //等价上面
    public InterImpl(){
       super();
    }

    @Override
    public void method() {
        System.out.println("重写方法");
    }

    @Override
    public void show() {
        System.out.println("show方法");
    }
}
