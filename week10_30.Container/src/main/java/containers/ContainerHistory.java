package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainerHistory
{
    private List<Double> history;

    public ContainerHistory()
    {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation)
    {
        history.add(situation);
    }

    public void reset()
    {
        history.clear();
    }

    public double maxValue()
    {
        double result = 0.0;

        if (history != null)
        {
            for (Double value : history)
            {
                if (value > result)
                {
                    result = value;
                }
            }
        }

        return Collections.max(history);
    }

    public double minValue()
    {
        return Collections.min(history);
    }

    public double average()
    {
        double result = 0.0;
        double amount = history.size();

        if (!history.isEmpty())
        {
            for (Double value : history)
            {
                result += value;
            }
        }

        return result / amount;
    }

    public double greatestFluctuation()
    {
        double result = 0.0;

        if (history != null)
        {
            if (history.size() > 1)
            {
                int index = 0;

                for (Double value : history)
                {
                    double temp = this.history.get(index + 1);
                    double max = Math.abs(value - temp);

                    if(max > result)
                    {
                        result = max;
                    }

                    index++;

                    if(index >= this.history.size() - 1)
                    {
                        break;
                    }
                }
            }
        }

        return result;
    }

    public double variance()
    {
        double result = 0.0;
        double amount = history.size();

        if (history.size() > 1)
        {
            double average = average();

            for (Double value : history)
            {
                result += (value - average) * (value - average);
            }
        }

        return result / (amount - 1);
    }

    @Override
    public String toString()
    {
        return history.toString();
    }
}