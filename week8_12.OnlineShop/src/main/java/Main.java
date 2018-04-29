public class Main
{
    public static void main(String[] args)
    {
        Storehouse store = new Storehouse();
        store.addProduct("coffee", 5, 10);
        System.out.println("sugar: " + store.price("sugar"));

        Purchase purchase = new Purchase("milk", 4, 2);
        System.out.println("the total price of a purchase containing four milks is " + purchase.price());
        System.out.println(purchase);
        purchase.increaseAmount();
        System.out.println(purchase);
    }
}