package SecondTask;

import java.util.ArrayList;


public class SecondTaskClass
{

    public double vectorLength(ArrayList<Double> vector)
    {
        if(vector.size()==4)
        {
            return Math.sqrt(Math.pow(vector.get(2)-vector.get(0),2)+Math.pow(vector.get(3)-vector.get(1),2));
        }
        else
            return -1;
    }



}
