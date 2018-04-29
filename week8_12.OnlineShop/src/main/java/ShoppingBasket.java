import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket
{
    private List<Purchase> purchases;

    public ShoppingBasket()
    {
        purchases = new ArrayList<Purchase>();
    }

    public void add(String product, int price)
    {
        boolean productExits = false;

        if (purchases.size() != 0)
        {
            for (Purchase item : purchases)
            {
                if (item.getProduct() == product && item.price() != -99)
                {
                    item.increaseAmount();
                    productExits = true;
                }
            }
        }

        if (productExits == false)
        {
            purchases.add(new Purchase(product, 1, price));
        }
    }

    public int price()
    {
        int totalPrice = 0;

        if (purchases.size() != 0)
        {
            for (Purchase item : purchases)
            {
                if (item.price() != -99)
                {
                    totalPrice += item.price();
                }
            }
        }

        return totalPrice;
    }

    public void print()
    {
        if (purchases.size() != 0)
        {
            for (Purchase item : purchases)
            {
                System.out.println(item.toString());
            }
        }
    }
}