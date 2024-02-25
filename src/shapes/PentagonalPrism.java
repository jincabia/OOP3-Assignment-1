package shapes;

public class PentagonalPrism extends Prism
{
    public PentagonalPrism(double height, double side)
    {
        super(height, side);
    }

    @Override
    public double calcBaseArea()
    {
        return (5*getSide() * getSide()*Math.tan(54))/4;
    }

    @Override 
    public double calcVolume()
    {
        return calcBaseArea() *getHeight();
    }

    @Override 
    public String toString()
    {
        return "Penta Prism,Height = " + getHeight() + ", Side = " + getSide() + " Volume = " + calcVolume() + ", Base area = " + calcBaseArea();
    }
}
