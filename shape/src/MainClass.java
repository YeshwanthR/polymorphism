import java.util.Scanner;

public class MainClass {

	
	public static void main (String[] arg)
	{
		boolean x;
		double r,h,w,l,a,v;
		do {
			x=false;
			System.out.println("enter shape and parameters");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
        switch(str)
        {
            case "cube":
            	r=sc.nextDouble();
            	if(r<=0)
                {
               	 System.out.println("invalid parameters");
                    x=true;
                }
            	else {
               Cube c =new Cube(r);
           a=    c.getArea();
           v=  c.getVolume();
           System.out.println("surface area "+a);
           System.out.println("volume "+v);
            	}
           //System.out.println("i just clled area of a cube");
            
             
                break;
            case "cuboid":
            	l=sc.nextDouble();
            	w=sc.nextDouble();
            	h=sc.nextDouble();
            	 if(l*h*w<=0)
                 {
                	 System.out.println("invalid parameters");
                     x=true;
                 } 
            	 else {
                Cuboid cu=new Cuboid(l,w,h);
                a=cu.getArea();
                v=cu.getVolume();
                System.out.println("surface area "+a);
                System.out.println("volume "+v);
            	 }
                break;
            case "sphere":
                r=sc.nextDouble();
                
                if(r<=0)
                {
               	 System.out.println("invalid parameters");
                    x=true;
                }
                else {
                Sphere sp=new Sphere(r);
                a=sp.getArea();
               // System.out.println("Area of sphere"+ a);
                v=sp.getVolume();
                System.out.println("surface area "+a);
                System.out.println("volume "+v);

                }
               
                break;
                
                
            default:{
                System.out.println("no match");
                x=true;}
        }
		}while(x);
	}
	
	
}
