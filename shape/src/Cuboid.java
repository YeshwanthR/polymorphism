
public class Cuboid extends AbstractShape {

	private double l,h,w;
	
	
	public Cuboid(double l2, double w2, double h2) {
		// TODO Auto-generated constructor stub
		this.l=l;
		this.w=w;
		this.h=h;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (2*l*w)+(2*l*h)+(2*h*w);
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return l*w*h;
	}

}
