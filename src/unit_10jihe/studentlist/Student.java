package unit_10jihe.studentlist;
/*
* 学生类
* */
public class Student {
    private String name;
    private String age;

    public Student(){}

    public Student(String name,String age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
