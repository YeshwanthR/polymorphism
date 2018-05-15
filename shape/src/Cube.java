
public class Cube extends AbstractShape {

	private double r;
	public Cube(double r) {
		// TODO Auto-generated constructor stub
	this.r=r;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 6*r*r;
	}
	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return r*r*r;
	}

}
