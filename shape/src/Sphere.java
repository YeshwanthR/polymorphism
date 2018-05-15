
public class Sphere extends AbstractShape {

	private double r;
	private final double pi=3.14;
	public Sphere( double r)
	{
		this.r=r;
	}


	@Override
	public double getArea() {
		// TODO Auto-genera'ted method stub
		//System.out.println("In get area of a sphere. I am returning "+4*Math.PI*this.r*this.r);
		return 4*Math.PI*this.r*this.r;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return (4/3)*pi*r*r*r;
	}
	
}
