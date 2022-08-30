package unit_22jinjiejihe.SetDemo.TreeSetDemo01;

import java.util.TreeSet;

/*
- 存储学生对象并遍历，创建TreeSet集合使用无参构造方法
- 要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 */
public class TreeSetDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>();

        //创建学生对象
        Student s1 = new Student("huawei",25);
        Student s2 = new Student("xiaomi",29);
        Student s3 = new Student("oppo",20);
        Student s4 = new Student("vivo",30);

        Student s5 = new Student("vivo",30);

        //把学生添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //遍历集合
        for (Student s : ts){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
