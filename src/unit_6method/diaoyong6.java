package unit_6method;

public class diaoyong6 {
    public static void main(String[] args) {
        //调用方法
        System.out.println(compare(10,20));
        System.out.println(compare((byte)10,(byte)20));
        System.out.println(compare((short) 10,(short) 20));
    }
    //int
    public static boolean compare(int a,int b){
        System.out.println("int");
        return a == b;
    }
    //byte
    public static boolean compare(byte a,byte b){
        System.out.println("byte");
        return a == b;
    }
    //short
    public static boolean compare(short a,short b){
        System.out.println("byte");
        return a == b;
    }
    //long
    public static boolean compare(long a,long b){
        System.out.println("byte");
        return a == b;
    }
}
