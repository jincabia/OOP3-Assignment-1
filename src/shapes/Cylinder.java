package shapes;


public class Cylinder extends Shape
{
    private double radius;
    
    public Cylinder(double height, double radius)
    {
        super(height);
        this.radius = radius;
    }
    
    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }


    public double calcVolume()
    {
        // radius * radius = radius^2
        return Math.PI * this.radius * this.radius * getHeight();
    }

    public double calcBaseArea()
    {
                
        // radius * radius = radius^2
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString()
    {
        return "Cylinder, Height = "+ getHeight() + ", Radius = " + radius+ ", Volume = " + calcVolume() + ", Base area = " + calcBaseArea();
    }


}
