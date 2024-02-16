package shapes;

public class SquarePrism extends Prism
{
    public SquarePrism(double height, double side)
    {
        super(height, side);
    }

    @Override
    public double calcBaseArea()
    {
        return getSide() * getSide();
    }

    @Override 
    public double calcVolume()
    {
        return getSide() * getSide() *getHeight();
    }

    @Override 
    public String toString()
    {
        return "Height = " + getHeight() + ", Side = " + getSide() + " Volume = " + calcVolume() + ", Base area = " + calcBaseArea();
    }

}
