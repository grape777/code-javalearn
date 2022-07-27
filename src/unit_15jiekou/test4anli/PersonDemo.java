package unit_15jiekou.test4anli;
//测试类
public class PersonDemo {
    public static void main(String[] args) {
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("马龙");
        ppp.setAge(40);
        System.out.println(ppp.getName()+","+ppp.getAge());

        PingPangPlayer ppp1 = new PingPangPlayer("樊振东",20);
        System.out.println(ppp1.getName()+","+ppp1.getAge());

        ppp.eat();
        ppp.study();
        ppp.speak();
        System.out.println("------------------");

        BasketballPlayer bp = new BasketballPlayer();
        bp.setName("詹姆斯");
        bp.setAge(50);
        System.out.println(bp.getName()+","+bp.getAge());
        bp.eat();
        bp.study();
    }
}
