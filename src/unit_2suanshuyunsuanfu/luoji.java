package unit_2suanshuyunsuanfu;

public class luoji {
    public static void main(String[] args) {
        // 定义变量
        int i = 10;
        int j = 20;
        int k = 30;

        // &：有 false 则为 false
        System.out.println((i > j) & (i > k)); // false & false = false
        System.out.println((i < j) & (i > k)); // true & false = false
        System.out.println((i > j) & (i < k)); // false & ture = false
        System.out.println((i < j) & (i < k)); // ture & ture = ture

        // |：有 true 则为 true
        System.out.println((i > j) | (i > k)); // false | false = false
        System.out.println((i < j) | (i > k)); // true | false = ture
        System.out.println((i > j) | (i < k)); // false | ture = ture
        System.out.println((i < j) | (i < k)); // ture | ture = ture

        // ^：结果相同为 false，不同为 true
        System.out.println((i > j) ^ (i > k)); // false ^ false = true
        System.out.println((i < j) ^ (i > k)); // true ^ false = ture
        System.out.println((i > j) ^ (i < k)); // false ^ ture = ture
        System.out.println((i < j) ^ (i < k)); // ture ^ ture = false

        // !：结果相同为 false，不同为 true
        System.out.println((i > j)); // false = false
        System.out.println(!(i < j)); // !false = true
        System.out.println(!!(i > j)); // !!false = false
        System.out.println(!!!(i < j)); // !!!false = ture

        System.out.println("--------------------------------------");

        boolean boo1 = true;
        boolean boo2 = false;

        System.out.println("a && b = " + (boo1 && boo2));
        System.out.println("a & b = " + (boo1 && boo2));

        System.out.println("a || b = " + (boo1 || boo2));
        System.out.println("a | b = " + (boo1 | boo2));

        System.out.println("!(a && b) = " + !(boo1 &&boo2));

        System.out.println("^(a && b) = " + (boo1 ^ boo2));
    }
}
