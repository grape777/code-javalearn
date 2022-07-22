package unit_10jihe;

import java.util.ArrayList;

public class StudentDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("任天堂",2000);
        Student s2 = new Student("索尼",1700);
        Student s3 = new Student("微软",1500);
        Student s4 = new Student("世嘉",5);

        //添加学生对象到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        //遍历集合，采用通用遍历格式实现
        for (int i =0;i< array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName()+","+s.getAttack());

        }
    }
}
