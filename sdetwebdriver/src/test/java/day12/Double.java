package day12;

public class Double {

	double width, height,depth;
	
	Double ()
	{
		width=5.5;
		height=6.5;
		depth=4.5;
		
		System.out.println(width*height*depth);
	}
	
	Double (double w, double h, double d)
	{
		width=w;
		height=h;
		depth=d;
		
	}
	Double(double len)
	{
		width=height=depth=len;
	}
	double volume()
	{
		return (width*height*depth);
		
	}
	
}
