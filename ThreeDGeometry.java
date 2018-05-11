package area;

 class TwoDGeometry {

	public void calculateSquireArea(int a)
	{
		// calculation of squire area
		System.out.println("Area of squire for given value is "+a*a);
	}
	public void calculateRectangleArea(int height,int width)
	{
		// calculation of rectangle area
		System.out.println("Area of Rectangle is :"+height*width);
	}

}
public class ThreeDGeometry extends TwoDGeometry
{
	public void calculateCubeArea(int a)
	
	{// calculation of  cube area
		System.out.println("Area of cube for given value is "+a*a*a);
	}
	public void cuboid(int lenght,int width,int height)
	{
		// calculation of cubiod area
			System.out.println("Area of cuboid for given values is "+lenght*width*height);
	}
	public static void main(String args[])
	{
		 // creating object for subclass
		ThreeDGeometry obj=new ThreeDGeometry();
		               obj.calculateSquireArea(2);
		               obj.calculateRectangleArea(20, 30);
		               obj.calculateCubeArea(2);
					   obj.calculateCuboid(2,3,4);
		
	}
	
}