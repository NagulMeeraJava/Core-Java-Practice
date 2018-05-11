package area;

public class AreaComputation {

	public void compute(ThreeDGeometry object)
	{
	   object.calculateSquireArea(2);	
	   object.calculateRectangleArea(2, 20);
	   object.calculateCubeArea(2);
	   object.calculateCuboidArea(2,3,5);
	}
	public static void main(String[] args) 
	{
		AreaComputation object=new AreaComputation();
		object.compute(new ThreeDGeometry());
		
		}

}
