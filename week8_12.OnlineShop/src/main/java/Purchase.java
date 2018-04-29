public class Purchase
{
    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int amount, int unitPrice)
    {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public int price()
    {
        return unitPrice * amount;
    }

    public void increaseAmount()
    {
        amount++;
    }

    public String getProduct()
    {
        return product;
    }

    @Override
    public String toString()
    {
        return String.format("%s: %s", product, amount);
    }
}