package unit_2suanshuyunsuanfu;

public class sanyuan {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 2;
        int max = a > b ? a : b;
        int max1 = max > c ? max : c;
        System.out.println("最大值为"+max1);
    }
}
