package unit_22jinjiejihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class test2 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String>  c = new ArrayList<String>();

        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");

        //Iterator<E> iterator()：返回此集合中元素的迭代器，通过集合的iterator()方法得到
        Iterator<String> it = c.iterator();

        /*
        public Iterator<E> iterator() {
            return new Itr();
        }

        private class Itr implements Iterator<E> {
            ...
        }
         */

        //用while循环改进判断
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
