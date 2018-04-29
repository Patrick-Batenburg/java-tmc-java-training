package farmsimulator;

public class Main
{
    public static void main(String[] args)
    {
        Barn barn = new Barn(new BulkTank());
        Cow cow = new Cow("Pekka");
        barn.takeCareOf(cow);
    }
}