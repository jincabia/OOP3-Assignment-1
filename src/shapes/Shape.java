package shapes;


public abstract class Shape implements Comparable<Shape>
{
    private double height;
    

    public Shape(double height){
        this.height = height;
    }

    public double getHeight()
    {
        return this.height;
    }

    public abstract double calcVolume();
    public abstract double calcBaseArea(); 

    @Override
    public int compareTo(Shape other)
    {
        if(this.height > other.height) return -1;
        if(this.height < other.height) return 1;
        return 0;


    }
    
}

