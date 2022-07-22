package unit_7anli;

/*需求：
输出含七或七的倍数的数
 */
public class feng7guo {
    public static void main(String[] args) {
        //获取1-100的数
   /*     for (int i = 1; i <= 100; i++) {
            //if判断
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                //输出
                System.out.println(i);
            }
        }*/
        //输出不含七或七的倍数的数
        for (int i = 1; i <= 100; i++) {
            //if判断
            if (i % 10 != 7 && i / 10 % 10 != 7 && i % 7 != 0) {
                //输出
                System.out.println(i);
            }
        }
    }
}
