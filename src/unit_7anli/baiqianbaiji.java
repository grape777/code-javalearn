package unit_7anli;

/*鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱1
百钱买百鸡，问鸡翁，鸡母，鸡雏各几何
 */
public class baiqianbaiji {
    public static void main(String[] args) {
        //第一层循环，表示鸡翁的范围，初始化表达式的变量定义为x=0，判断条件是x<=20
        for (int x = 0; x <= 20; x++) {
            //第二层循环，表示鸡母的范围，初始化表达式的变量自定义为y=0，判断条件是y<=33
            for (int y = 0; y <= 33; y++) {
                //这个时候，用于表示鸡雏的变量z=100-x-y
                int z = 100 - x - y;

                //判断表达式z%3==0和表达式5*x+3*y+z/3==100是否同时成立
                if (z % 3 == 0 && 5 * x + 3 * y + z / 3 == 100) {
                    System.out.println(x + "," + y + "," + z);
                }
            }
        }
    }
}
