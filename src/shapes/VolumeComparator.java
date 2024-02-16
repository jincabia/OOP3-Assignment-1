package shapes;

import java.util.Comparator;

public class VolumeComparator implements Comparator<Shape> {

    public int compare (Shape s1, Shape s2)
    {
        int volCompare = 0;
        if (s1.calcVolume() < s2.calcVolume()) return 1;
        if (s1.calcVolume() > s2.calcVolume()) return -1;
        return volCompare;
        

    }
    
}



