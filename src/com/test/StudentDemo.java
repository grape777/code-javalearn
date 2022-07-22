package com.test;

import java.util.ArrayList;
import java.util.Scanner;

/*
    学生管理系统
*/
public class StudentDemo {

    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        //用循环完成再次回到主界面
        while (true) {
            //用输出语句完成主界面的编写
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择");

            //用Scanner实现键盘录入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //用switch语句完成操作的选择
            switch (line) {
                //调用方法
                case "1":
//                    System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
//                    System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
//                    System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
//                    break;
                    System.exit(0); //JVM退出
            }
        }
    }

    //定义一个方法，用于添加学生
    public static void addStudent(ArrayList<Student> array) {
        //键盘录入学生对象所需要的数据，提示要输入何种信息
        Scanner sc = new Scanner(System.in);

        //为了让sid在while循环外面被访问到，我们就把他定义在循环外
        String sid;

        //为了能让程序能够回到这里，我们使用循环实现
        while (true) {
            System.out.println("请输入学生学号");
            sid = sc.nextLine();

            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("你输入的学号已经被使用，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地");
        String address = sc.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //将学生对象添加到集合中（保存）
        array.add(s);

        //给出添加成功提示
        System.out.println("添加学生成功");

    }

    //定义一个方法，用于查看所有学生
    public static void findAllStudent(ArrayList<Student> array) {
        //判断集合中是否有数据，如果没有显示提示信息
        if (array.size() == 0) {
            System.out.println("无信息，请先添加信息再查询");
            //为了让程序不在往下执行，给出return；
            return;
        }
        //显示表头信息
        // \t是tab建
        System.out.println("学号\t\t姓名\t\t年龄\t\t居住地");

        //将集合中数据去除按照对应格式显示学生信息，年龄显示补充“岁”
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
        }
    }

    //定义一个方法，用于删除学生
    public static void deleteStudent(ArrayList<Student> array) {
        //键盘录入要删除的学生学号，显示提示信息
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要删除的学生的学号");
        String sid = sc.nextLine();

        //遍历集合将对应的学生对象从集合中删除

        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该信息不存在，请重新输入");
        } else {
            array.remove(index);
            //给出删除成功提示
            System.out.println("删除学生成功");
        }
    }

    //定义一个方法，用于修改学生
    public static void updateStudent(ArrayList<Student> array) {
        //键盘录入要修改的学生学号，显示提示信息
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要修改的学生的学号：");
        String sid = sc.nextLine();

        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {

                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该信息不存在，请重新输入");
        } else {

            //键盘录入要修改的学生信息
            System.out.println("请输入学生的新姓名");
            String name = sc.nextLine();
            System.out.println("请输入学生的新年龄");
            String age = sc.nextLine();
            System.out.println("请输入学生的新居住地");
            String adress = sc.nextLine();

            //创建学生对象
            Student s = new Student();
            s.setSid(sid);
            s.setName(name);
            s.setAge(age);
            s.setAddress(adress);

            //遍历集合修改对应的学生信息


            if (index == -1) {
                System.out.println("该信息不存在，请重新输入");
            } else {
                array.set(index, s);
                //给出修改成功提示
                System.out.println("修改学生成功");
            }
        }
    }

    //定义一个方法，判断学号是否被使用
    public static boolean isUsed(ArrayList<Student> array, String sid) {
        //如果与集合中的某一个学生号相同，返回true;如果都不相同，返回false
        boolean flag = false;

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
