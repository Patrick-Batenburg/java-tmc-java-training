import java.util.*;

public class PersonDictionary
{
    private List<Person> persons;

    public PersonDictionary()
    {
        this.persons = new ArrayList<Person>();
    }

    public void addPerson(String name, String phoneNumber)
    {
        if (personExists(name))
        {
            for (Person person : persons)
            {
                if (person.getName().equals(name))
                {
                    person.addPhoneNumber(phoneNumber);
                }
            }
        }
        else
        {
            Person person = new Person(name);
            person.addPhoneNumber(phoneNumber);
            persons.add(person);
        }
    }

    public void addAddress(String name, String street, String city)
    {
        if (personExists(name))
        {
            for (Person person : persons)
            {
                if (person.getName().equals(name))
                {
                    person.setStreet(street);
                    person.setCity(city);
                }
            }
        }
        else
        {
            Person person = new Person(name);
            person.setStreet(street);
            person.setCity(city);
            persons.add(person);
        }
    }

    public boolean personExists(String value)
    {
        boolean exists = false;

        if (persons.size() != 0)
        {
            for (Person item : persons)
            {
                if (item.getName().equals(value))
                {
                    exists = true;
                }
            }
        }

        return exists;
    }

    public String getPhoneNumberByName(String value)
    {
        String result = "  not found";

        if (personExists(value))
        {
            for (Person person : persons)
            {
                if (person.getName().equals(value))
                {
                    Set<String> phoneNumbers = person.getPhoneNumbers();

                    if (!phoneNumbers.isEmpty())
                    {
                        result = person.getPhoneNumbersAsString(1);
                    }
                }
            }
        }

        return result;
    }

    public String getNameByPhoneNumber(String value)
    {
        String result = "  not found";

        if (persons.size() != 0)
        {
            for (Person person : persons)
            {
                if (person.getPhoneNumbers().size() != 0)
                {
                    Set<String> phoneNumbers = person.getPhoneNumbers();

                    if (!phoneNumbers.isEmpty())
                    {
                        for (String phoneNumber : phoneNumbers)
                        {
                            if(phoneNumber.equals(value))
                            {
                                result = person.getName();
                            }
                        }
                    }
                }
            }
        }

        return result;
    }

    public String getInfo(String value)
    {
        String result = "";

        if (personExists(value))
        {
            for (Person person : persons)
            {
                if (person.getName().equals(value))
                {
                    String address = person.getAddress();

                    if (address.equals(" "))
                    {
                        result = "  address unknown";
                    }
                    else
                    {
                        result = address;
                    }

                    if (person.getPhoneNumbersAsString(3).equals(""))
                    {
                        result += "\nphone number not found";
                    }
                    else
                    {
                        result += person.getPhoneNumbersAsString(3);
                    }
                }
            }
        }
        else
        {
            result = "  not found";
        }

        return result;
    }

    public void removeInfo(String value)
    {
        if (personExists(value))
        {
            for (Person person : persons)
            {
                if (person.getName().equals(value))
                {
                    person.clearInfo();
                }
            }
        }
    }

    public String filteredSearch(String keyword)
    {
        List<Person> results = new ArrayList<Person>();
        String result = "";
        Collections.sort(persons);

        for(Person person : persons)
        {
            if (keyword.isEmpty())
            {
                results = persons;
            }
            else if(person.getAddress().contains(keyword) || person.getName().contains(keyword))
            {
                results.add(person);
            }
        }

        if(results.isEmpty())
        {
            System.out.println(" keyword not found");
        }
        else
        {
            for(Person person : results)
            {
                result += person.toString() + "\n";
            }
        }

        return result;
    }
}