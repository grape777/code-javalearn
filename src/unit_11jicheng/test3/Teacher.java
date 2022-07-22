package unit_11jicheng.test3;
/*老师类*/
public class Teacher extends Person{

    public Teacher(){}

    public Teacher(String name,int age) {
//        this.name = name;
//        this.age = age;
        super(name,age);
    }

    public void teach(){
        System.out.println("老师教书");
    }
}
