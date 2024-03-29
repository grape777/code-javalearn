package unit_10jihe;


import java.util.ArrayList;

/*
ArrayList集合常用方法
    public boolean remove（Object o）:删除指定的元素，返回删除是否成功
    public E remove(int index):删除指定索引处的元素，返回被删除的元素
    public E set(int index,E element):修改指定索引处的元素，返回被修改的元素
    public E get(int index):返回指定索引处的元素
    public int size():返回集合中的元素的个数
* */
public class ArrayListDemo02 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> array = new ArrayList<String>();

        //添加元素
        array.add("hello");
        array.add("grape");
        array.add("java");

        //public boolean remove（Object o）:删除指定的元素，返回删除是否成功
        //System.out.println(array.remove("grape"));
        //System.out.println(array.remove("javaee"));

        //public E remove(int index):删除指定索引处的元素，返回被删除的元素
        //System.out.println(array.remove(1));

        //public E set(int index,E element):修改指定索引处的元素，返回被修改的元素
        //System.out.println(array.set(1,"apple"));
        //System.out.println(array.set(2,"banana"));

        //public E get(int index):返回指定索引处的元素
        //System.out.println(array.get(2));

        //public int size():返回集合中的元素的个数
        System.out.println(array.size());

        
        //输出集合
        System.out.println("array:"+array);
    }
}
