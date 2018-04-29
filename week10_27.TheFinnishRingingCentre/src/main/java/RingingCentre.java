import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre
{
    private Map<Bird, List<String>> observationPlaces;

    public RingingCentre()
    {
        observationPlaces = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place)
    {
        List<String> placesList = observationPlaces.get(bird);

        if(placesList == null)
        {
            placesList = new ArrayList<String>();
            placesList.add(place);
            observationPlaces.put(bird, placesList);
        }
        else
        {
            if(!placesList.contains(place))
            {
                placesList.add(place);
                observationPlaces.put(bird, placesList);
            }
        }

    }

    public void observations(Bird bird)
    {
        List<String> placesList = observationPlaces.get(bird);

        if(placesList != null)
        {
            System.out.println(bird.toString() + " observations: " + placesList.size());

            for (String place : placesList)
            {
                System.out.println(place);
            }
        }
        else
        {
            System.out.println(bird.toString() + " observations: 0");
        }
    }
}