package shapes;

public class Pyramid extends Prism
{
    public Pyramid(double height, double side)
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
        // return ((1/3) * getSide() * getSide() *getHeight());
        return (getSide() * getSide() *getHeight()) / 3;
    }

    @Override 
    public String toString()
    {
        return "Height = " + getHeight() + ", Side = " + getSide() + " Volume = " + calcVolume() + ", Base area = " + calcBaseArea();
    }
}
