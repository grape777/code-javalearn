package unit_22jinjiejihe.SetDemo.Demo;

import java.util.HashSet;

/*
    需求：创建一个存储学生对象的集合，存储多个学生对象，使用程序实现在控制台遍历该集合

要求：学生对象的成员变量值相同，我们就认为是同一个对象

思路：

- 定义学生类
- 创建HashSet集合对象
- 创建学生对象
- 把学生添加到集合
- 遍历集合（增强for）
- 在学生类中重写两个方法
  - hashCode()和equals()
  - 自动生成即可
 */
public class Demo {
    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<Student> hs = new HashSet<Student>();

        //创建学生对象
        Student s1 = new Student("摩根",6000);
        Student s2 = new Student("阿瓦隆",16);
        Student s3 = new Student("奥伯龙",18);

        Student s4 = new Student("奥伯龙",18);

        //把学生添加到集合
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        //遍历集合（增强for）
        for (Student s : hs){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
