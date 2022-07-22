package unit_11jicheng.test3;
/*学生类*/
public class Student extends Person{
    public Student(){}

    public Student(String name,int age){
        super(name,age);
    }

    public void sutdy(){
        System.out.println("学生学习");
    }
}
