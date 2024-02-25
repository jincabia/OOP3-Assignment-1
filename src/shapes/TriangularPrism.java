package shapes;

public class TriangularPrism extends Prism
{
    public TriangularPrism(double height, double side)
    {
        super(height, side);
    }

    @Override
    public double calcBaseArea()
    {
        return (getSide() * getSide()*Math.sqrt(3))/4;
    }

    @Override 
    public double calcVolume()
    {
        return calcBaseArea()*getHeight();
    }

    @Override 
    public String toString()
    {
        return "Tri Prism, Height = " + getHeight() + ", Side = " + getSide() + " Volume = " + calcVolume() + ", Base area = " + calcBaseArea();
    }
}
