package shapes;

public class OctagonalPrism extends Prism
{
    public OctagonalPrism(double height, double side)
    {
        super(height, side);
    }

    @Override
    public double calcBaseArea()
    {
        return 2*(1+Math.sqrt(2)) * getSide() * getSide();
    }

    @Override 
    public double calcVolume()
    {
        return calcBaseArea() *getHeight();    }

    @Override 
    public String toString()
    {
        return "Octo Prism, Height = " + getHeight() + ", Side = " + getSide() + " Volume = " + calcVolume() + ", Base area = " + calcBaseArea();
    }
}
