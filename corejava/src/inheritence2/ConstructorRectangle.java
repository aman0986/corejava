package inheritence2;

public class ConstructorRectangle extends ConstructorShape{
	public ConstructorRectangle() {
		
	}
	private int length = 0;
	private int width = 0;
	private int Length;
	private int Width;
	
	public ConstructorRectangle(int length,int width) {
		this.length = length;
		this.width = width;	
	}
	public void setLength(int Length) {
		this.length = Length;
	}
	public void setWidth(int Width) {
		this.width =Width;
		
	}
	public int getLength() {
		return Length;
	}
	public int getWidth() {
		return Width;
		
	}
	public void area() {
		int rarea = getLength()*getWidth();
		System.out.println("area of rectangle="+rarea);
	}

}
