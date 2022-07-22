package unit_2suanshuyunsuanfu;

public class zizengzijian {
    public static void main(String[] args) {
        int a = 10;
        int b,c;
        b = a++;
        System.out.println(b); //此时a已经加1
        c = ++a;
        System.out.println(c);
    }
}
