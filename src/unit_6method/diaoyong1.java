package unit_6method;

public class diaoyong1 {
    public static void main(String[] args) {
        //调用方法
        isEvenNumber();
    }

    //需求：定义一个方法，在方法上定义一个变量，判断该数据是否时偶数
    public static void isEvenNumber(){
        //定义变量
        int number = 10;
        number = 9;

        //判断该数据是否是偶数
        if(number%2 == 0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
