import lombok.Setter;

public class Recipient {

    @Setter
    private double currentMoney;

    public Recipient(double currentMoney)
    {
        this.currentMoney = currentMoney;
    }


    public double getCurrentMoney()
    {
        return currentMoney;
    }

    public Transaction doTransaction(Day dayOfTransaction, Sender sender, double cost, int cntOfProduct) {

        if(cost > currentMoney)
        {
            System.out.println("Не хватает средств");
            return null;
        }
        if(sender.getCountOfProduct() < cntOfProduct)
        {
            System.out.println("У отправителя не хватает продуктов");
            return null;
        }

        sender.setCurrentMoney(sender.getCurrentMoney() + cost);
        sender.setCountOfProduct(sender.getCountOfProduct() - cntOfProduct);

        currentMoney -= cost;

        return new Transaction(dayOfTransaction, cost, this, sender);

    }
}
