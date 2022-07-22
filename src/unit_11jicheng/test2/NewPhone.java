package unit_11jicheng.test2;
/*
    新手机类
 */
public class NewPhone extends Phone {

    /*  public void call(String name){
          System.out.println("开启视频");
          //System.out.println("给"+name+"打电话");
          super.call(name);
      }
      */
    @Override
    public void call(String name) {
        System.out.println("开启视频");
        //System.out.println("给"+name+"打电话");
        super.call(name);
    }
}