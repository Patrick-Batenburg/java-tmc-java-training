import java.util.HashSet;
import java.util.Set;

public class Person implements Comparable<Person>
{
    private String name;
    private Set<String> phoneNumbers;
    private String street;
    private String city;

    public Person(String name)
    {
        this.name = name;
        this.phoneNumbers = new HashSet<String>();
        this.street = "";
        this.city = "";
    }

    public void addPhoneNumber(String value)
    {
        phoneNumbers.add(value);
    }

    public void clearInfo()
    {
        phoneNumbers.clear();
        street = "";
        city = "";
    }

    @Override
    public int compareTo(Person person)
    {
        return this.name.compareTo(person.getName());
    }

    @Override
    public String toString()
    {
        String address = getAddress();
        String phoneNumbers = getPhoneNumbersAsString(3);

        if (address.equals(" "))
        {
            address = "address unknown";
        }
        else
        {
            address = "  address: " + address;
        }

        if (phoneNumbers.equals(""))
        {
            phoneNumbers = "  phone number not found";
        }
        else
        {
            phoneNumbers = "  phone numbers:\n" + phoneNumbers;
        }

        return name + "\n" + address + "\n" + phoneNumbers;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Set<String> getPhoneNumbers()
    {
        return phoneNumbers;
    }

    public String getPhoneNumbersAsString(int spaceIndent)
    {
        String phoneNumbers = "";

        if (this.phoneNumbers.size() != 0)
        {
            int index = 0;

            for (String phoneNumber : getPhoneNumbers())
            {
                for (int i = 0; i < spaceIndent; i++)
                {
                    phoneNumbers += " ";
                }

                phoneNumbers += phoneNumber;

                if(index++ != getPhoneNumbers().size() - 1)
                {
                    phoneNumbers += "\n";

                }
            }
        }

        return phoneNumbers;
    }

    public void setPhoneNumbers(Set<String> phoneNumbers)
    {
        this.phoneNumbers = phoneNumbers;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getAddress()
    {
        return street + " " + city;
    }
}