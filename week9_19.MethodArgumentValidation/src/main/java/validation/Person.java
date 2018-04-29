package validation;

public class Person
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;

        if (name == null || name.length() > 40 || name == "")
        {
            throw new IllegalArgumentException();
        }

        if (age > 120 || age < 0)
        {
            throw new IllegalArgumentException();
        }
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}