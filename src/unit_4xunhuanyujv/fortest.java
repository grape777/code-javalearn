package unit_4xunhuanyujv;

public class fortest {
    public static void main(String[] args) {
        /*
        //输出五次helloworld
        for (int i=1;i<=5;i++){
            System.out.println("helloworld");
        }*/
        /*
        //求1到10之和
        int n = 0;
        for (int i = 1;i <= 10;i++ ){
            n +=i;
        }
        System.out.println(n);
        */
        /*
        //求偶数和
        int num = 0;//定义偶数之和
        for (int i = 1; i <= 10; i++) {
            if(i%2==0){   //取余的方法
                num+=i;   //利用下标确定偶数
            }
        }
        System.out.println(num);
         */
        /*
        //定义变量n，用以保存水仙花数的数量，初始为0
        int n = 0 ;
        //输出水仙花数用到的循环
        for (int i = 0;i <= 1000;i++){
            int ge = i%10; //获取个位数
            int shi = i/10%10; //获取十位数
            int bai = i/10/10%10; //获取百位数
            //判定条件
            if (ge*ge*ge + shi*shi*shi + bai*bai*bai ==i){
                System.out.println(i);
                n++;
            }
        }
        //打印最终结果
        System.out.println("水仙花数共有" + n + "个");
         */
        for (int i = 1; i <= 9; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(i + "*" + j + "=" + i * j + " ");

            }

            System.out.println();

        }
    }
}
