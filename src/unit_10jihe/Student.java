package unit_10jihe;
/*
* 学生类
* */
public class Student {
    private String name;
    private int attack;

    public Student(){}

    public Student(String name, int attack){
        this.name = name;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
