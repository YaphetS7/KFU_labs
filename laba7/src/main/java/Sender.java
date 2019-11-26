import lombok.Setter;

public class Sender {

    @Setter
    private int countOfProduct;
    @Setter
    private double currentMoney;

    public Sender(int countOfProduct, double currentMoney)
    {
        this.countOfProduct = countOfProduct;
        this.currentMoney = currentMoney;
    }

    public int getCountOfProduct()
    {
        return  countOfProduct;
    }

    public double getCurrentMoney()
    {
        return currentMoney;
    }

    public Transaction doTransaction(Day dayOfTransaction, Recipient recipient, double income, int cntOfProduct) {

        if(recipient.getCurrentMoney() < income)
        {
            System.out.println("У получателя не хватает средств");
            return null;
        }

        if(cntOfProduct > countOfProduct)
        {
            System.out.println("У отправителя не хватает продуктов на скаладе");
            return null;
        }

        recipient.setCurrentMoney(recipient.getCurrentMoney() - income);

        countOfProduct -= cntOfProduct;

        currentMoney += income;

        return new Transaction(dayOfTransaction, income, recipient, this);

    }
}

