package unit_10jihe;

import java.util.ArrayList;

public class ArrayListDemo03 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();

        //在集合对象中添加字符串对象
        array.add("任天堂");
        array.add("索尼");
        array.add("微软");
        array.add("世嘉");

        //遍历集合，首先要能够获取到集合中的每一个元素，这个通过get(int index)
        /*System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        System.out.println(array.get(3));*/

        /*for (int i=0;i< 3;i++){
            System.out.println(array.get(i));
        }*/

        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }
    }
}
