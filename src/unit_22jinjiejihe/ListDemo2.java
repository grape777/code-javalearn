package unit_22jinjiejihe;

import unit_22jinjiejihe.CollectionDemo.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        //创建list集合对象
        List<Student> list = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("amier",80);
        Student s2 = new Student("melt",85);
        Student s3 = new Student("mili",95);

        //把学生添加到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //迭代器方式
        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("---------------");

        //for循环方式
        for (int i = 0; i< list.size(); i++){
            Student s = list.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
