package unit_2suanshuyunsuanfu;

public class jiahao {
    public static void main(String[] arge){
        //定义两个变量
        int i = 10;
        char c = 'A'; //字符“A”的值是65
        c = 'a'; //字符‘a’的值是95
        c = '0'; //‘0’的值是48
        System.out.println(i + c);

        //char ch = 1 + c;
        //char类型会被自动提升为int类型
        int j = 1 + c;
        System.out.println(j);
    }
}
