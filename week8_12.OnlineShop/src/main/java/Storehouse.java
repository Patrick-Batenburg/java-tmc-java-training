import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse
{
    private Map<String, Integer> products;
    private Map<String, Integer> stocks;

    public Storehouse()
    {
        products = new HashMap<String, Integer>();
        stocks = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock)
    {
        if (product != null && price != 0)
        {
            products.put(product, price);
        }

        stocks.put(product, stock);
    }

    public int price(String product)
    {
        if (products.get(product) != null)
        {
            return products.get(product);
        }

        return -99;
    }

    public int stock(String product)
    {
        if (stocks.get(product) != null)
        {
            return stocks.get(product);
        }

        return 0;
    }

    public boolean take(String product)
    {
        if (stocks.get(product) != null)
        {
            if (stocks.get(product) != 0)
            {
                stocks.put(product, stocks.get(product) - 1);
                return true;
            }
        }

        return false;
    }

    public Set<String> products()
    {
        return products.keySet();
    }
}