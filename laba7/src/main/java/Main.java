
public class Main {
    public static void main(String [] args)
    {
        Sender s1 = new Sender(30, 1999.12);
        Sender s2 = new Sender(15, 1203.921);

        Recipient r1 = new Recipient(123441.1);
        Recipient r2 = new Recipient(41341.0);

        Transaction first = s1.doTransaction(Day.MONDAY, r1, 1300, 10);

        System.out.println(s1.getCountOfProduct()); //20
        System.out.println(s1.getCurrentMoney()); //3299.12

        System.out.println(r1.getCurrentMoney()); //122141.1

        System.out.println(first.getDayOfTransaction().getNumOfDay()); //1


        System.out.println("\n");
        Transaction second = r2.doTransaction(Day.SATURDAY, s2, 20000, 13);

        System.out.println(s2.getCountOfProduct()); //2
        System.out.println(s2.getCurrentMoney()); //21203.921

        System.out.println(r2.getCurrentMoney()); //21341.0

        System.out.println(second.getDayOfTransaction().getNumOfDay()); //6

    }


}
