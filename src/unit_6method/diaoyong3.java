package unit_6method;

public class diaoyong3 {
    public static void main(String[] args) {
        //常量值的调用
        isEvenNumber(10);

        //变量的调用
        int number = 9;
        isEvenNumber(number);
    }
    //需求：定义一个方法，该方法接收一个参数，判断该数据是否是偶数
    public static void isEvenNumber(int number){
        if (number%2 == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
