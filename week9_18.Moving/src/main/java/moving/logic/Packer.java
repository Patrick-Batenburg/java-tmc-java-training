package moving.logic;

import moving.domain.Thing;
import moving.domain.Box;

import java.util.ArrayList;
import java.util.List;

public class Packer
{
    private int boxesVolume;

    public Packer(int boxesVolume)
    {
        this.boxesVolume = boxesVolume;

    }

    public List<Box> packThings(List<Thing> things)
    {
        List<Box> boxes = new ArrayList<Box>();

        for (Thing item : things)
        {

            Box box = new Box(boxesVolume);
            box.addThing(item);
            boxes.add(box);
        }



        return boxes;
    }
}