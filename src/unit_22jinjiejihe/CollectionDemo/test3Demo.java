package unit_22jinjiejihe.CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class test3Demo {
    public static void main(String[] args) {
        //创建Collection集合对象
        Collection<Student> c = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("索尼", 200);
        Student s2 = new Student("森海塞尔", 300);
        Student s3 = new Student("拜亚动力", 250);

        //把学生添加到集合
        c.add(s1);
        c.add(s2);
        c.add(s3);

        //遍历集合(迭代器)
        Iterator<Student> it = c.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
