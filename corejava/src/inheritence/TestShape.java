package inheritence;
public class TestShape{
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setLength(3);
		r.setWidth(4);
		r.area();
		  
		r.setColor("red");
		System.out.println(r.getColor());
		r.setBorderwidth(10);
		System.out.println(r.getBorderwidth());
		
		Shape s = new Shape(); 
		s.setColor("pink");
		s.setBorderwidth(5);
		s.area();
		
		Shape s1 = new Rectangle();
		Shape s2 = new Circle();
		Rectangle r1 = (Rectangle) s1;
		
		r1.setLength(10);
		r1.setWidth(20);
		s1.area();
		
		Shape s3 = new Rectangle();
		Shape s4 = new Circle();
		
		Rectangle r3 = (Rectangle) s3;
		r3.setLength(10);
		r3.setWidth(20);
		s4.area();
		
		Rectangle rect = (Rectangle) s3;
		//Shape[]s = new Shape[2];
		//s[0] = new Rectangle();
		//s[1] = new Circle();
		//Rectangle r = (Rectangle) s[0];
		r.setLength(10);
		
	}
}