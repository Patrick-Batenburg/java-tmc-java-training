import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegister
{
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister()
    {
        owners = new HashMap<RegistrationPlate, String>();
    }

    public VehicleRegister(HashMap<RegistrationPlate, String> owners)
    {
        this.owners = owners;
    }

    public void printRegistrationPlates()
    {
        for (RegistrationPlate item : owners.keySet())
        {
            System.out.println(item);
        }
    }

    public void printOwners()
    {
        HashSet<String> valuesSet = new HashSet<String>(owners.values());

        for (String item : valuesSet)
        {
            System.out.println(item);
        }
    }

    public boolean add(RegistrationPlate plate, String owner)
    {
        if (plate == null)
        {
            return false;
        }

        if (owner == null)
        {
            return false;
        }

        if (owners.containsKey(plate))
        {
            return false;
        }
        else
        {
            owners.put(plate, owner);
        }

        return true;
    }

    public String get(RegistrationPlate plate)
    {
        if (plate == null)
        {
            return null;
        }

        if (owners.containsKey(plate))
        {
            return owners.get(plate);
        }

        return null;
    }

    public boolean delete(RegistrationPlate plate)
    {
        if (plate == null)
        {
            return false;
        }

        if (owners.containsKey(plate))
        {
            owners.remove(plate);
            return true;
        }

        return false;
    }
}