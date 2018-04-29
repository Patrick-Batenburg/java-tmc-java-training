package people;

public class Student extends Person
{
    private int credit;

    public Student(String name, String address)
    {
        super(name, address);
        credit = 0;
    }

    public void study()
    {
        credit++;
    }

    public int credits()
    {
        return credit;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n  credits " + credit;
    }
}